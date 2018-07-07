package me.ele.example.myleetcode.linkedList.easy;

import org.junit.Test;

/**
 * 21.合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class $21MergeTwoSortedLists {

    @Test
    public void mergeTwoSortedLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode merge = mergeTwoListsOpt(l1, l2);

        while (merge != null) {
            System.out.print(merge.val + " ");
            merge = merge.next;
        }
        System.out.print("null");
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merge = null;
        ListNode first = null;

        while (l1 != null || l2 != null) {
            if (merge == null) {
                if (l2 == null) {
                    merge = l1;
                    l1 = l1.next;
                } else if (l1 == null) {
                    merge = l2;
                    l2 = l2.next;
                } else {
                    if (l1.val <= l2.val) {
                        merge = l1;
                        l1 = l1.next;
                    } else {
                        merge = l2;
                        l2 = l2.next;
                    }
                }
                first = merge;
            } else if (l1 == null) {
                merge.next = l2;
                l2 = l2.next;
                merge = merge.next;
            } else if (l2 == null) {
                merge.next = l1;
                l1 = l1.next;
                merge = merge.next;
            } else {
                if (l1.val <= l2.val) {
                    merge.next = l1;
                    l1 = l1.next;
                    merge = merge.next;
                } else {
                    merge.next = l2;
                    l2 = l2.next;
                    merge = merge.next;
                }
            }
        }

        return first;
    }

    private ListNode mergeTwoListsOpt(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }

        if (l1 == null) {
            cur.next = l2;
        }

        if (l2 == null) {
            cur.next = l1;
        }

        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}
