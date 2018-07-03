package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class AddBinary {

    @Test
    public void test1() {
        Assert.assertEquals(addBinary("11", "1"), "100");
    }

    @Test
    public void test2() {
        Assert.assertEquals(addBinary("1010", "1011"), "10101");
    }

    @Test
    public void test3() {
        Assert.assertEquals(addBinary("1111", "1111"), "11110");
    }

    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int index = 1;
        int j = '0';
        while (aLength - index >= 0 || bLength - index >= 0) {
            int t = j;
            j = '0';
            if (aLength - index >= 0) {
                t += a.charAt(aLength - index);
                if (t == 96) {
                    t = '0';
                } else if (t == 97) {
                    t = '1';
                } else {
                    t = '0';
                    j = '1';
                }
            }

            if (bLength - index >= 0) {
                t += b.charAt(bLength - index);
                if (t == 96) {
                    t = '0';
                } else if (t == 97) {
                    t = '1';
                } else {
                    t = '0';
                    j = '1';
                }
            }
            builder.insert(0, (char) t);
            index++;
        }
        if (j == '1') {
            builder.insert(0, '1');
        }
        return builder.toString();
    }

}
