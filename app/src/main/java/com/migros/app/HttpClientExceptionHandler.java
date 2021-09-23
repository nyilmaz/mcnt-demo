package com.migros.app;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.http.hateoas.JsonError;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import java.util.Optional;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zalando.problem.DefaultProblem;

/**
 * @author nyilmaz
 */
@Produces
@Singleton
public class HttpClientExceptionHandler implements ExceptionHandler<HttpClientResponseException, HttpResponse<?>> {

  private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientExceptionHandler.class);

  public static final String APPLICATION_PROBLEM_JSON = "application/problem+json";

  @Override
  public HttpResponse<?> handle(HttpRequest request, HttpClientResponseException exception) {
    HttpResponse<?> response = exception.getResponse();
    Optional<String> optionalContentType = response.getHeaders().getContentType();
    if (optionalContentType.isPresent() && APPLICATION_PROBLEM_JSON.equals(optionalContentType.get())) {
      LOGGER.info("---***---");
      LOGGER.info(response.getBody(JsonError.class).toString());
      LOGGER.info(response.getBody(DefaultProblem.class).toString());
      LOGGER.info("---***---");
    }
    exception.printStackTrace();
    return response;
  }
}
