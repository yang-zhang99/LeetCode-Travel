package leetcode;

import java.util.Arrays;

/**
 * 1637. 两点之间不包含任何点的最宽垂直区域
 *
 * https://leetcode.cn/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class MaxWidthOfVerticalArea {

    public int maxWidthOfVerticalArea(int[][] points) {

        int[] point = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            point[i] = points[i][0];
        }

        Arrays.sort(point);

        int rtu = 0;

        for (int i = 0; i < point.length - 1; i++) {
//            if (point[i + 1] - point[i] > rtu) {
//                rtu = point[i + 1] - point[i];
//            }
            rtu = Math.max(point[i + 1] - point[i], rtu);

        }
        return rtu;
    }


}
