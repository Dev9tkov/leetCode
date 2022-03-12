package linkedlist.reverseLinkedList;

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/"></a>
 * <p>
 * 1-> 2-> 3-> 4-> 5-> null
 * <p>
 * null -> 5-> 4-> 3-> 2-> 1
 */
public class Solution {

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode nextNode = curNode.next; //save next elem
            curNode.next = prev;
            prev = curNode;
            curNode = nextNode;
        }
        return prev;
    }

    static class ListNode {
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        reverseList(l1);
    }
}
