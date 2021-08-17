package com.migros.generatedapi.model;

import java.util.Objects;
  import java.math.BigDecimal;

/**
* AmountDto
*/
@javax.annotation.Generated(value = "MicronautClientCodegen", date = "2021-08-17T16:12:57.041579+03:00")
public class AmountDto  {
private BigDecimal amount;

private CurrencyCode currency;

public AmountDto amount(BigDecimal amount) {
this.amount = amount;
return this;
}

/**
* Get amount
* @return amount
**/

public BigDecimal getAmount() {
return amount;
}

public void setAmount(BigDecimal amount) {
this.amount = amount;
}

public AmountDto currency(CurrencyCode currency) {
this.currency = currency;
return this;
}

/**
* Get currency
* @return currency
**/

public CurrencyCode getCurrency() {
return currency;
}

public void setCurrency(CurrencyCode currency) {
this.currency = currency;
}



@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
AmountDto amountDto = (AmountDto) o;
return Objects.equals(this.amount, amountDto.amount) &&
  Objects.equals(this.currency, amountDto.currency);
}

@Override
public int hashCode() {
return Objects.hash(amount, currency);
}


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class AmountDto {\n");

sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}

