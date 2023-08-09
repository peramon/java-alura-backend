package org.bytebank;

public class Manager extends Officer implements Authentic{


    public Manager() {
    }

    public Manager(String name, String identityCard, double salary) {
        super(name, identityCard, salary);
    }

    public double getBonus(){
        return super.getSalary() + (super.getSalary() * 0.5);
    }


    @Override
    public void setKey(String value) {

    }

    @Override
    public boolean logIn(String value) {
        return false;
    }
}
