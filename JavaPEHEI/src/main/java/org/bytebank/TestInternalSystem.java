package org.bytebank;

public class TestInternalSystem {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Paul");


        Administrator administrator = new Administrator();
        administrator.setName("Carlos");

        Manager manager = new Manager();
        manager.setName("Karla");

        System.out.println("Customer: " + customer.getName()
                + " \nAdmin: " + administrator.getName() + "\nSystem: " + manager.getName());
    }
}
