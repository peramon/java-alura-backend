package org.bytebank.model;

import org.bytebank.model.Account;

public class SavingAccount extends Account {
    public SavingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }
}
