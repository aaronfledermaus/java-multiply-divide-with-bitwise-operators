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
        int num = 31;
        int count = n;
        int result = 0;
        while (count != 0) {
            if ((count & 1) == 1) {
                result = add(result, num);
            }
            num <<= 1;
            count >>>= 1;
        }
        return result;
    }

    public static int add(int a, int b) {
        int res = a ^ b;
        int carry = (a & b) << 1;
        while (carry != 0) {
            int temp = res;
            res = res ^ carry;
            carry = (temp & carry) << 1;
        }
        return res;
    }

    /**
     * `divideBy2ThenMinus1(int n)` returns the result of a given integer dividing by 2, then minus
     * 1.
     *
     * <p>For example, `n=1`, return `-1`, because `1/2=0`, `0-1=-1`.
     *
     * <p>`n=4`, return 1, because `4/2=2`, `2-1=1`.
     *
     * <p>Note that you are not allowed to use multiplication sign (`*`), division sign (`/`), and
     * addition sign (`+`).
     */
    public static int divideBy2ThenMinus1(int n) {
        return n >= 0 ? (n >> 1) - 1 : ((n & 1) == 1 ? (n >> 1) : (n >> 1) - 1);
    }
}
