package com.yang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1630. 等差子数组
 *
 * https://leetcode.cn/problems/arithmetic-subarrays/
 *
 */
public class CheckArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> rtu = new ArrayList<>();

        int length = l.length;

        for (int i = 0; i < length; i++) {
            int minv = Math.min(l[i], r[i]);

            int[] temp = new int[Math.abs(l[i] - r[i]) + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = nums[minv + j];
            }

            Arrays.sort(temp);
            rtu.add(check(temp));

        }
        return rtu;

    }

    private boolean check(int[] data) {
        int t = data[1] - data[0];
        for (int i = 1; i < data.length; i++) {
            if (t != data[i] - data[i - 1]) {
                return false;
            }
        }
        return true;
    }


}
