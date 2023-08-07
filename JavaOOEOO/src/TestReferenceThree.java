public class TestReferenceThree {
    public static void main(String[] args) {
        Account paulAccount = new Account();
        Customer customer = new Customer();
        customer.setName("Paul Ramon");

        // paulAccount.holder = new Customer();
        paulAccount.holder = customer;
        // paulAccount.holder.name = "Paul";

        System.out.println(paulAccount.holder.getName());
    }
}
