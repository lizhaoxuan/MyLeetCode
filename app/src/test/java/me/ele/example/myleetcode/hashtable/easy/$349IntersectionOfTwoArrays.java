package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 349. 两个数组的交集
 * 给定两个数组，写一个函数来计算它们的交集。
 * 例子:
 * 给定 num1= [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].
 * 提示:
 * 每个在结果中的元素必定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class $349IntersectionOfTwoArrays {

    @Test
    public void test1() {
        Assert.assertArrayEquals(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}), new int[]{2});
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int length = nums1.length > nums2.length ? nums1.length : nums2.length;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                set1.add(nums1[i]);
            }
            if (i < nums2.length) {
                set2.add(nums2[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        if (set1.size() > set2.size()) {
            for (Integer in : set2) {
                if (set1.contains(in)) {
                    list.add(in);
                }
            }
        } else {
            for (Integer in : set1) {
                if (set2.contains(in)) {
                    list.add(in);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
