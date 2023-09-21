package org.bytebank.model;

// entity account
public abstract class Account {
    // variables for account data
    // protected is used to allow the child classes to access a variable
    protected Double balance = 0.0;
    private int agency = 1, number;
    private Customer holder = new Customer();

    // Counting accounts, variable class
    // Is not alterable by the instance
    private static int total = 0;

    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
        System.out.println("I created a account -> " + this.number);

        Account.total++;
    }

    // public -> Access modifier
    public abstract void deposit(double value);

    public void withdraw(double value) {
        // return this.balance - value;
        try{
            if (this.balance >= value) {
                this.balance -= value;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public boolean transfer(double value, Account account) {
        if (this.balance >= value) {
            this.withdraw(value);
            account.deposit(value);
            return true;
        }
        return false;
    }

    public double getBalanace() {
        return this.balance;
    }

    public void setBalanace(double value) {
        this.balance = value;
    }

    // agency
    public void setAgency(int value) {
        if (value > 0) {
            this.agency = value;
        } else {
            System.out.println("Agency invalid number");
        }
    }

    public int getAgency() {
        return this.agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Customer getHolder() {
        return holder;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }

    public static int getTotal() {
        return Account.total;
    }
}

