package com.migros;

import com.migros.generatedapi.api.v2.DefaultApi;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

@MicronautTest
class McntDemoTest {

    @Inject
    EmbeddedServer application;

    @Inject
    DefaultApi defaultApi;

    @Test
    void testItWorks() {

        Assertions.assertTrue(application.isRunning());

        Flux<String> productPricing = defaultApi.getProductPricing(12L);
        String s = productPricing.blockFirst();
        System.out.println(s);
    }

}
