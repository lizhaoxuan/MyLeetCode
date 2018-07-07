package me.ele.example.myleetcode.math.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 69.x 的平方根
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class $69Sqrt {

    @Test
    public void test1() {
        Assert.assertEquals(mySqrt(4), 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(mySqrt(8), 2);
    }

    @Test
    public void test3() {
        Assert.assertEquals(mySqrt(1), 1);
    }

    @Test
    public void test4() {
        Assert.assertEquals(mySqrt(2147395599), 46339);
    }

    @Test
    public void test5() {
        Assert.assertEquals(mySqrt(2147395600), 46340);
    }

    public int mySqrt(int x) {
        long result = 0;

        while (result * result <= x) {
            result++;
            if (result == 46399) {
                System.out.print((result * result) + "  ");
            }
        }
        return (int)result - 1;
    }
}
