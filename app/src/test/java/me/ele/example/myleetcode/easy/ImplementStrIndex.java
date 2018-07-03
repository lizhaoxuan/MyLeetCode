package me.ele.example.myleetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class ImplementStrIndex {

    @Test
    public void test() {
        Assert.assertEquals(strStr("hello", "ll"), 2);
    }

    @Test
    public void test1() {
        Assert.assertEquals(strStr("aaaaa", "bba"), -1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(strStr("11111", ""), 0);
    }

    @Test
    public void test3() {
        Assert.assertEquals(strStr("12345", "456"), -1);
    }

    public int strStr(String haystack, String needle) {
        int result = -1;
        if (needle.equals("")) {
            return 0;
        }
        int nLength = needle.length();
        char first = needle.charAt(0);
        for (int i = 0, l = haystack.length(); i < l; i++) {
            if (haystack.charAt(i) == first && l - i >= nLength) {
                int temp = i + 1;
                result = i;
                int n = 1;
                for (; n < nLength; n++, temp++) {
                    if (haystack.charAt(temp) != needle.charAt(n)) {
                        result = -1;
                        break;
                    }
                }
                if (n == nLength) {
                    return result;
                }
            }
        }

        return result;
    }

}
