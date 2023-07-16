public class TestReference {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 500.00;
        Account secondAccount = firstAccount;
        Account thirdAccount = new Account();

        System.out.println("Accounts");
        System.out.println("First " + firstAccount.balance);
        System.out.println("Second " + secondAccount.balance);

        secondAccount.balance = 500.00;

        System.out.println("Accounts");
        System.out.println("First " + firstAccount.balance);
        System.out.println("Second " + secondAccount.balance);

        System.out.println("First " + firstAccount.agency);
        System.out.println("Second " + secondAccount.agency);

        System.out.println(firstAccount);
        System.out.println(secondAccount);
        System.out.println(thirdAccount);

        if (firstAccount == secondAccount){
            System.out.println("Equals");
        }else {
            System.out.println("NotEquals");
        }

    }
}
