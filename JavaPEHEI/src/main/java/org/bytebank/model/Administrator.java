package org.bytebank.model;

import org.bytebank.util.UtilAuthentic;

public class Administrator extends Officer implements Authentic{

    private UtilAuthentic authentic;

    public Administrator() {
        this.authentic = new UtilAuthentic();
    }

    @Override
    public double getBonus() {
        return 150;
    }

    @Override
    public void setKey(String value) {
        this.setKey(value);
    }

    @Override
    public boolean logIn(String value) {
        return this.authentic.logIn(value);
    }

}
