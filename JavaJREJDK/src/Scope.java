public class Scope {
    public static void main(String[] args) {
        System.out.println("Scope");
        int age = 18;
        int numberPersons = 2;

        // If  - Check number of persons
        boolean isCouple;
        if(numberPersons > 1){
            // boolean isCouple = true;
            isCouple = true;
        }else{
            isCouple = false;
        }

        // If - Check the age
        boolean canEnter = age >= 18 && isCouple;
        if(canEnter) {
            System.out.println("Welcome");
        }else{
            System.out.println("You cannot enter");
        }
    }
}
