package me.ele.example.myleetcode.array.easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

/**
 * 1.两数之和
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class $1TowSum {

    @Test
    public void towSum1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(twoSum(nums, target), new int[]{0, 1});
        assertArrayEquals(twoSumOptimize(nums, target), new int[]{1, 0});
    }

    @Test
    public void towSum2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        assertArrayEquals(twoSum(nums, target), new int[]{1, 2});
        assertArrayEquals(twoSumOptimize(nums, target), new int[]{2, 1});
    }

    @Test
    public void towSum3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        assertArrayEquals(twoSum(nums, target), new int[]{0, 1});
        assertArrayEquals(twoSumOptimize(nums, target), new int[]{1, 0});
    }

    //两遍hash表
    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, l = nums.length; i < l; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0, l = nums.length; i < l; i++) {
            if (map.get((target - nums[i])) != null && i != map.get((target - nums[i]))) {
                return new int[]{i, map.get((target - nums[i]))};
            }
        }
        return null;
    }

    //一遍hash表
    private int[] twoSumOptimize(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, l = nums.length; i < l; i++) {
            Integer num = map.get((target - nums[i]));
            if (num != null && i != num) {
                return new int[]{i, num};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
