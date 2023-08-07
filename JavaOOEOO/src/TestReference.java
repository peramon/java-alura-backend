public class TestReference {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.setBalanace(500.00);
        Account secondAccount = firstAccount;
        Account thirdAccount = new Account();

        System.out.println("Accounts");
        System.out.println("First " + firstAccount.getBalanace());
        System.out.println("Second " + secondAccount.getBalanace());

        secondAccount.setBalanace(500.00);

        System.out.println("Accounts");
        System.out.println("First " + firstAccount.getBalanace());
        System.out.println("Second " + secondAccount.getBalanace());

        System.out.println("First " + firstAccount.getAgency());
        System.out.println("Second " + secondAccount.getAgency());

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
