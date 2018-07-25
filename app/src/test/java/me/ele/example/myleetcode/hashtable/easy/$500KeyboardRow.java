package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. 键盘行
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * 示例1:
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 * 注意:
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 */
public class $500KeyboardRow {

    @Test
    public void test() {
        Assert.assertArrayEquals(findWords("Hello", "Alaska", "Dad", "Peace"), new String[]{"Alaska", "Dad"});
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(findWords("qwee"), new String[]{"qwee"});
    }

    public String[] findWords(String... words) {
        List<String> list = new ArrayList<>();
        int[] array = new int[]{
//                a, b, c, d, e, f, j, h, i, g, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
                2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3
        };
        for (String word : words) {
            int c = word.charAt(0);
            c = c <= 90 ? c - 65 : c - 97;
            int line = array[c];
            boolean onlyOne = true;
            for (int i = 1; i < word.length(); i++) {
                int w = word.charAt(i);
                w = w <= 90 ? w - 65 : w - 97;
                if (array[w] != line) {
                    onlyOne = false;
                    break;
                }
            }
            if (onlyOne) {
                list.add(word);
            }
        }

        String[] result = new String[list.size()];
        result = list.toArray(result);
        return result;
    }
}
