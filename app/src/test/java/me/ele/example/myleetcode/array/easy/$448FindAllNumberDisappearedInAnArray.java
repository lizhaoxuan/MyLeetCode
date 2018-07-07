package me.ele.example.myleetcode.array.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * 示例:
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * 输出:
 * [5,6]
 */
public class $448FindAllNumberDisappearedInAnArray {

    @Test
    public void test() {
        List<Integer> result = findDisappearedNumbers(4, 3, 2, 7, 8, 2, 3, 1);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    /**
     * 交换到正确的index，需要注意的是避免相同的数交换引起死循环
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int... nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
