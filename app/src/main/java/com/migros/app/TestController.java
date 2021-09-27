package com.migros.app;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.problem.HttpStatusType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zalando.problem.Problem;
import reactor.core.publisher.Mono;

/**
 * @author nyilmaz
 */
@Controller("/")
public class TestController {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

  // actual api
  @Get("/test1/{productId}")
  public Mono<String> testGet2(@PathVariable Long productId) {
    throw Problem.builder()
                 .withDetail("problem detail")
                 .withTitle("serious problem")
                 .withStatus(new HttpStatusType(HttpStatus.INTERNAL_SERVER_ERROR))
                 .build();
  }
  // actual api
  @Get("/test2/{productId}")
  public String testGet3(@PathVariable Long productId) {
    throw Problem.builder()
                 .withDetail("problem detail")
                 .withTitle("serious problem")
                 .withStatus(new HttpStatusType(HttpStatus.INTERNAL_SERVER_ERROR))
                 .build();
  }
}
