package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 661. 图片平滑器
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * 输出:
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * 解释:
 * 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
 * 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
 * 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
 * 注意:
 * 给定矩阵中的整数范围为 [0, 255]。
 * 矩阵的长和宽的范围均为 [1, 150]。
 */
public class $661ImageSmoother {

    @Test
    public void test() {
        int[][] M = new int[3][3];
        M[0] = new int[]{1, 1, 1};
        M[1] = new int[]{1, 0, 1};
        M[2] = new int[]{1, 1, 1};
        int[][] result = new int[3][3];
        result[0] = new int[]{0, 0, 0};
        result[1] = new int[]{0, 0, 0};
        result[2] = new int[]{0, 0, 0};
        Assert.assertArrayEquals(imageSmoother(M), result);
    }

    public int[][] imageSmoother(int[][] M) {
        int r = M.length;
        int l = M[0].length;
        int[][] result = new int[r][l];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                int n = 1, sum = M[i][j];
                if (i - 1 >= 0) {
                    sum += M[i - 1][j];
                    n++;
                    if (j - 1 >= 0) {
                        sum += M[i - 1][j - 1];
                        n++;
                    }
                    if (j + 1 < l) {
                        sum += M[i - 1][j + 1];
                        n++;
                    }
                }
                if (i + 1 < r) {
                    sum += M[i + 1][j];
                    n++;
                    if (j - 1 >= 0) {
                        sum += M[i + 1][j - 1];
                        n++;
                    }
                    if (j + 1 < l) {
                        sum += M[i + 1][j + 1];
                        n++;
                    }
                }
                if (j - 1 >= 0) {
                    sum += M[i][j - 1];
                    n++;
                }
                if (j + 1 < l) {
                    sum += M[i][j + 1];
                    n++;
                }
                result[i][j] = sum / n;
            }
        }
        return result;
    }

}
