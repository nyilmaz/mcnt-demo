package com.migros;

import com.migros.generatedapi.api.DefaultApi;
import com.migros.generatedapi.model.AmountDto;
import com.migros.generatedapi.model.CurrencyCode;
import com.migros.generatedapi.model.PricingResultDto;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

/**
 * @author nyilmaz
 */
@Controller("/test-api")
public class TestController {

  //private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
  //
  //private final DefaultApi defaultApi;
  //
  //public TestController(DefaultApi defaultApi) {
  //  this.defaultApi = defaultApi;
  //}
  //
  //@Get
  //public void testGet() {
  //  var stringPricingResultDtoMap = defaultApi.getProductPricing(123L).blockLast();
  //  var test1 = stringPricingResultDtoMap.get("test1");
  //  LOGGER.info(test1.toString());
  //}
  //
  //@Get("/pricing/{productId}")
  //public Mono<Map<String, PricingResultDto>> getSearchResponse(@PathVariable Long productId) {
  //  return Mono.just(Map.of("test1", new PricingResultDto().price(new AmountDto().currency(CurrencyCode.EUR)),
  //                          "test2", new PricingResultDto().price(new AmountDto().currency(CurrencyCode.USD))));
  //}
}
