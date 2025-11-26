import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Returns the input name as a string.
     *
     * @param name the name to be returned
     * @return the input name
     */
    public static String greet(String name) {
        return name;
    }


    /**
     * Adds two integers and returns their sum.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of the two integers
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Checks if a number is even.
     *
     * @param number
     * @return
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Calculates the area of a circle with a given radius.
     *
     * @param radius
     * @return
     */
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Grades a student based on their score.
     * 90 - A
     * 80 - B
     * 70 - C
     * 60 - D
     * otherwise - F
     *
     * @param score
     * @return
     */
    public static String grade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /**
     * Returns the maximum of three numbers.
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius
     * @return
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    /**
     * Applies a discount to a price.
     *
     * @param price
     * @param discount
     * @return
     */
    public static double applyDiscount(double price, double discount) {
        double montantRabais = price * (discount / 100);
        return price - montantRabais;
    }


    /**
     * Find even numbers from a list.
     *
     * @param numbers
     * @return
     */
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    /**
     * Calculates factorial of a number.
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        };

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Calculates fibonacci number.
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    // ================= TEST RUNNER =================

    public static void main(String[] args) {
        System.out.println("🔍 Running Java Version Tests...\n");

        int passed = 0, failed = 0;

        passed += check("greet Alice", greet("Alice").equals("Alice"));
        passed += check("add", add(3, 5) == 8);
        passed += check("isEven true", isEven(4));
        passed += check("areaOfCircle", Math.abs(areaOfCircle(2) - 12.57) < 0.02);
        passed += check("grade A", grade(95).equals("A"));
        passed += check("maxOfThree", maxOfThree(3, 9, 6) == 9);
        passed += check("toFahrenheit", Math.abs(toFahrenheit(20) - 68) < 0.1);
        passed += check("discount", Math.abs(applyDiscount(100, 10)) == 90);
        passed += check("filterEvenNumbers",
                filterEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)).equals(Arrays.asList(2, 4, 6)));
        passed += check("factorial", factorial(5) == 120);
        passed += check("fibonacci", fibonacci(6) == 8);

        System.out.println("\n🎯 Tests passed: " + passed + " / 15");
    }

    private static int check(String name, boolean result) {
        if (result) {
            System.out.println("✅ " + name);
            return 1;
        } else {
            System.out.println("❌ " + name);
            return 0;
        }
    }
}
