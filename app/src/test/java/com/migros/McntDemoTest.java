package com.migros;

import com.migros.app.Application;
import com.migros.app.TestController;
import com.migros.generatedapi.api.v2.DefaultApi;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

@MicronautTest(propertySources = "classpath:application-test.yml", application = Application.class,
               packages = "com.migros.app")
class McntDemoTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

  @Inject
  DefaultApi defaultApi;

  @Test
  void testItWorks() {

    Flux<String> productPricing = defaultApi.getProductPricing(12L);
    String s = productPricing
        //.doOnError(e -> {
        //  if (e instanceof HttpClientResponseException) {
        //    HttpResponse<?> response = ((HttpClientResponseException) e).getResponse();
        //    var body = response.getBody(DefaultProblem.class);
        //    LOGGER.info(body.toString());
        //  }
        //})
        .blockFirst();
    LOGGER.info(s);
  }
}