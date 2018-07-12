package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 766. 托普利茨矩阵
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 * 示例 1:
 * 输入:
 * matrix = [
 * [1,2,3,4],
 * [5,1,2,3],
 * [9,5,1,2]
 * ]
 * 输出: True
 * 解释:
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是True。
 * 示例 2:
 * 输入:
 * matrix = [
 * [1,2],
 * [2,2]
 * ]
 * 输出: False
 * 解释:
 * 对角线"[1, 2]"上的元素不同。
 * 说明:
 * matrix 是一个包含整数的二维数组。
 * matrix 的行数和列数均在 [1, 20]范围内。
 * matrix[i][j] 包含的整数在 [0, 99]范围内。
 */
public class $766ToeplitzMatrix {

    @Test
    public void test() {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{5, 1, 2, 3};
        matrix[2] = new int[]{9, 5, 1, 2};
        Assert.assertEquals(isToeplitzMatrix(matrix), true);
    }

    @Test
    public void test1() {
        int[][] matrix = new int[2][2];
        matrix[0] = new int[]{1, 2};
        matrix[1] = new int[]{2, 2};
        Assert.assertEquals(isToeplitzMatrix(matrix), false);
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length, l = matrix[0].length;
        for (int i = 0; i < l; i++) {
            int rr = 0, ll = i;
            int temp = matrix[rr++][ll++];
            while (rr < r && ll < l) {
                if (temp != matrix[rr++][ll++]) {
                    return false;
                }
            }
        }
        for (int i = 1; i < r; i++) {
            int rr = i, ll = 0;
            int temp = matrix[rr++][ll++];
            while (rr < r && ll < l) {
                if (temp != matrix[rr++][ll++]) {
                    return false;
                }
            }
        }

        return true;
    }

}
