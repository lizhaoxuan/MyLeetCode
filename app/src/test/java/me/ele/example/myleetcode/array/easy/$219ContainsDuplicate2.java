package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * 示例 1:
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
public class $219ContainsDuplicate2 {

    @Test
    public void test() {
        Assert.assertEquals(containsDuplicate(new int[]{1, 2, 3, 1}, 3), true);
    }

    @Test
    public void test1() {
        Assert.assertEquals(containsDuplicate(new int[]{1, 0, 1, 1}, 1), true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(containsDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2), false);
    }

    public boolean containsDuplicate(int[] nums, int k) {
        if (nums.length == 1 || nums.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
