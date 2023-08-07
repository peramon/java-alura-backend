public class TestEncapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        Customer customer = new Customer();

        customer.setName("Pedro Infante");
        customer.setDocument("esd2332dwdw34");

        account.setHolder(customer);

        // Customer holder = account.getHolder();

        System.out.println("Customer -> " + customer.getName());
        System.out.println("Holder -> " + account.getHolder().getName());


    }
}
