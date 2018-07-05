package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 例如，
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 * 输入: "ZY"
 * 输出: 701
 */
public class ExcelSheetColumnNumber {

    @Test
    public void test1() {
        Assert.assertEquals(titleToNumber("A"), 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(titleToNumber("AB"), 28);
    }

    @Test
    public void test3() {
        Assert.assertEquals(titleToNumber("ZY"), 701);
    }

    public int titleToNumber(String s) {
        int result = 0;
        int temp = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += (((int) s.charAt(i)) - 64) * temp;
            temp *= 26;
        }
        return result;
    }

}
