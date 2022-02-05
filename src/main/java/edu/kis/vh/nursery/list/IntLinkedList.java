package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int VALUE_EMPTY_LIST = -1;
	private Node last;
    private int valueInt;
    
    public void push(int inputValue) {
        if (last == null)
            last = new Node(inputValue);
        else {
            last.setNext(new Node(inputValue));
            last.getNext().setPrev(last);
            last = last.getNext();
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
            return VALUE_EMPTY_LIST;
        return last.getValue();
    }
    
    public int pop() {
        if (isEmpty())
            return VALUE_EMPTY_LIST;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getValueInt() {
        return valueInt;
    }

    public void setValueInt(int valueInt) {
        this.valueInt = valueInt;
    }
}
