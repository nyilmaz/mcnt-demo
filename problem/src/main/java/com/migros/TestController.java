package com.migros;

import com.migros.generatedapi.api.v2.DefaultApi;
import com.migros.generatedapi.api.v2.Price;
import com.migros.generatedapi.api.v2.PricingResult;
import com.migros.generatedapi.api.v2.PricingResultProductPricingResult;
import com.migros.generatedapi.model.CurrencyCode;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.http.hateoas.JsonError;
import io.micronaut.problem.HttpStatusType;
import java.math.BigDecimal;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zalando.problem.DefaultProblem;
import org.zalando.problem.Problem;
import reactor.core.publisher.Mono;

/**
 * @author nyilmaz
 */
@Controller("/test-api-v2")
public class TestController {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

  private final DefaultApi defaultApi;

  public TestController(DefaultApi defaultApi) {
    this.defaultApi = defaultApi;
  }

  // actual api
  @Get("/pricings/pricing/{productId}")
  public Mono<PricingResult> testGet2(@PathVariable Long productId) {
    var pricingResult = new PricingResult();
    var v1 = new PricingResultProductPricingResult();
    v1.setPrice(new Price().currency(CurrencyCode.EUR).amount(new BigDecimal("4.3")));
    v1.setCost(new Price().currency(CurrencyCode.EUR).amount(new BigDecimal("2.3")));
    v1.setTaxIncluded(true);
    pricingResult.setProductPricingResult(Map.of("UA", v1));
    throw Problem.builder()
                 .withDetail("problem detail")
                 .withTitle("serious problem")
                 .withStatus(new HttpStatusType(HttpStatus.INTERNAL_SERVER_ERROR))
                 .build();
  }

  // to test @Client
  @Get("/test")
  public void test() {
    var pricingResult = defaultApi.getProductPricing(123L)
                                  .onErrorMap(e -> {
                                    if (e instanceof HttpClientResponseException) {
                                      HttpClientResponseException ex = (HttpClientResponseException) e;
                                      LOGGER.info(ex.getResponse().getBody(JsonError.class).toString());
                                      LOGGER.info(ex.getResponse().getBody(DefaultProblem.class).toString());
                                    }
                                    return Problem.builder().build();
                                  })
                                  .doOnError(HttpClientResponseException.class, ex -> {
                                    LOGGER.info(ex.getResponse().getBody(DefaultProblem.class).toString());
                                  }).blockFirst();
    System.out.println(pricingResult);
  }
}
