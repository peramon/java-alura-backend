// Entity Account
public class Account {
    // Variables for account data
    private Double balance;
    private int agency, number;
    Customer holder;

    // Counting accounts, variable class
    // Is not alterable by the instance
    private static int total = 0;

    public Account() {
    }

    public Account(int agency) {
        if( agency <= 0 ) {
            System.out.println("Not valid number 0");
            this.agency = 1;
        }else{
            setAgency(agency);
        }
        this.total++;
        System.out.println(" Accounts created : " + this.total);
    }

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

    public double getBalanace() {
        return this.balance;
    }

    public void setBalanace(double value){
        this.balance = value;
    }

    // agency
    public void setAgency(int value){
        if(value > 0){
            this.agency = value;
        }else{
            System.out.println("Agency invalid number");
        }
    }

    public int getAgency() {
        return this.agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Customer getHolder() {
        return holder;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }

    public static int getTotal(){
            return Account.total;
    }
}

