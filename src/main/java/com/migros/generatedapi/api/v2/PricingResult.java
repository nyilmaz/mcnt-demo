package com.migros.generatedapi.api.v2;

import java.util.Map;
import java.util.Objects;

public class PricingResult {
    private Map<String, PricingResultProductPricingResult> productPricingResult;

    public PricingResult() {
    }

    public PricingResult productPricingResult(Map<String, PricingResultProductPricingResult> productPricingResult) {
        this.productPricingResult = productPricingResult;
        return this;
    }

    public Map<String, PricingResultProductPricingResult> getProductPricingResult() {
        return this.productPricingResult;
    }

    public void setProductPricingResult(Map<String, PricingResultProductPricingResult> productPricingResult) {
        this.productPricingResult = productPricingResult;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            PricingResult pricingResult = (PricingResult)o;
            return Objects.equals(this.productPricingResult, pricingResult.productPricingResult);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.productPricingResult});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PricingResult {\n");
        sb.append("    productPricingResult: ").append(this.toIndentedString(this.productPricingResult)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}