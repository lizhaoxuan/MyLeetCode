package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * 例如，
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * 示例 1:
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 * 输入: 701
 * 输出: "ZY"
 */
public class ExcelSheetColumnTitle {


    @Test
    public void test() {
        Assert.assertEquals(convertToTitle(1), "A");
    }

    @Test
    public void test1() {
        Assert.assertEquals(convertToTitle(28), "AB");
    }

    @Test
    public void test2() {
        Assert.assertEquals(convertToTitle(701), "ZY");
    }

    public String convertToTitle(int n) {
        String temp = "";
        while (n > 0) {
            temp = (char) ((n - 1) % 26 + 'A') + temp;
            n = (n - 1) / 26;
        }
        return temp;
    }

}
