package edu.kis.vh.nursery.list;

public class IntLinkedList {

    int value;
    Node last;

    private class Node {

        public int value;
        public Node prev, next;
        public Node(final int data) {
            value = data;
        }

    }


    public void push(final int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.next = new Node(value);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
