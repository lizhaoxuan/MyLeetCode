package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 *
 * 结题技巧：从后面插入
 */
public class MergeSortArray {

    @Test
    public void test() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        Assert.assertArrayEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 3, 4, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 4, nums2, 3);
        Assert.assertArrayEquals(nums1, new int[]{1, 2, 2, 3, 4, 5, 6});
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        merge(nums1, 3, nums2, 3);
        Assert.assertArrayEquals(nums1, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        Assert.assertArrayEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int length = m + n;
        m -= 1;
        n -= 1;
        for (int i = length - 1; i >= 0; i--) {
            if (n == -1) {
                nums1[i] = nums1[m];
                m--;
            } else if (m == -1) {
                nums1[i] = nums2[n];
                n--;
            } else if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }

}
