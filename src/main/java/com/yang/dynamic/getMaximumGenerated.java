package com.yang.dynamic;

import java.util.Arrays;

/**
 * 1646. 获取生成数组中的最大值
 * https://leetcode.cn/problems/get-maximum-in-generated-array/
 */
public class getMaximumGenerated {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.getMaximumGenerated(7);
    }
}


class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;

        int[] data = new int[n + 1];
        data[0] = 0;
        data[1] = 1;

        int rtu = data[1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                data[i] = data[i / 2];
            } else {
                data[i] = data[(i - 1) / 2] + data[((i - 1) / 2) + 1];
            }

            rtu = Math.max(rtu, data[i]);
        }
        return rtu;
    }
}

class Solution2 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i <= n; ++i) {
            nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
