package org.bytebank;

public class CurrentAccount extends Account{


    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public boolean withdraw(double value) {
        double commission = 0.2;
        return super.withdraw(value+commission);
    }

}
