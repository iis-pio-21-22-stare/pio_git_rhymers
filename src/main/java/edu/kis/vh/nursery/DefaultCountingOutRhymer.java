package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ELEVEN = 11;

	private static final int MINUS_1 = -1;

	private static final int TWELVE = 12;

	private final int[] numbers = new int[TWELVE];

    public int total = MINUS_1;

    public void countIn(int inputValue) {
        if (!isFull())
            numbers[++total] = inputValue;
    }

    public boolean callCheck() {
        return total == MINUS_1;
    }
    
    public boolean isFull() {
        return total == ELEVEN;
    }
    
    protected int peekaboo() {
        if (callCheck())
            return MINUS_1;
        return numbers[total];
    }
    
    public int countOut() {
        if (callCheck())
            return MINUS_1;
        return numbers[total--];
    }
}
