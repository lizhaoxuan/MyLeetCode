package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    @Test
    public void test() {
        Assert.assertArrayEquals(toArray(getRow(3)), new int[]{1, 3, 3, 1});
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(toArray(getRow(30))
                , new int[]{1, 30, 435, 4060, 27405, 142506, 593775, 2035800, 5852925, 14307150, 30045015, 54627300, 86493225, 119759850, 145422675, 155117520, 145422675, 119759850, 86493225, 54627300, 30045015, 14307150, 5852925, 2035800, 593775, 142506, 27405, 4060, 435, 30, 1});
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(toArray(getRow(5))
                , new int[]{1, 5, 10, 10, 5, 1});
    }

    @Test
    public void test3() {
        Assert.assertArrayEquals(toArray(getRow(13))
                , new int[]{1, 13, 78, 286, 715, 1287, 1716, 1716, 1287, 715, 286, 78, 13, 1});
    }


    private int[] toArray(List<Integer> result) {
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
        return a;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        int row = rowIndex;
        long temp = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            temp = temp * row-- / i;
            result.add((int) temp);
        }
        return result;
    }

    /**
     * 尝试仅用int解题
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRowOpt(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        int row = rowIndex;
        long temp = 1;
        for (int i = 1; i < rowIndex + 1; i++) {
            if (i > (rowIndex + 1) / 2) {
                temp = result.get(rowIndex - i);
            } else if (temp % i == 0) {
                temp = temp / i * row--;
            } else if ((row - 1) % i == 0) {
                temp = row-- / i * temp;
            } else {
                temp = temp * row-- / i;
            }
            result.add((int) temp);
        }
        return result;
    }
}
