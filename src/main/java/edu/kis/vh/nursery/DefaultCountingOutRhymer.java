package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int _11 = 11;

	private static final int _minus1 = -1;

	private static final int _12 = 12;

	private int[] numbers = new int[_12];

    public int total = _minus1;

    public void countIn(int inputValue) {
        if (!isFull())
            numbers[++total] = inputValue;
    }

    public boolean callCheck() {
        return total == _minus1;
    }

    public boolean isFull() {
        return total == _11;
    }

    protected int peekaboo() {
        if (callCheck())
            return _minus1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return _minus1;
        return numbers[total--];
    }
}
