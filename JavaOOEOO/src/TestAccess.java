public class TestAccess {
    public static void main(String[] args) {

        Account account = new Account();

        account.setBalanace(400.00);
        account.withdraw(300.00);

        account.setAgency(12);

        System.out.println(account.getBalanace());
        System.out.println(account.getAgency());

    }
}
