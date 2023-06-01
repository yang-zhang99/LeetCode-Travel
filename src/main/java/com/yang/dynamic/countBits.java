package com.yang.dynamic;

public class countBits {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countBits(2);
    }


    static class Solution {
        public int[] countBits(int n) {
            int[] rtu = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    rtu[i] = rtu[i / 2];
                } else {
                    rtu[i] = rtu[i / 2] + 1;
                }
            }
            return rtu;
        }


//            int[] rtu = new int[n + 1];
//            int highBit = 0;
//
//            for (int i = 1; i <= n; i++) {
//                if ( ( i & (i - 1) ) == 0 ) {
//                    highBit = i;
//                }
//                rtu[i] = rtu[i - highBit] + 1;
//            }
//            return rtu;
//    }
    }


}
