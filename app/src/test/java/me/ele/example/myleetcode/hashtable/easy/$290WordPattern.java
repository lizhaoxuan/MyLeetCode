package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词模式
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 * 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 * 示例1:
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 * 说明:
 * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。
 */
public class $290WordPattern {

    @Test
    public void test1() {
        Assert.assertEquals(wordPattern("abba", "dog cat cat dog"), true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(wordPattern("abba", "dog cat cat fish"), false);

    }

    @Test
    public void test3() {
        Assert.assertEquals(wordPattern("aaaa", "dog cat cat dog"), false);

    }

    @Test
    public void test4() {
        Assert.assertEquals(wordPattern("abba", "dog dog dog dog"), false);
    }

    public boolean wordPattern(String pattern, String str) {
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        String[] strArray = str.split(" ");
        if (pattern.length() != strArray.length) {
            return false;
        }
        for (int i = 0; i < strArray.length; i++) {
            if (map.containsKey(strArray[i])) {
                if (map.get(strArray[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                if (map2.containsKey(pattern.charAt(i))) {
                    return false;
                }
                map.put(strArray[i], pattern.charAt(i));
                map2.put(pattern.charAt(i), strArray[i]);
            }
        }

        return true;
    }

}
