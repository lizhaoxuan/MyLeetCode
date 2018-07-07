package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 136.只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * Tip：考察异或的题
 * 0^0=0,0^1=1,1^1=0
 * 1 = 0001   2 = 0010  3 = 0011 2 = 0010  1 = 0001
 * 1^2^3^2^1 = 3 ( 0011)
 */
public class $136SingleNumber {

    @Test
    public void test1() {
        Assert.assertEquals(singleNumber(2, 2, 1), 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(singleNumber(4, 1, 2, 1, 2), 4);
    }

    public int singleNumber(int... nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
