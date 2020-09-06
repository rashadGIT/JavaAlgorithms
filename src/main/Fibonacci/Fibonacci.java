package main.Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 45;
        System.out.println(getNthFibonacci(num));
    }

    public static int getNthFibonacci(int n) {
        if(n < 0) return -1;
        if(n == 2) return 1;
        if(n == 1) return 0;
        return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
    }
}
