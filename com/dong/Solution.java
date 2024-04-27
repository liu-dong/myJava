package com.dong;

/**
 * @author liudong 2024/4/27
 */
public class Solution {



    private final static String[] NUMS = "a,b,c,d,e,f,j,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(",");

    public static void main(String[] args) {
        long result1 = calculate("abdc2abc");
        long result3 = calculate("efg3ijk");
        long result2 = calculate("mnop4qrst");
        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result2);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 根据题意运算规则进行计算
     *
     * @param formula string字符串 需要计算的式子
     * @return long长整型
     */
    public static long calculate(String formula) {
        // write code here
        // 找出数字的位置
        int index = getNumIndex(formula);
        // 获取左右两边的字符，以及数字
        String left = formula.substring(0, index);
        String right = formula.substring(index + 1);
        // 转换数字
        int leftNum = convertNum(left);
        int rightNum = convertNum(right);
        // 计算结果
        return operate(leftNum, rightNum, Integer.parseInt(String.valueOf(formula.charAt(index))));
    }

    private static int getNumIndex(String formula) {
        int i = 0;
        while (i < formula.length() && !(formula.charAt(i) == '1' || formula.charAt(i) == '2' || formula.charAt(i) == '3' || formula.charAt(i) == '4')) {
            i++;
        }
        return i;
    }

    private static long operate(int leftNum, int rightNum, int operate) {
        if (operate == 1) {
            return leftNum + rightNum;
        }
        if (operate == 2) {
            return leftNum - rightNum;
        }
        if (operate == 3) {
            return (long) leftNum * rightNum;
        }
        if (operate == 4) {
            if (rightNum <= 0) {
                System.out.println("除数不能为0");
            }
            return leftNum / rightNum;
        }
        return 0;
    }

    private static int convertNum(String left) {
        StringBuilder result = new StringBuilder();
        char[] chars = left.toCharArray();
        for (char c : chars) {
            String str = convertNum(c);
            result.append(str);
        }
        return Integer.parseInt(result.toString());
    }

    private static String convertNum(char c) {
        for (int i = 0; i < NUMS.length; i++) {
            if (NUMS[i].equals(c)) {
                return String.valueOf(i);
            }
        }
        return "";
    }
}
