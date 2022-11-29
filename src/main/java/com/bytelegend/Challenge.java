package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
//        System.out.println(add(12,12));

//        System.out.println(divideBy2ThenMinus1(6));

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
        return multi(31,n);
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
        return minus(sub(n,2),1);

    }

    public static int sub(int a, int b) {
        // 先获取负数的个数
        int negativeCount = negativeCount(a, b);
        // 负数转正数进行计算
        a = abs(a);
        b = abs(b);
        int res;
        if (a < b) {
            return 0;
        } else {
            res = add(sub(minus(a, b), b), 1);
        }
        if (negativeCount == 1) {
            // 转为负数
            res = negative(res);
        }
        return res;
    }


    public static int negativeCount(int a, int b) {
        int count = 0;
        if (a < 0) {
            count = add(count, 1);
        }
        if (b < 0) {
            count = add(count, 1);
        }
        return count;
    }


    public static int multi(int a, int b) {
        // 先获取负数的个数
        int negativeCount = negativeCount(a, b);
        // 负数转正数进行计算
        a = abs(a);
        b = abs(b);
        int i = 0;
        int res = 0;
        // 乘数为0则结束
        while (b != 0) {
            // 处理乘数当前位
            if ((b & 1) == 1) {
                res = add(res, a << i);
            }
            b = b >> 1;
            i = add(i, 1);
        }
        if (negativeCount == 1) {
            // 转为负数
            res = negative(res);
        }
        return res;
    }
    public static int abs(int num) {
        if (num < 0) {
            num = minus(0, num);
        }
        return num;
    }
    public static int minus(int a, int b) {
        return add(a, negative(b));
    }
    public static int negative(int num) {
        return add(~num, 1);
    }
    public static int add(int a, int b) {
        // 得到原位和
        int xor = a ^ b;
        // 得到进位和
        int forWoad = (a & b) << 1;
        return forWoad == 0 ? xor : add(xor, forWoad);
    }

}
