package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int FULL_ARRAY_RHYMERS = 11;

	private static final int EMPTY_ARRAY_RHYMERS = -1;

	private static final int MAX_QUANTITY_RHYMERS = 12;

	private final int[] numbers = new int[MAX_QUANTITY_RHYMERS];

    private int total = EMPTY_ARRAY_RHYMERS;

    public int getTotal() {
        return total;
    }

    public void countIn(int inputValue) {
        if (!isFull())
            numbers[++total] = inputValue;
    }

    public boolean callCheck() {
        return total == EMPTY_ARRAY_RHYMERS;
    }
    
    public boolean isFull() {
        return total == FULL_ARRAY_RHYMERS;
    }
    
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_ARRAY_RHYMERS;
        return numbers[total];
    }
    
    public int countOut() {
        if (callCheck())
            return EMPTY_ARRAY_RHYMERS;
        return numbers[total--];
    }
}
