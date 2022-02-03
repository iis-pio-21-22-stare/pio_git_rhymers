package edu.kis.vh.nursery.list;

/**
 * Klasa do przechowywania elementu listy dwukierunkowej
 */

public class Node {

    private int value;
    private Node prev;
    private Node next;

    /**
     * Konstruktor ustawiający początkową wartość elementu
     * @param i
     */

    public Node(int i) {
        setValue(i);
    }

    /**
     * Metoda zwracająca wartość elementu
     * @return value
     */

    public int getValue() {
        return value;
    }

    /**
     * Metoda ustawiająca wartość elementu
     * @param value
     */

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Metoda zwracająca poprzedni element
     * @return prev
     */

    public Node getPrev() {
        return prev;
    }

    /**
     * Metoda ustawiająca poprzedni element
     * @param prev
     */

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Metoda zwracająca następny element
     * @return next
     */

    public Node getNext() {
        return next;
    }

    /**
     * Metoda ustawiająca następny element
     * @param next
     */

    public void setNext(Node next) {
        this.next = next;
    }
}
