package xyz.lanyi.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_2 {
    public static void main(String[] args) {

    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l2;

        int sum = l1.val + l2.val;
        while (l1.next != null && l2.next != null) {
            l2.val = sum % 10;
            l2.next.val = sum / 10;

            l1 = l1.next;
            l2 = l2.next;

            sum = l1.val + l2.val;
        }
        if (l1.next == null && l2.next == null && sum >= 10) {
            l2.next = new ListNode();
            l2.next.val = 0;
        }
        if (l2.next == null && l1.next != null) {
            l2.next = l1.next;
        }
        if (sum >= 10) {
            l2.next.val += 1;
        }
        return result;
    }
}
