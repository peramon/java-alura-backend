package org.bytebank;

public class Officer {
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

    public double getBonus() {
        // If Type = 1 is manager
        // If Type = 0 is officer
        if(this.type == 0){
            return this.salary * 0.1;
        }else if(this.type == 1){
            return this.salary;
        }else{
            return 0.0;
        }
    }


}
