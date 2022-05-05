package com.leetcode.practice.days.Day1;

public class MyLinkedList {

    Node head;
    Node tail;
    int count;

    public MyLinkedList() {

        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        count = 0;

    }

    public int get(int index) {

        if (index < 0 || index >= count) {
            return -1;
        }
        Node curr = head.next;
        int idx = 0;
        while (idx<index){
            idx++;
            curr=curr.next;
        }
        return curr.val;


    }

    public void addAtHead(int val) {
       Node newNode = new Node(val);
       newNode.next = head.next;
       newNode.prev = head;
       head.next.prev = newNode;

    }

    public void addAtTail(int val) {
        this.val = val;

    }

    public void addAtIndex(int index, int val) {
        this.val = val;
        this.index = index;

    }

    public void deleteAtIndex(int index) {
        this.index = index - 1;

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);

        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);
        System.out.println(myLinkedList);
    }
}

class Node {
    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;
        next = null;
        prev = null;

    }

}
