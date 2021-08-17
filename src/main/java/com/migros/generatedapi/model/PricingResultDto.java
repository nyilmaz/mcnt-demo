package com.migros.generatedapi.model;

import java.util.Objects;

/**
* PricingResultDto
*/
@javax.annotation.Generated(value = "MicronautClientCodegen", date = "2021-08-17T16:12:57.041579+03:00")
public class PricingResultDto  {
private AmountDto price;

private AmountDto offer;

private AmountDto cost;

private Boolean taxIncluded;

public PricingResultDto price(AmountDto price) {
this.price = price;
return this;
}

/**
* Get price
* @return price
**/

public AmountDto getPrice() {
return price;
}

public void setPrice(AmountDto price) {
this.price = price;
}

public PricingResultDto offer(AmountDto offer) {
this.offer = offer;
return this;
}

/**
* Get offer
* @return offer
**/

public AmountDto getOffer() {
return offer;
}

public void setOffer(AmountDto offer) {
this.offer = offer;
}

public PricingResultDto cost(AmountDto cost) {
this.cost = cost;
return this;
}

/**
* Get cost
* @return cost
**/

public AmountDto getCost() {
return cost;
}

public void setCost(AmountDto cost) {
this.cost = cost;
}

public PricingResultDto taxIncluded(Boolean taxIncluded) {
this.taxIncluded = taxIncluded;
return this;
}

/**
* Get taxIncluded
* @return taxIncluded
**/

public Boolean getTaxIncluded() {
return taxIncluded;
}

public void setTaxIncluded(Boolean taxIncluded) {
this.taxIncluded = taxIncluded;
}



@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
PricingResultDto pricingResultDto = (PricingResultDto) o;
return Objects.equals(this.price, pricingResultDto.price) &&
  Objects.equals(this.offer, pricingResultDto.offer) &&
  Objects.equals(this.cost, pricingResultDto.cost) &&
  Objects.equals(this.taxIncluded, pricingResultDto.taxIncluded);
}

@Override
public int hashCode() {
return Objects.hash(price, offer, cost, taxIncluded);
}


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class PricingResultDto {\n");

sb.append("    price: ").append(toIndentedString(price)).append("\n");
sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
sb.append("    taxIncluded: ").append(toIndentedString(taxIncluded)).append("\n");
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

