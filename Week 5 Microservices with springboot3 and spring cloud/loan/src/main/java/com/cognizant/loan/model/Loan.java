package com.cognizant.loan.model;

public class Loan {
    private String number;
    private double amount;
    private String type;

    public Loan() {}

    public Loan(String number, double amount, String type) {
        this.number = number;
        this.amount = amount;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
