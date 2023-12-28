package HW9;

import java.util.stream.IntStream;

public class FibonacciExample {

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number position
        long fibonacciNumber = calculateFibonacci(n);
        System.out.println("Fibonacci number at position " + n + ": " + fibonacciNumber);
    }

    public static long calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        return IntStream.rangeClosed(2, n)
                .boxed()
                .reduce(new long[]{0, 1}, (arr, i) -> {
                    long fib = arr[0] + arr[1];
                    arr[0] = arr[1];
                    arr[1] = fib;
                    return arr;
                })[1];
    }
}
