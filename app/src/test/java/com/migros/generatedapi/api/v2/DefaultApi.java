package com.migros.generatedapi.api.v2;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import org.zalando.problem.DefaultProblem;
import reactor.core.publisher.Flux;

@Client(
    id = "pricings",
    errorType = DefaultProblem.class
)
public interface DefaultApi {

    @Get("/test1/{productId}")
    Flux<String> getProductPricing(@PathVariable("productId") Long productId);

    @Get("/test2/{productId}")
    String getBlockingProductPricing(@PathVariable("productId") Long productId);
}