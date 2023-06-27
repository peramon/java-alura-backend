public class Conditional {
    public static void main(String[] args) {
        System.out.println("Conditionals");
        int age = 18;

        // Boolean type
        boolean isCouple = true;
        boolean canEnter = age >= 18 && isCouple;

        // If - Check the age
        if(canEnter) {
            System.out.println("Welcome");
        }else{
            System.out.println("You cannot enter");
        }
    }
}



