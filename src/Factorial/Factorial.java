package Factorial;

public class Factorial {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of " + num + " is " + factorial(num));

    }
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
