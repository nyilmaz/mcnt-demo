package com.migros.generatedapi.api.v2;

import com.migros.generatedapi.model.CurrencyCode;
import java.math.BigDecimal;
import java.util.Objects;

public class Price {
    private BigDecimal amount;
    private CurrencyCode currency;

    public Price() {
    }

    public Price amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Price currency(CurrencyCode currency) {
        this.currency = currency;
        return this;
    }

    public CurrencyCode getCurrency() {
        return this.currency;
    }

    public void setCurrency(CurrencyCode currency) {
        this.currency = currency;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Price price = (Price)o;
            return Objects.equals(this.amount, price.amount) && Objects.equals(this.currency, price.currency);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.amount, this.currency});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Price {\n");
        sb.append("    amount: ").append(this.toIndentedString(this.amount)).append("\n");
        sb.append("    currency: ").append(this.toIndentedString(this.currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}