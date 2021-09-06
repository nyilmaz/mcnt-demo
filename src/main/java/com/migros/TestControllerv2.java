package com.migros;

import com.migros.generatedapi.api.v2.DefaultApi;
import com.migros.generatedapi.api.v2.Price;
import com.migros.generatedapi.api.v2.PricingResult;
import com.migros.generatedapi.api.v2.PricingResultProductPricingResult;
import com.migros.generatedapi.model.CurrencyCode;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import java.math.BigDecimal;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * @author nyilmaz
 */
@Controller("/test-api-v2")
public class TestControllerv2 {

  private final DefaultApi defaultApi;

  public TestControllerv2(DefaultApi defaultApi) {
    this.defaultApi = defaultApi;
  }

  @Get("/pricings/pricing/{productId}")
  public Mono<PricingResult> testGet2(@PathVariable Long productId) {
    var pricingResult = new PricingResult();
    var v1 = new PricingResultProductPricingResult();
    v1.setPrice(new Price().currency(CurrencyCode.EUR).amount(new BigDecimal("4.3")));
    v1.setCost(new Price().currency(CurrencyCode.EUR).amount(new BigDecimal("2.3")));
    v1.setTaxIncluded(true);
    pricingResult.setProductPricingResult(Map.of("UA", v1));
    return Mono.just(pricingResult);
  }

  @Get("/test")
  public void test() {
    var pricingResult = defaultApi.getProductPricing(123L).blockFirst();
    System.out.println(pricingResult);
  }

}
