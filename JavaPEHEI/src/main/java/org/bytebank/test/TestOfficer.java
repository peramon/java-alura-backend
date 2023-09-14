package org.bytebank.test;

import org.bytebank.model.Counter;
import org.bytebank.model.Officer;

public class TestOfficer {
    public static void main(String[] args) {
        Officer jose = new Counter();
        jose.setName("Jose");
        jose.setIdentityCard("12009853245");
        jose.setSalary(1200.00);
        jose.setType(0);

        double bonus = jose.getBonus();

        System.out.println("salary: " + jose.getSalary());
        System.out.println("bonus: " + bonus);
    }
}
