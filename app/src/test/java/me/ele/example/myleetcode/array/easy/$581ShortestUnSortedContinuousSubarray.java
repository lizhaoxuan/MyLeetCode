package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 581. 最短无序连续子数组
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 你找到的子数组应是最短的，请输出它的长度。
 * 示例 1:
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 说明 :
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 */
public class $581ShortestUnSortedContinuousSubarray {

    @Test
    public void test() {
        Assert.assertEquals(findUnsortedSubarray(2, 6, 4, 8, 10, 9, 15), 5);
    }

    @Test
    public void test1() {
        Assert.assertEquals(findUnsortedSubarray(1, 2, 3, 4), 0);
    }

    @Test
    public void test2() {
        Assert.assertEquals(findUnsortedSubarray(1, 3, 5, 4, 2), 4);
    }

    public int findUnsortedSubarray(int... nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        int i = -1;
        int j = 0;
        for (int m = 0, n = len - 1; m < len; m++, n--) {
            max = Math.max(max, nums[m]);
            if (max != nums[m]) i = m;
            min = Math.min(min, nums[n]);
            if (min != nums[n]) j = n;
        }
        return i - j + 1;
    }
}
