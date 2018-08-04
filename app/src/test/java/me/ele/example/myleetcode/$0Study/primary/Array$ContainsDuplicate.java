package me.ele.example.myleetcode.$0Study.primary;

import android.util.ArrayMap;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 存在重复元素
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
public class Array$ContainsDuplicate {

    @Test
    public void test() {
        Assert.assertEquals(containsDuplicate(1, 2, 3, 1), true);
    }

    @Test
    public void test1() {
        Assert.assertEquals(containsDuplicate(1, 2, 3, 4), false);
    }

    @Test
    public void test2() {
        Assert.assertEquals(containsDuplicate(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), true);
    }

    public boolean containsDuplicate(int... nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }

}
