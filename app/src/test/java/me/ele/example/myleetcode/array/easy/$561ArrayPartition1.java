package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * 561. 数组拆分 I
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * 示例 1:
 * 输入: [1,4,3,2]
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * 提示:
 * n 是正整数,范围在 [1, 10000].
 * 数组中的元素范围在 [-10000, 10000].
 */
public class $561ArrayPartition1 {

    @Test
    public void test() {
        Assert.assertEquals(arrayPairSum(1, 4, 3, 2), 4);
        Assert.assertEquals(arrayPairSumOpt(1, 4, 3, 2), 4);
    }

    @Test
    public void test1() {
        Assert.assertEquals(arrayPairSum(1, 2, 3, 2), 3);
        Assert.assertEquals(arrayPairSumOpt(1, 2, 3, 2), 3);
    }

    public int arrayPairSumOpt(int... nums) {
        int[] newArray = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            newArray[nums[i] + 10000]++;
        }
        int result = 0;
        boolean jump = false;
        for (int i = 0; i < newArray.length; i++) {
            while (newArray[i] > 0) {
                if (!jump) {
                    result += i - 10000;
                }
                jump = !jump;
                newArray[i]--;
            }
        }
        return result;
    }

    public int arrayPairSum(int... nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

}
