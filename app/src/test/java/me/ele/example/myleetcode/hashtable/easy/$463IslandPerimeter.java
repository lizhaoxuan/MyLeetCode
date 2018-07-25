package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 463. 岛屿的周长
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。
 * 整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）
 * 。岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。
 * 格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。
 * 计算这个岛屿的周长。
 * 示例 :
 * [[0,1,0,0],
 * [1,1,1,0],
 * [0,1,0,0],
 * [1,1,0,0]]
 * 答案: 16
 * 解释: 它的周长是下面图片中的 16 个黄色的边
 */
public class $463IslandPerimeter {

    @Test
    public void test() {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        Assert.assertEquals(islandPerimeter(grid), 16);
    }

    @Test
    public void test1() {
        int[][] grid = {{1}};
        Assert.assertEquals(islandPerimeter(grid), 4);
    }

    public int islandPerimeter(int[][] grid) {
        int r = grid.length, l = grid[0].length;
        int result = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                if (i - 1 < 0 || grid[i - 1][j] == 0) {
                    result++;
                }
                if (i + 1 == r || grid[i + 1][j] == 0) {
                    result++;
                }

                if (j - 1 < 0 || grid[i][j - 1] == 0) {
                    result++;
                }
                if (j + 1 == l || grid[i][j + 1] == 0) {
                    result++;
                }
            }
        }

        return result;
    }

}
