package me.ele.example.myleetcode.string.easy;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * 20.有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class $20ValidParentheses {


    @Test
    public void validParentheses1() {
        assertEquals(isValid("()"), true);
    }

    @Test
    public void validParentheses2() {
        assertEquals(isValid("()[]{}"), true);
    }

    @Test
    public void validParentheses3() {
        assertEquals(isValid("(]"), false);
    }

    @Test
    public void validParentheses4() {
        assertEquals(isValid("([)]"), false);
    }

    @Test
    public void validParentheses5() {
        assertEquals(isValid("{[]}"), true);
    }

    @Test
    public void validParentheses6() {
        assertEquals(isValid("[])"), false);
    }

    private boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();
        list.add(s.charAt(0));
        for (int i = 1, l = s.length(); i < l; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                list.add(c);
            } else if (c == ')' && list.size() != 0 && list.get(list.size() - 1) == '(') {
                list.remove(list.size() - 1);
            } else if (c == '}' && list.size() != 0 && list.get(list.size() - 1) == '{') {
                list.remove(list.size() - 1);
            } else if (c == ']' && list.size() != 0 && list.get(list.size() - 1) == '[') {
                list.remove(list.size() - 1);
            } else {
                return false;
            }
        }
        return list.size() == 0;
    }
}
