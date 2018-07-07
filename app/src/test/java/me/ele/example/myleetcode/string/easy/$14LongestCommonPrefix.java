package me.ele.example.myleetcode.string.easy;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * 14.最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class $14LongestCommonPrefix {

    @Test
    public void longestCommonPrefix1() {
        assertEquals(longestCommonPrefix("flower", "flow", "flight"), "fl");
    }

    @Test
    public void longestCommonPrefix2() {
        assertEquals(longestCommonPrefix("dog", "racecar", "car"), "");
    }

    @Test
    public void longestCommonPrefix3() {
        assertEquals(longestCommonPrefix("a"), "");
    }

    private String longestCommonPrefix(String... strs) {
        StringBuilder result = new StringBuilder();
        try {
            int index = 0;
            char c = strs[0].charAt(index);
            while (true) {
                for (String str : strs) {
                    if (index >= str.length() || c != str.charAt(index)) {
                        return result.toString();
                    }
                }
                result.append(c);
                c = strs[0].charAt(++index);
            }
        } catch (Exception e) {
            return result.toString();
        }
    }
}
