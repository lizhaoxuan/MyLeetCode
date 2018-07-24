package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 389. 找不同
 * <p>
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 示例:
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * 输出：
 * e
 * 解释：
 * 'e' 是那个被添加的字母。
 */
public class $389FindTheDifference {

    @Test
    public void test() {
        Assert.assertEquals(findTheDifferenceOpt("abcd", "abcde"), 'e');
    }

    public char findTheDifference(String s, String t) {
        int[] array = new int[26];
        for (int i = 0; i < t.length(); i++) {
            array[t.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] == 1) {
                return (char) (i + 97);
            }
        }
        return '-';
    }

    public char findTheDifferenceOpt(String s, String t) {
        int res = 0;
        for (int i = 0; i < t.length(); i++) {
            res += t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            res -= s.charAt(i);
        }

        return (char) res;
    }

}
