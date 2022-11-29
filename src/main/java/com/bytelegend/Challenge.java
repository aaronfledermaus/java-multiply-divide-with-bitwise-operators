package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
//        System.out.println(add(12,12));

        System.out.println(multiplyBy31(0));
        System.out.println(multiplyBy31(1));
        System.out.println(multiplyBy31(5));
        System.out.println(divideBy2ThenMinus1(1));
        System.out.println(divideBy2ThenMinus1(4));
        System.out.println(divideBy2ThenMinus1(7));
    }

    private static int add(Integer a, Integer b) {

        Integer sum = a;
        while (b != 0) {
            //a与b无进位相加
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }


    /**
     * `multiplyBy31Description(int n)` returns the result of a given integer multiplying by 31,
     * e.g. `n=1`, return `31`; `n=2`, return `62`. No need to consider overflow issue. Note that
     * you are not allowed to use multiplication sign (`*`), division sign (`/`), and addition sign
     * (`+`).
     */
    public static int multiplyBy31(int n) {

            //将乘数和被乘数都取绝对值　
            int multiplicand = 31;
            int multiplier = n < 0 ? add(~n, 1) : n;

            int res = 0;
            // 判断multiplier 任何数*0=0
            while (multiplier != 0) {
                //判断 multiplier 是不是 奇数
                if ((multiplier & 1) != 0) {
                    // 如果是奇数 则加上一次multiplicand本身
                    res = add(res, multiplicand);
                }
                // multiplicand * 2
                multiplicand <<= 1;
                // multiplier  / 2
                multiplier >>>= 1;
            }
            //计算乘积的符号　　
            if ((31 ^ n) < 0) {
                res = add(~res, 1);
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
        // 先取被除数和除数的绝对值
        int dividend = n > 0 ? n : add(~n, 1);
        int divisor = 2;
        int quotient = 0;// 商
        int remainder = 0;// 余数
        for(int i = 31; i >= 0; i--) {
            // 比较dividend是否大于divisor的(1<<i)次方，不要将dividend与(divisor<<i)比较，
            // 而是用(dividend>>i)与divisor比较，
            // 效果一样，但是可以避免因(divisor<<i)操作可能导致的溢出，
            // 如果溢出则会可能dividend本身小于divisor，但是溢出导致dividend大于divisor
            if((dividend >> i) >= divisor) {
                quotient = add(quotient, 1 << i);
                dividend = minus(dividend, divisor << i);
            }
        }
        // 确定商的符号
        if((n ^ 2) < 0){
            // 如果除数和被除数异号，则商为负数
            quotient = add(~quotient, 1);
        }
        // 确定余数符号
        remainder = 2 > 0 ? dividend : add(~dividend, 1);
        System.out.println("余数："+ remainder);

        quotient = minus(quotient, 1);
        // 返回商
        return quotient;
    }
    private static int minus(int a, int b) {
        return add(a, negative(b));
    }
    private static int negative(int num)
    {
        return add(~num, 1); 
    }

}
