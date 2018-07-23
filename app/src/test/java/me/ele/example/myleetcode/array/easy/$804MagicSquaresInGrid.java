package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 840. 矩阵中的幻方
 * 3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
 * 给定一个由整数组成的 N × N 矩阵，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
 * 示例 1:
 * 输入: [[4,3,8,4],
 * [9,5,1,9],
 * [2,7,6,2]]
 * 输出: 1
 * 解释:
 * 下面的子矩阵是一个 3 x 3 的幻方：
 * 438
 * 951
 * 276
 * 而这一个不是：
 * 384
 * 519
 * 762
 * 总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
 */
public class $804MagicSquaresInGrid {

    @Test
    public void test() {
        int[][] grid = new int[3][4];
        grid[0] = new int[]{4, 3, 8, 4};
        grid[1] = new int[]{9, 5, 1, 9};
        grid[2] = new int[]{2, 7, 6, 2};
        Assert.assertEquals(numMagicSquaresInside(grid), 1);
    }

    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;
        if (grid.length < 3 || grid[0].length < 3) {
            return result;
        }
        int r = grid.length, l = grid[0].length;

        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < l - 2; j++) {
                if (check(i, j, grid)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean check(int r, int l, int[][] grid) {
        int[] temp = new int[10];
        int num = grid[r][l] + grid[r][l + 1] + grid[r][l + 2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int t = grid[r + i][l + j];
                if (t < 1 || t > 9 || temp[t] != 0) {
                    return false;
                } else {
                    temp[grid[r + i][l + j]]++;
                }
                if (i == 0) {
                    if (grid[r][l + j] + grid[r + 1][l + j] + grid[r + 2][l + j] != num) {
                        return false;
                    }
                }
            }
            if (grid[r + i][l] + grid[r + i][l + 1] + grid[r + i][l + 2] != num) {
                return false;
            }
        }
        if (num == grid[r][l] + grid[r + 1][l + 1] + grid[r + 2][l + 2] && num == grid[r + 2][l] + grid[r + 1][l + 1] + grid[r][l + 2]) {
            return true;
        } else {
            return false;
        }
    }
}
