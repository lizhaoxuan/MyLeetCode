package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class $387FirstUniqueCharInAString {
    @Test
    public void test() {
        Assert.assertEquals(firstUniqChar("leetcode"), 0);
    }

    @Test
    public void test1() {
        Assert.assertEquals(firstUniqChar("loveleetcode"), 2);
    }

    public int firstUniqChar(String s) {
        int[] arrays = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrays[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arrays[s.charAt(i) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
