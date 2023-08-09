package org.bytebank;

public class Manager extends Officer implements Authentic{

    private UtilAuthentic authentic;

    public Manager() {
        this.authentic = new UtilAuthentic();
    }

    /*public Manager(String name, String identityCard, double salary) {
        super(name, identityCard, salary);
    }*/

    @Override
    public double getBonus(){
        return super.getSalary();
    }


    @Override
    public void setKey(String value) {
        this.authentic.setKey(value);
    }

    @Override
    public boolean logIn(String value) {
        return this.authentic.logIn(value);
    }
}
