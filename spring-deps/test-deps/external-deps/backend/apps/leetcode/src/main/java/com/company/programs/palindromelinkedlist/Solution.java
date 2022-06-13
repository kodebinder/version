package com.company.programs.palindromelinkedlist;

import java.util.Stack;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 * <p>
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 * <p>
 * Constraints:
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head1 = null;
        MyLinkedList list1 = new MyLinkedList();
        head1 = list1.insert(1, head1);
        head1 = list1.insert(2, head1);
        head1 = list1.insert(2, head1);
        head1 = list1.insert(1, head1);
        list1.printList(head1);
        System.out.println();

        System.out.println(list1.isPalindrome(head1));

        ListNode head2 = null;
        MyLinkedList list2 = new MyLinkedList();
        head2 = list2.insert(1, head2);
        head2 = list2.insert(2, head2);
        list2.printList(head2);
        System.out.println();

        System.out.println(list2.isPalindrome(head2));
    }

}

class MyLinkedList {

    /*
     * getNewNode() method to generate a new node
     */
    public ListNode getNewNode(int key) {
        ListNode a = new ListNode();
        a.next = null;
        a.val = key;
        return a;
    }

    /*
     * insert method is used to insert the element in Linked List
     */
    public ListNode insert(int key, ListNode node) {

        if (node == null)
            return getNewNode(key);
        else
            node.next = insert(key, node.next);

        return node;
    }

    /*
     * It'll print the complete linked list
     */
    public void printList(ListNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        printList(node.next);
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slowPointer = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<>();
        while (slowPointer != null) {
            stack.push(slowPointer.val);
            slowPointer = slowPointer.next;
        }

        while (head != null) {
            if (head.val == stack.pop()) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


