package me.ele.example.myleetcode.hashtable.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例:
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class $204CountPrimes {

    @Test
    public void test1() {
        Assert.assertEquals(countPrimes(10),4);
    }

    @Test
    public void test2() {

    }

    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j < n; j = j + i) {
                    primes[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                count++;
            }
        }
        return count;
    }
}
