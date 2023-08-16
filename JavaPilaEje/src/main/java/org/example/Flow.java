package org.example;

public class Flow {

    public static void main(String[] args) {
        System.out.println("Start Home");
        try {
            method1();
        } catch (MyException | ArithmeticException me) {
            System.out.println(me.getMessage());
            me.printStackTrace();
        }

        System.out.println("End Home");
    }

    public static void method1() throws MyException {
        System.out.println("Start of method 1");
        method2();


        System.out.println("End of method 1");
    }

    public static void method2() throws MyException {
        System.out.println("Start of method 2");
        /*for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            try {
                if(i == 3){
                    int num = 0;
                    int result = i/num;
                    System.out.println("result -> " + result);
                }
                String test = null;
                System.out.println(test.toString());
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }*//*catch (NullPointerException n){
                System.out.println(n.getMessage());
            }*//*
        }*/
        // throw new ArithmeticException();
        int number = 50 / 0;
        Account account = null;
        account.deposit();
        throw new MyException("My exception was launched");
    }


}
