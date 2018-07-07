package me.ele.example.myleetcode.towPoints.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 125.验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 * <p>
 * 0~9 : 48 ~ 57
 * A~Z : 65 ~ 90
 * a~z : 97 ~ 122
 */
public class $125ValidPalindrome {

    @Test
    public void test() {
        Assert.assertEquals(isPalindrome("A man, a plan, a canal: Panama"), true);
    }

    @Test
    public void test1() {
        Assert.assertEquals(isPalindrome(""), true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(isPalindrome("race a car"), false);
    }

    @Test
    public void test3() {
        Assert.assertEquals(isPalindrome("r"), true);
    }

    @Test
    public void test4() {
        Assert.assertEquals(isPalindrome("rs"), false);
    }

    @Test
    public void test5() {
        Assert.assertEquals(isPalindrome("rsr"), true);
    }


    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        boolean checkRight = false;
        char leftChar = '!';
        while (left <= right) {
            if (checkRight) {
                char rightChar = s.charAt(right--);
                if (rightChar <= 90 && rightChar >= 65) {
                    if (rightChar + 32 != leftChar) {
                        return false;
                    } else {
                        checkRight = false;
                    }
                } else if (rightChar <= 122 && rightChar >= 97) {
                    if (rightChar != leftChar) {
                        return false;
                    } else {
                        checkRight = false;
                    }
                } else if (rightChar <= 57 && rightChar >= 48) {
                    if (rightChar != leftChar) {
                        return false;
                    } else {
                        checkRight = false;
                    }
                }
            } else {
                leftChar = s.charAt(left++);
                if (leftChar <= 90 && leftChar >= 65) {
                    leftChar += 32;
                    checkRight = true;
                } else if (leftChar <= 122 && leftChar >= 97) {
                    checkRight = true;
                } else if (leftChar <= 57 && leftChar >= 48) {
                    checkRight = true;
                }
            }
        }
        return true;
    }
}
