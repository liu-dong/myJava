package com.dong;

/**
 * @author liudong 2024/4/27
 */
public class Main {
    public static void main(String[] args) {
        compute("abdc2abc");
        compute("efg3ijk");
        compute("mnop4qrst");
    }

    static void compute(String input) {
        int i = 0;
        // Find operator in the string
        while (i < input.length() && !(input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) == '3' || input.charAt(i) == '4')) {
            i++;
        }

        // Convert characters to the corresponding numbers
        int first = toNumber(input.substring(0, i));
        int second = toNumber(input.substring(i + 1));

        // Compute based on the operator
        switch (input.charAt(i)) {
            case '1':
                System.out.println(first + second);
                break;
            case '2':
                System.out.println(first - second);
                break;
            case '3':
                System.out.println(first * second);
                break;
            case '4':
                if (second != 0) {
                    System.out.println((double) first / second);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
        }
    }

    static int toNumber(String s) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res = res * 26 + (c - 'a');
        }
        return res;
    }
}
