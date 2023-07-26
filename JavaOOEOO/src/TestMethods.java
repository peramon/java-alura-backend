public class TestMethods {
    public static void main(String[] args) {
        Account paulAccount = new Account();
        paulAccount.balance = 300.00;
        paulAccount.deposit(125.00); // Arguments

        System.out.println(" My balance is " + paulAccount.balance);

        boolean res = paulAccount.withdraw(100.00);
        System.out.println(" My balance is " + paulAccount.balance);

        Account enriqueAccount = new Account();
        enriqueAccount.balance = 800.00;
        boolean canTransfer = enriqueAccount.transfer(300.00, paulAccount);

        if(canTransfer){
            System.out.println("Transfer Successfully");
        }else{
            System.out.println("Transfer Failed");
        }

        System.out.println(" My balance is " + paulAccount.balance);
    }
}
