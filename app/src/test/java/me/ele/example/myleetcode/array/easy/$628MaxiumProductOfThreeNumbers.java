package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 628. 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: 24
 */
public class $628MaxiumProductOfThreeNumbers {

    @Test
    public void test1() {
        Assert.assertEquals(maximumProduct(1, 2, 3), 6);
    }

    @Test
    public void test2() {
        Assert.assertEquals(maximumProduct(1, 2, 3, 4), 24);
    }

    @Test
    public void test3() {
        Assert.assertEquals(maximumProduct(-4, -3, -2, -1, 60), 720);
    }

    @Test
    public void test4() {
        Assert.assertEquals(maximumProduct(722, 634, -504, -379, 163, -613, -842, -578,
                750, 951, -158, 30, -238, -392, -487, -797, -157, -374, 999, -5, -521, -879,
                -858, 382, 626, 803, -347, 903, -205, 57, -342, 186, -736, 17, 83, 726, -960,
                343, -984, 937, -758, -122, 577, -595, -544, -559, 903, -183, 192, 825, 368,
                -674, 57, -959, 884, 29, -681, -339, 582, 969, -95, -455, -275, 205, -548, 79,
                258, 35, 233, 203, 20, -936, 878, -868, -458, -882, 867, -664, -892, -687, 322,
                844, -745, 447, -909, -586, 69, -88, 88, 445, -553, -666, 130, -640, -918, -7,
                -420, -368, 250, -786), 943695360);
    }

    public int maximumProduct(int... nums) {
        int max1 = 0, max2 = -1, max3 = -1;
        int min1 = -1, min2 = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[max1]) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (max2 == -1 || nums[i] >= nums[max2]) {
                max3 = max2;
                max2 = i;
            } else if (max3 == -1 || nums[i] >= nums[max3]) {
                max3 = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == max1 || i == max2 || i == max3) {
                continue;
            }
            if (min1 == -1 || nums[i] <= nums[min1]) {
                min2 = min1;
                min1 = i;
            } else if (min2 == -1 || nums[i] <= nums[min2]) {
                min2 = i;
            }
        }

        if (min2 != -1) {
            int zMax = nums[max1] * nums[max2] * nums[max3];
            int fMax = nums[max1] * nums[min1] * nums[min2];
            return zMax > fMax ? zMax : fMax;
        } else {
            return nums[max1] * nums[max2] * nums[max3];
        }
    }

}
