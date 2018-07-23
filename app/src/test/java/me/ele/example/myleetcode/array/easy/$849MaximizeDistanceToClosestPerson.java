package me.ele.example.myleetcode.array.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * 849. 到最近的人的最大距离
 * 在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
 * 至少有一个空座位，且至少有一人坐在座位上。
 * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
 * 返回他到离他最近的人的最大距离。
 * 示例 1：
 * 输入：[1,0,0,0,1,0,1]
 * 输出：2
 * 解释：
 * 如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
 * 如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
 * 因此，他到离他最近的人的最大距离是 2 。
 * 示例 2：
 * 输入：[1,0,0,0]
 * 输出：3
 * 解释：
 * 如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
 * 这是可能的最大距离，所以答案是 3 。
 * 提示：
 * 1 <= seats.length <= 20000
 * seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。
 */
public class $849MaximizeDistanceToClosestPerson {

    @Test
    public void test1() {
        Assert.assertEquals(maxDistToClosest(1, 0, 0, 0, 1, 0, 1), 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(maxDistToClosest(1, 0, 0, 0), 3);
    }

    @Test
    public void test3() {
        Assert.assertEquals(maxDistToClosest(0, 1), 1);
    }

    public int maxDistToClosest(int... seats) {
        int length = seats.length;
        int result = 1;
        for (int i = 0; i < length; i++) {
            if (seats[i] == 1) {
                continue;
            }
            int tempMax = 1, left = i - 1, right = i + 1;
            while (true) {
                if (left >= 0 && left < length) {
                    if (seats[left] == 1) {
                        break;
                    } else {
                        left--;
                    }
                }
                if (right >= 0 && right < length) {
                    if (seats[right] == 1) {
                        break;
                    } else {
                        right++;
                    }
                }
                tempMax++;
            }

            if (tempMax > result) {
                result = tempMax;
            }
        }
        return result;
    }
}
