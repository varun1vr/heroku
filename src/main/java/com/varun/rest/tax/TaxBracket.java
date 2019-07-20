package com.varun.rest.tax;

public class TaxBracket {
    private float taxPercent;
    private float startAmount;
    private float endAmount;
    private float tax;
    private float amount;

    public TaxBracket(float taxPercent, float startAmount, float endAmount) {
        this.taxPercent = taxPercent;
        this.startAmount = startAmount;
        this.endAmount = endAmount;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    public float getAmount() {
        return (this.tax*100/this.taxPercent);
    }

    public TaxBracket(float taxPercent, float startAmount, float endAmount, float tax, float amount) {
        this.taxPercent = taxPercent;
        this.startAmount = startAmount;
        this.endAmount = endAmount;
        this.tax = tax;
        this.amount = amount;
    }

    public float getTax(){
        return ((this.endAmount - this.startAmount) * (this.taxPercent / 100));
    }
    public float getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(float taxPercent) {
        this.taxPercent = taxPercent;
    }

    public float getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(float startAmount) {
        this.startAmount = startAmount;
    }

    public float getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(float endAmount) {
        this.endAmount = endAmount;
    }
}
