package me.ele.example.myleetcode.string.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 58.最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 */
public class $58LengthOfLastWord {

    @Test
    public void test() {
        Assert.assertEquals(lengthOfLastWord("Hello World"), 5);
    }

    @Test
    public void test1() {
        Assert.assertEquals(lengthOfLastWord(""), 0);
    }

    @Test
    public void test2() {
        Assert.assertEquals(lengthOfLastWord("World"), 5);
    }

    @Test
    public void test3() {
        Assert.assertEquals(lengthOfLastWord("a "), 1);
    }

    @Test
    public void test4() {
        Assert.assertEquals(lengthOfLastWord(" "), 0);
    }

    public int lengthOfLastWord(String s) {
        int result = 0;
        if (s == null) {
            return result;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            } else if (result != 0 && s.charAt(i) == ' ') {
                return result;
            }
        }

        return result;
    }

}
