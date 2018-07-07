package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 35.搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class $35SearchInsertPosition {

    @Test
    public void test() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assert.assertEquals(searchInsert(nums, 5), 2);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assert.assertEquals(searchInsert(nums, 2), 1);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assert.assertEquals(searchInsert(nums, 7), 4);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 3, 5, 6};
        Assert.assertEquals(searchInsert(nums, 0), 0);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0, l = nums.length; i < l; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsertOpt(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid;
            else start = mid;
        }
        if (target <= nums[start])
            return start;

        else if (target <= nums[end])
            return end;


        else
            return end + 1;
    }

}
