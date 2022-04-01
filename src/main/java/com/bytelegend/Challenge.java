package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        // System.out.println(multiplyBy31(0));
        System.out.println(multiplyBy31(-1));
        System.out.println(multiplyBy31(-5));
        // System.out.println(divideBy2ThenMinus1(1));
        // System.out.println(divideBy2ThenMinus1(4));
        // System.out.println(divideBy2ThenMinus1(7));
    }

    /**
     * `multiplyBy31Description(int n)` returns the result of a given integer multiplying by 31,
     * e.g. `n=1`, return `31`; `n=2`, return `62`. No need to consider overflow issue. Note that
     * you are not allowed to use multiplication sign (`*`), division sign (`/`), and addition sign
     * (`+`).
     */
    public static int multiplyBy31(int b) {
        boolean minus = false;
        if (b < 0) {
            minus = true;
            b = Math.abs(b);
        }
        int base = 31;
        int i = 0;
        int res = 0;
        //乘数不为0
        while (b != 0) {
            //处理当前位
            //当前位是1
            if ((b & 1) == 1) {
                res += (base << i);
                b = b >> 1;
                //记录当前是第几位
                i++;
            } else {
                //当前位是0
                b = b >> 1;
                i++;
            }
        }
        if (minus) {
            return add(~res, 1);
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
        return subtraction(division(n, 2), 1);
    }

    private static int division(int a, int b) {
        boolean minus = false;
        if (a < 0) {
            minus = true;
            a = Math.abs(a);
        }
        int res;
        if (a < b) {
            return 0;
        } else {
            res = division(subtraction(a, b), b) + 1;
        }
        if (minus) {
            return add(~res, 1);
        }
        return res;
    }

    private static int subtraction(int a, int b) {
        b = ~b + 1;
        return add(a, b);
    }

    private static int add(int a, int b) {
        //进位值
        int carry;
        while (b != 0) {
            carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
