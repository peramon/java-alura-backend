package org.bytebank.util;

public class UtilAuthentic {
    private String key;

    public boolean logIn(String value) {
        return this.key.equals(value);
    }

    public void setKey(String key) {
        this.key = key;
    }
}
