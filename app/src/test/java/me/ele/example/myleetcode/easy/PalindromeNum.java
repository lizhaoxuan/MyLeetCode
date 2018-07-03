package me.ele.example.myleetcode.easy;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class PalindromeNum {

    @Test
    public void reversInteger() {
        assertEquals(isPalindrome(121), true);
    }

    @Test
    public void reversInteger1() {
        assertEquals(isPalindrome(-121), false);
    }

    @Test
    public void reversInteger2() {
        assertEquals(isPalindrome(10), false);
    }

    @Test
    public void reversInteger3() {
        assertEquals(isPalindrome(0), true);
    }

    @Test
    public void reversInteger4() {
        assertEquals(isPalindrome(11), true);
    }

    @Test
    public void reversInteger5() {
        assertEquals(isPalindrome(12), false);
    }

    @Test
    public void reversInteger6() {
        assertEquals(isPalindrome(2222222), true);
    }

    private boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }
        int left = 0;

        while (true) {
            left = left * 10 + x % 10;
            System.out.print(left + "  ");
            System.out.print(x + "  ");

            if (x / 10 < left * 10) {
                return x == left || x / 10 == left;
            }
            x /= 10;

        }
    }

}
