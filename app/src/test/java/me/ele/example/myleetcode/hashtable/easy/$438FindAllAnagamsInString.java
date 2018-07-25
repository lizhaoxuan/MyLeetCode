package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 438. 找到字符串中所有字母异位词
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * 说明：
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 * 输入:
 * s: "cbaebabacd" p: "abc"
 * 输出:
 * [0, 6]
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 * 示例 2:
 * 输入:
 * s: "abab" p: "ab"
 * 输出:
 * [0, 1, 2]
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 */
public class $438FindAllAnagamsInString {

    @Test
    public void test() {
        Assert.assertArrayEquals(toArray(findAnagrams("cbaebabacd", "abc")), new int[]{0, 6});
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(toArray(findAnagrams("abab", "ab")), new int[]{0, 1, 2});
    }

    private int[] toArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int index = 0, num = 0, pLength = p.length();
        int[] array = new int[26], temp = new int[26];
        for (int i = 0; i < pLength; i++) {
            int c = p.charAt(i);
            num += c;
            array[c - 97]++;
            temp[c - 97]++;
        }
        while (index <= s.length() - pLength) {
            int tempNum = num;
            for (int i = 0; i < pLength; i++) {
                int c = s.charAt(index + i);
                if (tempNum < 0 || temp[c - 97] == 0) {
                    break;
                } else {
                    temp[c - 97]--;
                    tempNum -= c;
                }
            }
            if (tempNum == 0) {
                result.add(index);
            }
            System.arraycopy(array, 0, temp, 0, 26);
            index++;
        }

        return result;
    }


}
