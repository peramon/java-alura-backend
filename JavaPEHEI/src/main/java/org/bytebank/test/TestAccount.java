package org.bytebank.test;

import org.bytebank.model.CurrentAccount;
import org.bytebank.model.SavingAccount;

public class TestAccount {
    public static void main(String[] args) {
        CurrentAccount accountCurrent = new CurrentAccount(1,1);
        SavingAccount savingAccount = new SavingAccount(2,3);

        accountCurrent.deposit(2000.00);
        accountCurrent.transfer(1000.00, savingAccount);
//        accountCurrent.withdraw(2000.00); Trying the exception

        System.out.println(accountCurrent.getBalanace());
        System.out.println(savingAccount.getBalanace());
    }
}
