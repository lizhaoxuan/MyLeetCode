package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. 两个数组的交集 II
 * 给定两个数组，写一个方法来计算它们的交集。
 * 例如:
 * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 * 注意：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 跟进:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class $350IntersectionOfTwoArrays2 {

    @Test
    public void test() {
        Assert.assertArrayEquals(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}), new int[]{2, 2});
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(intersect(new int[]{}, new int[]{1}), new int[]{});
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            int num = map.get(i) == null ? 0 : map.get(i);
            map.put(i, num + 1);
        }
        for (int i : nums2) {
            Integer num = map.get(i);
            if (num != null && num > 0) {
                list.add(i);
                map.put(i, num - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
