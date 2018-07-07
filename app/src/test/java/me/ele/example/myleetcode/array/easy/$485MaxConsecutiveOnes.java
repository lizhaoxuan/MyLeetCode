package me.ele.example.myleetcode.array.easy;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 485. 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * 示例 1:
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 */
public class $485MaxConsecutiveOnes {

    @Test
    public void test() {
        Assert.assertEquals(findMaxConsecutiveOnes(1, 1, 0, 1, 1, 1), 3);
    }

    @Test
    public void test1() {
        Assert.assertEquals(findMaxConsecutiveOnes(1), 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(findMaxConsecutiveOnes(0), 0);
    }

    public int findMaxConsecutiveOnes(int... nums) {
        int max = 0;
        int temp = 0;
        System.out.println(nums.length);
        for (int n : nums) {
            if (n == 0) {
                if (temp > max) {
                    max = temp;
                }
                temp = 0;
            } else {
                temp++;
            }
        }
        if (temp > max) {
            max = temp;
        }
        return max;
    }

}
