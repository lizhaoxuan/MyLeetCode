package me.ele.example.myleetcode.math.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 7.反转整数
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 */
public class $7ReversInteger {

    @Test
    public void reversInteger() {
        assertEquals(reverse(123), 321);
    }

    @Test
    public void reversInteger1() {
        assertEquals(reverse(-123), -321);
    }

    @Test
    public void reversInteger2() {
        assertEquals(reverse(120), 21);
    }

    @Test
    public void reversInteger3() {
        assertEquals(reverse(1534236469), 0);
    }

    private int reverse(int x) {
        List<Integer> list = new ArrayList<>();
        int isF = x < 0 ? -1 : 1;
        int temp = x * isF;
        while (temp > 0) {
            int num = temp % 10;
            System.out.println(num);
            list.add(num);
            temp /= 10;
        }

        int result = 0;
        int cs = 1;
        for (int l = list.size(), i = l - 1; i >= 0; i--) {
            int add = list.get(i) * cs;
            if (cs != 1 && add % 10 != 0) {
                return 0;
            }
            if (Integer.MAX_VALUE - result > list.get(i) * cs) {
                result += list.get(i) * cs;
                cs *= 10;
            } else {
                return 0;
            }
        }

        return result * isF;
    }

}
