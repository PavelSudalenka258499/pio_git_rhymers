package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public int getTotal() {
        return total;
    }

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_INDEX = -1;
    private static final int DEFAULT_VALUE = -1;

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
}