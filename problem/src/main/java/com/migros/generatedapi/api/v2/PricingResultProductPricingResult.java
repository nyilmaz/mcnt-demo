package com.migros.generatedapi.api.v2;

import java.util.Objects;

public class PricingResultProductPricingResult {
    private Price price;
    private Price offer;
    private Price cost;
    private Boolean taxIncluded;

    public PricingResultProductPricingResult() {
    }

    public PricingResultProductPricingResult price(Price price) {
        this.price = price;
        return this;
    }

    public Price getPrice() {
        return this.price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public PricingResultProductPricingResult offer(Price offer) {
        this.offer = offer;
        return this;
    }

    public Price getOffer() {
        return this.offer;
    }

    public void setOffer(Price offer) {
        this.offer = offer;
    }

    public PricingResultProductPricingResult cost(Price cost) {
        this.cost = cost;
        return this;
    }

    public Price getCost() {
        return this.cost;
    }

    public void setCost(Price cost) {
        this.cost = cost;
    }

    public PricingResultProductPricingResult taxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
        return this;
    }

    public Boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            PricingResultProductPricingResult pricingResultProductPricingResult = (PricingResultProductPricingResult)o;
            return Objects.equals(this.price, pricingResultProductPricingResult.price) && Objects.equals(this.offer, pricingResultProductPricingResult.offer) && Objects.equals(this.cost, pricingResultProductPricingResult.cost) && Objects.equals(this.taxIncluded, pricingResultProductPricingResult.taxIncluded);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.price, this.offer, this.cost, this.taxIncluded});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PricingResultProductPricingResult {\n");
        sb.append("    price: ").append(this.toIndentedString(this.price)).append("\n");
        sb.append("    offer: ").append(this.toIndentedString(this.offer)).append("\n");
        sb.append("    cost: ").append(this.toIndentedString(this.cost)).append("\n");
        sb.append("    taxIncluded: ").append(this.toIndentedString(this.taxIncluded)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}