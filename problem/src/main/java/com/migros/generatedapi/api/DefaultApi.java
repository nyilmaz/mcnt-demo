package com.migros.generatedapi.api;


  import com.migros.generatedapi.model.PricingResultDto;
  import java.util.ArrayList;
  import java.util.HashMap;
  import java.util.List;
  import java.util.Map;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Client(id="test-generated")
public interface DefaultApi {
  /**
  *
  *
    * @param productId  (required)
    * @param locationId  (required)
  * @return Flux&lt;Object&gt;
  */
  @Delete("/pricing/{productId}/locations/{locationId}")
  Flux<Object> deleteProductLocalPricing(
    @PathVariable("productId") Long productId
    ,

    @PathVariable("locationId") Long locationId

    );
  /**
  *
  *
    * @param productId  (required)
    * @param locationId  (required)
  * @return Flux&lt;PricingResultDto&gt;
  */
  @Get("/pricing/{productId}/locations/{locationId}")
  Flux<PricingResultDto> getProductLocalPricing(
    @PathVariable("productId") Long productId
    ,

    @PathVariable("locationId") Long locationId

                                               );
  /**
  *
  *
    * @param productId  (required)
  * @return Flux&lt;Map&lt;String, PricingResultDto&gt;&gt;
  */
  @Get("/pricing/{productId}/locations")
  Flux<Map<String, PricingResultDto>> getProductLocalPricings(
    @PathVariable("productId") Long productId

    );
  /**
  *
  *
    * @param productId  (required)
  * @return Flux&lt;Map&lt;String, PricingResultDto&gt;&gt;
  */
  @Get("/pricing/{productId}")
  Flux<Map<String, PricingResultDto>> getProductPricing(
    @PathVariable("productId") Long productId

    );
  /**
  *
  *
    * @param productId  (required)
    * @param locationId  (required)
    * @param body  (required)
  * @return Flux&lt;PricingResultDto&gt;
  */
  @Put("/pricing/{productId}/locations/{locationId}")
  Flux<PricingResultDto> upsertProductLocalPricing(
    @PathVariable("productId") Long productId
    ,

    @PathVariable("locationId") Long locationId
    ,

    @Body Object body

    );
  /**
  *
  *
    * @param productId  (required)
    * @param body  (required)
  * @return Flux&lt;Map&lt;String, PricingResultDto&gt;&gt;
  */
  @Put("/pricing/{productId}")
  Flux<Map<String, PricingResultDto>> upsertProductPricing(
    @PathVariable("productId") Long productId
    ,

    @Body Object body

    );
  }
