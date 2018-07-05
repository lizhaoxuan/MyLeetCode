package me.ele.example.myleetcode.easy;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class MajorityElement {

    @Test
    public void test() {
        Assert.assertEquals(majorityElement(3, 2, 3), 3);
    }

    @Test
    public void test1() {
        Assert.assertEquals(majorityElement(2, 2, 1, 1, 1, 2, 2), 2);
    }

    public int majorityElement(int... nums) {
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                result = nums[i];
            } else if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }

}
