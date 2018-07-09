package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 643. 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * 示例 1:
 * 输入: [1,12,-5,-6,50,3], k = 4
 * 输出: 12.75
 * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * 注意:
 * 1 <= k <= n <= 30,000。
 * 所给数据范围 [-10,000，10,000]。
 */
public class $634MaxiumAverge1 {

    @Test
    public void test() {
        Assert.assertEquals(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 12.75, 0);
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxSum;
        int i = 0;
        double sum = 0;
        for (; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        int left = 0;
        for (; i < nums.length; i++) {
            sum += nums[i] - nums[left++];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum / (double) k;
    }
}
