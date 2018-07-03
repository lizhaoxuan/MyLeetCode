package me.ele.example.myleetcode.easy;

import org.junit.Test;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class RmoveDuplicatesFromSortedList {

    @Test
    public void test() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(1);
        n1.next.next = new ListNode(2);
        ListNode node = deleteDuplicates(n1);
        System.out.println("  ");
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
    }

    @Test
    public void test1() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(1);
        n1.next.next = new ListNode(2);
        n1.next.next.next = new ListNode(3);
        n1.next.next.next.next = new ListNode(3);
        ListNode node = deleteDuplicates(n1);
        System.out.println("  ");
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
    }

    @Test
    public void test2() {
        ListNode n1 = new ListNode(1);
        ListNode node = deleteDuplicates(n1);
        System.out.println("  ");
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
    }

    @Test
    public void test3() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(1);
        ListNode node = deleteDuplicates(n1);
        System.out.println("  ");
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null) {
            int temp = node.val;
            while (node.next != null && temp == node.next.val) {
                node.next = node.next.next;
            }
            node = node.next;
        }

        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
