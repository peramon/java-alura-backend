package org.example;

public class AccountExceptionCheckTest {
    public static void main(String[] args) {

        Account account = new Account();
        try {
            account.deposit();
        } catch (MyException e) {
            System.out.println("Exception detected: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
