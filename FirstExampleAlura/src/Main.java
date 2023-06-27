public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Variable Types
        // Int
        int age = 25;
        int decade = 10;
        age += decade;

        // Double
        double salary = 750.50;
        double increase = salary + 125;

        System.out.println("Mi current  salary is " + increase);
        System.out.println("Mi age in a decade will be " + age);

        // Conversions - Cast
        double varOne = 130.78;
        int varTwo = (int) varOne;
        System.out.println("Double type to integer conversion " + varTwo);

        // Long
        long test = 1222222222222222222L;
        System.out.println("Number too long " + test);

        // Short
        short smallNumber = 13555;
        System.out.println("Short number " + smallNumber);

        // Byte
        byte smallerNumber = 15;
        System.out.println("Smaller number " + smallerNumber);

    }
}
