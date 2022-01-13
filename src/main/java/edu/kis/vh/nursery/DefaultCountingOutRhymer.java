package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    static final int DWANA=12;
    static final int MJEDEN=-1;
    static final int JEDENA=11;
    static final int JEDEN=1;

    private final int[] NUMBERS = new int[DWANA];
    public int total = MJEDEN;

    public void countin(int in) {
        if (!isfull())
            NUMBERS[++total] = in;
    }

    public boolean callcheck() {
        return total == MJEDEN;
    }

    public boolean isfull() {
        return total == JEDENA;
    }

    protected int peekaboo() {
        if (callcheck())
            return MJEDEN;
        return NUMBERS[total];
    }

    public int countout() {
        if (callcheck())
            return MJEDEN;
        return NUMBERS[total--];
    }


}
