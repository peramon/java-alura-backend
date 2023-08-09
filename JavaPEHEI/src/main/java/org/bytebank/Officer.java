package org.bytebank;

public abstract class Officer {
    private String name;
    private String identityCard;
    private double salary;
    private int type;

    // Constructors
    public Officer() {
    }

    public Officer(String name, String identityCard, double salary) {
        this.name = name;
        this.identityCard = identityCard;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public abstract double getBonus();

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}
