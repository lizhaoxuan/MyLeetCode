package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class $283MoveZeros {

    @Test
    public void test() {
        Assert.assertArrayEquals(moveZeroes(0, 1, 0, 3, 12), new int[]{1, 3, 12, 0, 0});
        Assert.assertArrayEquals(moveZeroesOpt(0, 1, 0, 3, 12), new int[]{1, 3, 12, 0, 0});
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(moveZeroes(0), new int[]{0});
        Assert.assertArrayEquals(moveZeroesOpt(0), new int[]{0});

    }

    @Test
    public void tes2() {
        Assert.assertArrayEquals(moveZeroes(1, 0), new int[]{1, 0});
        Assert.assertArrayEquals(moveZeroesOpt(1, 0), new int[]{1, 0});

    }

    public int[] moveZeroesOpt(int... nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
            right++;
        }
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public int[] moveZeroes(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
