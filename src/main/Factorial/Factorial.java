package main.Factorial;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
