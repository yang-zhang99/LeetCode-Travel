package com.yang.dynamic;

public class cuttingSteelBar {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int s = solution.cuttingSteelBar(new int[]{1, 5, 8, 9, 10, 17, 20, 24, 30, 32, 32, 43, 44, 54, 55, 66, 77, 77, 88, 88
                , 33, 44, 55, 33, 44, 33, 33, 44, 32, 212, 232, 231}, 30);
        System.out.println(s);
    }


    static class Solution {
        public int cuttingSteelBar(int[] price, int n) {
            if (n == 0) {
                return 0;
            }

            int rtu = Integer.MIN_VALUE;

            for (int i = 1; i <= n; i++) {
                rtu = Math.max(rtu, price[i - 1] + this.cuttingSteelBar(price, n - i));
            }

            return rtu;

        }
    }
}
