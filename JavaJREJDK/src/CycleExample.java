public class CycleExample {
    public static void main(String[] args) {
        System.out.println("Cycle Example");
        // Initialize Counter
        int counter = 0;
        int total = 0;
        // Cycle While
        while (counter < 10){
            // int total = 0;
            total += counter;
            // System.out.println("Cycle " + total );
            // Increase counter
            counter++;
        }
        System.out.println("Cycle " + total );
    }
}
