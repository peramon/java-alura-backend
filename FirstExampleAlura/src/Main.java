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

        System.out.println("Mi current  salary is -> " + increase);
        System.out.println("Mi age in a decade will be -> " + age);

        // Conversions - Cast
        double varOne = 130.78;
        int varTwo = (int) varOne;
        System.out.println("Double type to integer conversion -> " + varTwo);

        // Long
        long test = 1222222222222222222L;
        System.out.println("Number too long -> " + test);

        // Short
        short smallNumber = 13555;
        System.out.println("Short number -> " + smallNumber);

        // Byte
        byte smallerNumber = 15;
        System.out.println("Smaller number -> " + smallerNumber);

        // Characters
        char character = 'a';
        System.out.println("Character -> " + character);
        character = 65;
        System.out.println("Altered character -> " + character);
        character = 65 + 1;
        char secondCharacter = (char) (character +1);
        System.out.println("Second character -> " + secondCharacter);

        // String
        String word = "Online Alura courses";
        System.out.println("Word -> " + word);

        // Variables and memory
        int number_one = 5;
        int number_two = 9;
        System.out.println("Number Two -> " + number_two);

        number_two = number_one;
        System.out.println("Number Two -> " + number_two);

        number_one = 88;
        System.out.println("Number Two -> " + number_two);

    }
}
