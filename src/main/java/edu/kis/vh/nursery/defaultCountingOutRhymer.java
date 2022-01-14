package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    public static final int Size_Tab = 12;
    public static final int ErrCheck = -1;
    public static final int Numb = 11;
    // mam nadzieje ze wypiles kawe ktora ci zapazylem wczorajszego dnia, jak tam brzuszek ?
    private  final int[] numbers = new int[Size_Tab];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == Numb;
    }

    protected int peekaboo() {
        if (callCheck())
            return ErrCheck;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ErrCheck;
        return numbers[total--];
    }

}
