package com.cognizant.account.model;

public class Account {
    private String number;
    private double balance;
    private String type;

    public Account() {}

    public Account(String number, double balance, String type) {
        this.number = number;
        this.balance = balance;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
