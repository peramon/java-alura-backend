package org.bytebank.model;

import org.bytebank.util.UtilAuthentic;

public class Customer implements Authentic{
    private String name;
    private String document;
    private String phoneNumber;

    private UtilAuthentic authentic;

    public Customer(){
        this.authentic = new UtilAuthentic();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
