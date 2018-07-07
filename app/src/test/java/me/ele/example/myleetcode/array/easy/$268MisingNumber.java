package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 268.缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 示例 1:
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 */
public class $268MisingNumber {

    @Test
    public void test1() {
        Assert.assertEquals(missingNumber(3, 0, 1), 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(missingNumber(9, 6, 4, 2, 3, 5, 7, 0, 1), 8);
    }

    public int missingNumber(int... nums) {
        int targetNum = 0;
        int thisNum = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            targetNum += i;
            thisNum += nums[i];
        }
        targetNum += i;
        return targetNum - thisNum;
    }
}


