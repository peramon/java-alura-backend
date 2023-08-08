package org.bytebank;

public class TestAccount {
    public static void main(String[] args) {
        CurrentAccount accountCurrent = new CurrentAccount(1,1);
        SavingAccount savingAccount = new SavingAccount(2,3);

        accountCurrent.deposit(2000.00);
        accountCurrent.transfer(1000.00, savingAccount);

        System.out.println(accountCurrent.getBalanace());
        System.out.println(savingAccount.getBalanace());
    }
}
