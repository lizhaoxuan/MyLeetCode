package me.ele.example.myleetcode.array.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 118.杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class $118PascalTriangle {

    @Test
    public void test() {
        List<List<Integer>> result = generate(5);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println(" ");
        }
    }


    /**
     * 更优解，不去上一位取，按照规律生成
     * temp = temp * row-- / j ;
     * @param numRows
     * @return
     */
    public List<List<Integer>> generateOpt(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> thisRow = new ArrayList<Integer>(i);
            thisRow.add(1);
            int temp = 1;
            int row = i;
            for (int j = 1; j <= i; j++) {
                temp = temp * row-- / j ;
                thisRow.add(temp);
            }
            result.add(thisRow);
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> old = null;
            if (i != 0) {
                old = result.get(i - 1);
            }

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(old.get(j - 1) + old.get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }

}
