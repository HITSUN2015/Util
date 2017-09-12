package leetcode;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;

/**
 * Created by Sunny on 17/9/11.
 */


public class ReshapetheMatrix566 {
    //数组的length 是 从左到右序号 做起的 列数
    public int[][] matrixReshape0(int[][] nums, int r, int c) {
        if (null == nums || nums.length == 0) {
            return nums;
        }
        int sr = nums.length;
        int sc = nums[0].length;
        if (sc * sr != r * c) {//这里原条件是 != 错了一次
            return nums;
        }
        int[][] result = new int[r][c];
        for(int i = 0 ; i < sr * sc ; i ++) {
            /**
             * 警告 这个算法 取模 取余数 过程 很慢 改成加法操作
             */
            result[i/c][i%c] = nums[i/sc][i%sc];
        }
        return result;
    }

    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        if (null == nums || nums.length == 0) {
            return nums;
        }
        int sr = nums.length;
        int sc = nums[0].length;
        if (sc * sr < r * c) {//这里原条件是 != 错了一次
            return nums;
        }
        int[][] result = new int[r][c];
        int curC = 0;
        int curR = 0;
        for(int i = 0 ; i < sr ; i ++) {
            for(int j = 0 ; j < sc ; j++) {
                result[curR][curC] = nums[i][j];
                if (curC == c - 1) {
                    curC = 0;
                    curR++;
                } else {
                    curC++;
                }

            }
        }
        return result;
    }

    @Test
    public void testResult() {
        int[][] test = new int[][]{new int[]{1, 2}, new int[]{3, 4}};
        int[][] result = matrixReshape1(test,1,4);
        int[][] test2 = new int[][]{new int[]{1, 2, 3, 4}};
        int[][] result2 = matrixReshape1(test2, 2, 2);
    }
}

