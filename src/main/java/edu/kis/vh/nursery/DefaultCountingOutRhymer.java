package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_INITIAL_TOTAL = -1; // Domyślna wartość total
    private static final int MAX_CAPACITY = 12; // Maksymalna pojemność tablicy
    private static final int MAX_INDEX = MAX_CAPACITY - 1; // Maksymalny indeks tablicy
    private final int[] numbers = new int[MAX_CAPACITY];
    private int total = DEFAULT_INITIAL_TOTAL;

    private int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_INITIAL_TOTAL;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_INITIAL_TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_INITIAL_TOTAL;
        return numbers[total--];
    }
}