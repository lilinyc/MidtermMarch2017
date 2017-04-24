package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    private static int getFactorialRecursive(int n) {
        if (n >0)
            return n*getFactorialRecursive(n-1);
        else
            return 1;
    }

    private static int getFactorialItterative(int n) {
        int product = 1;
        for (int i = n; i > 0; i--) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n = 5;

        int product = getFactorialItterative(n);
        System.out.println("Factorial of " + n + " is " + product);

        product = getFactorialRecursive(n);
        System.out.println("Factorial of " + n + " is " + product);
    }
}
