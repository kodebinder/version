package com.company.reverseinteger;

public class ReverseIntegerTester {
    public static void main(String[] args) {
        ReverseIntegerTester reverseInteger = new ReverseIntegerTester();
        System.out.println(reverseInteger.reverseUsingStringBuilder(123));
        System.out.println(reverseInteger.reverseUsingStringBuilder(-123));
        System.out.println(reverseInteger.reverse(123));
        System.out.println(reverseInteger.reverse(-123));
    }

    public int reverseUsingStringBuilder(int n) {
        String reversed = new StringBuilder().append(Math.abs(n)).reverse().toString();
        try {
            return (n < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse(int n) {
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n *= -1;
        }

        long reversedNum = 0;
        while (n > 0) {
            int remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n = n / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            return 0;
        }

        return isNegative ? (int) reversedNum * -1 : (int) reversedNum;
    }
}
