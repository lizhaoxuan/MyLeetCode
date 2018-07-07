package me.ele.example.myleetcode.dynamicProgramming.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 70.爬楼梯
 * 【动态规划】
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * <p>
 * <p>
 * 我们假设到达第n级台阶的方法数为f(n)，那么最后一步的时候，
 * 我们有两种选择，一是选择爬一步，那么这时候的方法数就是f(n-1),
 * 另一种选择是选择爬两步，方法数f(n-2).所以通过这个我们就可以得出f(n)的状态转移方程：
 * f(n)=f(n-1)+f(n-2)
 */
public class $70ClimbingStairs {

    @Test
    public void test1() {
        Assert.assertEquals(climbStairs(2), 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(climbStairs(3), 3);
    }

    public int climbStairs(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    /**
     * f(n)=f(n-1)+f(n-2)
     * f(n-1) = f(n) - f(n-2);
     * @param n
     * @return
     */
    public int climbStairsOpt(int n) {
        int one = 0;
        int two = 1;
        while(n>0)  {
            two=one+two;
            one=two-one;
            n--;
        }
        return two;
    }

}
