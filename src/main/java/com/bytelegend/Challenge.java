package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(multiplyBy31(0));
        System.out.println(multiplyBy31(1));
        System.out.println(multiplyBy31(5));
        System.out.println(divideBy2ThenMinus1(1));
        System.out.println(divideBy2ThenMinus1(4));
        System.out.println(divideBy2ThenMinus1(7));
    }

    
    public static int multiplyBy31(int n) {
        int m = Math.abs(n);
        return n < 0 ? ~((m << 5) - m - 1) : (m << 5) - m;
    }
    public static int divideBy2ThenMinus1(int n) {
        int m = Math.abs(n);
        return n == 0 ? -1 : n < 0 ? ~(m >> 1) : (m >> 1) - 1;
    }
}
