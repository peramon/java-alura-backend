public class CreateAccount {
    public static void main(String[] args) {
        // Create an instance of the account
        Account firstAccount = new Account();
        // Add balance to account
        firstAccount.setBalanace(1000.00);
        System.out.println("First account");
        System.out.println(firstAccount.getBalanace());

        // Second account
        Account secondAccount = new Account();
        // Add balance to second account
        secondAccount.setBalanace(300.55);
        System.out.println("\nSecond Account");
        System.out.println("Balance -> " + secondAccount.getBalanace() + " Agency -> " + secondAccount.getAgency());

    }
}
