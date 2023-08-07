public class TestConstructor {
    public static void main(String[] args) {

        Account account = new Account(55);
        Account account2 = new Account(3233);
        Account account3 = new Account(123);

        System.out.println("Agency: " + account.getAgency());
    }
}
