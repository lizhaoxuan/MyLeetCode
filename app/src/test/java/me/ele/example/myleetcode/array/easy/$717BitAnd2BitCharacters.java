package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 717. 1比特与2比特字符
 * 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 * 示例 1:
 * 输入:
 * bits = [1, 0, 0]
 * 输出: True
 * 解释:
 * 唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。
 * 示例 2:
 * 输入:
 * bits = [1, 1, 1, 0]
 * 输出: False
 * 解释:
 * 唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
 * 注意:
 * 1 <= len(bits) <= 1000.
 * bits[i] 总是0 或 1.
 */
public class $717BitAnd2BitCharacters {

    @Test
    public void test() {
        Assert.assertEquals(isOneBitCharacter(1, 0, 0), true);
    }

    @Test
    public void test1() {
        Assert.assertEquals(isOneBitCharacter(1, 1, 1, 0), false);
    }

    public boolean isOneBitCharacter(int... bits) {
        int index = 0;
        int length = bits.length;
        while (index < length - 1) {
            if (bits[index] == 1) {
                index += 2;
            } else {
                index++;
            }
        }

        return index == length - 1;
    }

}
