package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 217. 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class ContainsDuplicate {

    @Test
    public void test() {
        Assert.assertEquals(containsDuplicate(1, 2, 3, 1), true);
        Assert.assertEquals(containsDuplicateOpt(1, 2, 3, 1), true);

    }

    @Test
    public void test1() {
        Assert.assertEquals(containsDuplicate(1, 2, 3, 4), false);
        Assert.assertEquals(containsDuplicateOpt(1, 2, 3, 4), false);
    }

    @Test
    public void test2() {
        Assert.assertEquals(containsDuplicate(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), true);
        Assert.assertEquals(containsDuplicateOpt(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), true);

    }

    @Test
    public void test3() {
        Assert.assertEquals(containsDuplicate(3, 1), false);
        Assert.assertEquals(containsDuplicateOpt(3, 1), false);

    }

    @Test
    public void test4() {
        Assert.assertEquals(containsDuplicate(9, 15, 10, 15), true);
        Assert.assertEquals(containsDuplicateOpt(9, 15, 10, 15), true);
    }

    public boolean containsDuplicateOpt(int... nums) {
//        if (nums.length == 1 || nums.length == 0) {
//            return false;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
        for (int i = 1; i < nums.length; i++) {
            //确定前面肯定没有重复的情况下 只有当前数字小于
            //每次拿当前的跟前面的对比 当前>前面的就跳出 ==就是返回
            for (int j = i - 1; j >= 0; j--) {
                System.out.println(nums[i] + "  " + nums[j]);
                if (nums[i] > nums[j]) {
                    break;
                } else if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate(int... nums) {
        if (nums.length == 1 || nums.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
