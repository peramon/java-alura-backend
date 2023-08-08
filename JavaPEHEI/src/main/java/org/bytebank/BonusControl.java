package org.bytebank;

public class BonusControl {
    private double sum;

    public double registerSalary(Officer officer){
        this.sum += officer.getBonus();
        System.out.println(" Actual bonus -> " + this.sum);
        return this.sum;
    }

    /*public double registerSalary(Manager manager){
        this.sum += manager.getBonus();
        System.out.println(" Actual bonus -> " + this.sum);
        return this.sum;
    }

    public double registerSalary(Counter counter){
        this.sum += counter.getBonus();
        System.out.println(" Actual bonus -> " + this.sum);
        return this.sum;
    }*/
}
