package com.migros;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(
    title = "mcnt-nuri",
    version = "0.1",
    description = "MCNT API"
))
public class Application {

  public static void main(String[] args) {
    Micronaut.run(Application.class, args);
  }
}
