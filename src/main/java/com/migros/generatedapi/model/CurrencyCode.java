package com.migros.generatedapi.model;

import java.util.Objects;

/**
* Gets or Sets CurrencyCode
*/
public enum CurrencyCode {

  USD("USD"),
  
  CAD("CAD"),
  
  EUR("EUR"),
  
  GBP("GBP");

private String value;

CurrencyCode(String value) {
this.value = value;
}

public String getValue() {
return value;
}

@Override
public String toString() {
return String.valueOf(value);
}


public static CurrencyCode fromValue(String value) {
for (CurrencyCode b : CurrencyCode.values()) {
if (b.value.equals(value)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + value + "'");
}
}
