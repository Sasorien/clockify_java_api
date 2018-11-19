package de.clockify.java.api.objects;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class HourlyRateRequest
{
    private Integer amount;
    private String currency;

    public HourlyRateRequest(Integer amount, String currency)
    {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "HourlyRateDTO{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourlyRateRequest that = (HourlyRateRequest) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(amount, currency);
    }

    public Integer getAmount()
    {
        return amount;
    }

    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }
}
