// Entity Account
public class Account {
    // Variables for account data
    Double balance;
    int agency, number;
    Customer holder;


    // public -> Access modifier
    public void deposit(double value){ // Params
        // This account This account
        // This object
        this.balance = this.balance + value;
    }

    public boolean withdraw(double value){
        // return this.balance - value;
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfer(double value, Account account ) {
        if(this.balance >= value){
            this.balance -= value;
            account.balance += value;
            return true;
        }
        return false;
    }
}

