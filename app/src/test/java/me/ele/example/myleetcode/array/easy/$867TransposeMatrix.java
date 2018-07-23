package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 867. 转置矩阵
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * 示例 1：
 * 输入：[[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * 输出：[[1,4,7],
 * [2,5,8],
 * [3,6,9]]
 * 示例 2：
 * 输入：[[1,2,3],
 * [4,5,6]]
 * 输出：[[1,4],
 * [2,5],
 * [3,6]]
 */
public class $867TransposeMatrix {

    @Test
    public void test1() {
        int[][] target = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Assert.assertArrayEquals(transpose(target), result);
    }

    @Test
    public void test2() {
        int[][] target = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = {{1, 4}, {2, 5}, {3, 6}};
        Assert.assertArrayEquals(transpose(target), result);
    }

    public int[][] transpose(int[][] A) {
        int r = A.length, l = A[0].length;
        int[][] result = new int[l][r];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < r; j++) {
                result[i][j] = A[j][i];
            }
        }

        return result;
    }

}
