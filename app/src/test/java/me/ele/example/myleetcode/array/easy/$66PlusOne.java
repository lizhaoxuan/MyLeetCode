package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 66.加一
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class $66PlusOne {

    @Test
    public void test() {
        Assert.assertArrayEquals(plusOne(1, 2, 3), array(1, 2, 4));
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(plusOne(4, 3, 2, 1), array(4, 3, 2, 2));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(plusOne(0), array(1));
    }

    @Test
    public void test3() {
        Assert.assertArrayEquals(plusOne(9), array(1, 0));
    }

    @Test
    public void test4() {
        Assert.assertArrayEquals(plusOne(9, 9, 9, 9), array(1, 0, 0, 0, 0));
    }

    @Test
    public void test5() {
        Assert.assertArrayEquals(plusOne(1, 2, 9, 9), array(1, 3, 0, 0));
    }


    public int[] plusOne(int... digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }

    private int[] array(int... arr) {
        return arr;
    }

}
