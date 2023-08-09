package org.bytebank;

public class Administrator extends Officer implements Authentic{

    private String key;

    @Override
    public double getBonus() {
        return 150;
    }

    @Override
    public void setKey(String value) {

    }

    @Override
    public boolean logIn(String value) {
        return false;
    }

}
