package org.example;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 5;
        int res = fib(n);
        System.out.println (res);
    }

    private static int fib(int n) {
        if(n==0 || n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
         return fib(n-1) + fib(n-2);
    }

}
