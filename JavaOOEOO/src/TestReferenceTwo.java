public class TestReferenceTwo {
    public static void main(String[] args) {
        Customer paul = new Customer();
        paul.name= "Paul Ramon";
        paul.document = "10235698745";
        paul.phoneNumber = "0445236412";

        Account accountPaul = new Account();
        accountPaul.agency = 1;
        accountPaul.balance = 100.000;
        accountPaul.holder = paul;

        System.out.println("Holder -> " + accountPaul.holder.name + " \nBalance -> " + accountPaul.balance + "\n"
        + accountPaul.holder + "\n" + paul);

    }
}
