package org.bytebank;

public class InternalSystem {

    private String pass = "Alura";
    public boolean authorize(Authentic authentication){
        boolean canLogIn = authentication.logIn(pass);
        if(canLogIn){
            System.out.println("Login successful");
            return  true;
        }else{
            System.out.println("Login failed");
            return  false;
        }
    }

    /*public boolean authorize(Administrator administrator){
        boolean canLogIn = administrator.logIn(pass);
        if(canLogIn){
            System.out.println("Login successful");
            return  true;
        }else{
            System.out.println("Login failed");
            return  false;
        }
    }*/


}
