package org.bytebank;

public class TestReferences {
    public static void main(String[] args) {

        // The more general element can be adapted to the more specific one.

        Officer officer = new Manager();
        officer.setName("Julio");
        officer.setSalary(2000.00);

        Manager manager = new Manager();
        manager.setName("Andres");
        manager.setSalary(3000.00);

        System.out.println(officer.toString());
        System.out.println(manager.toString());

    }
}
