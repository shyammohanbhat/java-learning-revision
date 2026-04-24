package com.revision.linkedlist;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    public void printListNode(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    /*
    * Time Complexity: O(1)
    * */
    public ListNode insertFirst(ListNode head, ListNode node){
        if (head == null) {
            return node;
        }

        node.next = head;
        head = node;
        return head;
    }

    /*
    * Time Complexity: O(n)
     */
    public ListNode insertLast(ListNode head, ListNode node){
        if (head == null) {
            return node;
        }

        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = node;
        return head;
    }

    /*
     * Time Complexity: O(1)
     */
    public void deleteNode(ListNode node) {
        // Assumption: node is NOT the last node
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode deleteHeadNode(ListNode head){
        if(head == null) return  null;
        head = head.next;
        return head;
    }

    /*
     * Time Complexity: O(n)
     */
    public ListNode deleteTailNode(ListNode head){
        if(head == null) return  null;
        if(head.next == null) return null;

        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return  head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode l = new ListNode(10);
        ListNode node = new ListNode(5);
        l = listNode.insertFirst(l, node);
        l = listNode.insertLast(l, new ListNode(11));
        l = listNode.insertFirst(l, new ListNode(12));
        l = listNode.insertFirst(l, new ListNode(13));
        listNode.printListNode(l);

        System.out.println("------------------------------------");
        l=listNode.deleteHeadNode(l);
        listNode.printListNode(l);

        System.out.println("------------------------------------");

        listNode.deleteNode(node);
        listNode.printListNode(l);

        System.out.println("------------------------------------");

        l=listNode.deleteTailNode(l);
        listNode.printListNode(l);
    }
}
