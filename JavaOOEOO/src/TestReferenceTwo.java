public class TestReferenceTwo {
    public static void main(String[] args) {
        Customer paul = new Customer();
        paul.setName("Paul Ramon");
        paul.setDocument("10235698745");
        paul.setPhoneNumber("0445236412");

        Account accountPaul = new Account();
        accountPaul.setAgency(1);
        accountPaul.setBalanace(100.00);
        accountPaul.holder = paul;

        System.out.println("Holder -> " + accountPaul.holder.getName() + " \nBalance -> " + accountPaul.getBalanace() + "\n"
        + accountPaul.holder + "\n" + paul);

    }
}
