package org.fasttrack.exercises1;

public class RecursiveMethods {

    public static int sumOfFirstNRecursive (int i, int n){
        if (n <= 0){
            return 0;
        }
        return i + sumOfFirstNRecursive(i + 2, n - 1);
    }


    public static int sumOfDigistsRecursive (int n){
        if ( n <= 0){
            return  0;
        }
        return n % 10 + sumOfDigistsRecursive(n / 10);
    }

    public static int fibonacciRecursive (int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
