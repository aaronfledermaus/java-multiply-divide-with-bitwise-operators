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

    /**
     * `multiplyBy31Description(int n)` returns the result of a given integer multiplying by 31,
     * e.g. `n=1`, return `31`; `n=2`, return `62`. No need to consider overflow issue. Note that
     * you are not allowed to use multiplication sign (`*`), division sign (`/`), and addition sign
     * (`+`).
     */
    public static int multiplyBy31(int n) {
        return mult(n, 31);
    }

    static int divide(int a, int b) {
        int tempA = a;
        int finalMult = 1;
        if (a < 0) {
            tempA = minus(0, a);
            finalMult = -1;
        }
        int out = 0;
        int divProd = 0;
        int diff = minus(tempA, divProd);
        while (diff >= b) {
            divProd += b;
            out++;
            diff = minus(tempA, divProd);
        }
        if (finalMult == -1) {
            out = minus(0, out);
        }
        return out;
    }

    static int divideByTwo(int a) {
        return divide(a, 2);
    }

    static int minus(int a, int b) {
        int out = a ^ b;
        int carry = ((~a) & b) << 1;
        while (carry != 0) {
            int nextOut = out ^ carry;
            carry = (~out & carry) << 1;
            out = nextOut;
        }
        return out;
    }

    static int minusOne(int a) {
        return minus(a, 1);
    }

    public static int divideBy2ThenMinus1(int n) {
        return minusOne(divideByTwo(n));
    }
    
    static int add(int a, int b) {
        int out = a ^ b;
        int carry = (a & b) << 1;
        while (carry != 0) {
            int nextOut = out ^ carry;
            carry = (out & carry) << 1;
            out = nextOut;
        }
        return out;

    }

    static int mult(int a, int b) {
        int out = 0;
        for (int i = 0; i < b; i++) {
            out = add(out, a);
        }

        return out;
    }
}
