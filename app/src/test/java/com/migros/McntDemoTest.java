package com.migros;

import com.migros.app.Application;
import com.migros.generatedapi.api.v2.DefaultApi;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(propertySources = "classpath:application-test.yml", application = Application.class,
               packages = "com.migros.app")
class McntDemoTest {

  @Inject
  DefaultApi defaultApi;

  @Test
  void testNonBlocking() {
    try {
      defaultApi.getBlockingProductPricing(12L);
    } catch (HttpClientResponseException e) {
      assertTrue(e.getResponse().getBody().isPresent());
    }
  }

  @Test
  void testBlocking() {
    try {
      defaultApi.getProductPricing(12L).blockFirst();
    } catch (HttpClientResponseException e) {
      assertTrue(e.getResponse().getBody().isPresent());
    }
  }
}