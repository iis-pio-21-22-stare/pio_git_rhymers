package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int _minus1 = -1;
	Node last;
    int valueInt;
    
    public void push(int inputValue) {
        if (last == null)
            last = new Node(inputValue);
        else {
            last.next = new Node(inputValue);
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
            return _minus1;
        return last.value;
    }
    
    public int pop() {
        if (isEmpty())
            return _minus1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
