package org.bytebank;

public class TestManager {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setSalary(500.00);

        // Officer manager = new Officer();
        manager.setSalary(2000.00);
        manager.setType(1);
        manager.setName("Rodrigo");

        System.out.println("Manager -> " + manager.getBonus());
        System.out.println("Name -> " + manager.getName());

        // Try Key
        manager.setKey("Alura");
        boolean key = manager.logIn("Alura");
        System.out.println(key);

    }
}
