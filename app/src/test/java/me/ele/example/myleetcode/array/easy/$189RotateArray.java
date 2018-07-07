package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 189.旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 */
public class $189RotateArray {

    @Test
    public void test1() {
        Assert.assertArrayEquals(rotate1(toArray(1, 2, 3, 4, 5, 6, 7), 3), toArray(5, 6, 7, 1, 2, 3, 4));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(rotate1(toArray(-1, -100, 3, 99), 2), toArray(3, 99, -1, -100));
    }

    private int[] toArray(int... array) {
        return array;
    }

    public int[] rotate1(int[] nums, int k) {
        int last, length = nums.length;
        for (int j = 0; j < k; j++) {
            last = nums[length - 1];
            for (int i = 0; i < length; i++) {
                int temp = nums[i];
                nums[i] = last;
                last = temp;
            }
        }
        return nums;
    }

}
