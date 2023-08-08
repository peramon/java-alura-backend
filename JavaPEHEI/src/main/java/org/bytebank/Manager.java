package org.bytebank;

public class Manager extends Officer{

    private String key;

    public Manager() {
    }

    public Manager(String name, String identityCard, double salary) {
        super(name, identityCard, salary);
    }

    public void setKey(String value){
        this.key = value;
    }

    public boolean logIn(String value){
        return value == "Alura";
    }

    public double getBonus(){
        return super.getSalary() + super.getBonus();
    }


}
