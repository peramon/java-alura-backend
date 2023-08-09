package org.bytebank;

public class TestBonusControl {
    public static void main(String[] args) {
        Officer paolo = new Counter();
        paolo.setSalary(2000.00);

        Manager karla = new Manager();
        karla.setSalary(1000.00);

        Counter samy = new Counter();
        samy.setSalary(2500.00);

        BonusControl bonusControl = new BonusControl();

        bonusControl.registerSalary(paolo);
        bonusControl.registerSalary(karla);
        bonusControl.registerSalary(samy);
    }
}
