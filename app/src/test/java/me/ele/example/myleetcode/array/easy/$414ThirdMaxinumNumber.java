package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 414. 第三大的数
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * 示例 1:
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1.
 * 示例 2:
 * 输入: [1, 2]
 * 输出: 2
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class $414ThirdMaxinumNumber {

    @Test
    public void test() {
        Assert.assertEquals(thirdMax(3, 2, 1), 1);
    }

    @Test
    public void test1() {
        Assert.assertEquals(thirdMax(1, 2), 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(thirdMax(2, 2, 3, 1), 1);
    }

    public int thirdMax(int... nums) {
        Integer[] result = new Integer[3];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= result[0]) {
                if (nums[i] == result[0]) {
                    continue;
                }
                result[2] = result[1];
                result[1] = result[0];
                result[0] = nums[i];
            } else if (result[1] == null || nums[i] >= result[1]) {
                if (result[1] != null && nums[i] == result[1]) {
                    continue;
                }
                result[2] = result[1];
                result[1] = nums[i];
            } else if (result[2] == null || nums[i] >= result[2]) {
                if (result[2] != null && nums[i] == result[2]) {
                    continue;
                }
                result[2] = nums[i];
            }
        }

        return result[2] == null ? result[0] : result[2];
    }
}
