package com.yang.dynamic;

import java.util.Arrays;

/**
 * 1641. 统计字典序元音字符串的数目
 * 1641. Count Sorted Vowel Strings
 * <p>
 * Internet  https://leetcode.cn/problems/count-sorted-vowel-strings/
 */


public class countVowelStrings {

    public static void main(String[] args) {

    }

    class Solution {
        public int countVowelStrings(int n) {
            int[] dp = new int[5];
            Arrays.fill(dp, 1);
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < 5; j++) {
                    dp[j] += dp[j - 1];
                }
            }
            return Arrays.stream(dp).sum();
        }
    }


}
