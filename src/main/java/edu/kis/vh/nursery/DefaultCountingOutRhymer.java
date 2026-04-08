package edu.kis.vh.nursery;
/**
 * Klasa reprezentuje stos do wyliczanek liczbowych.
 * Umożliwia dodawanie liczb i pobieranie ich w odwrotnej kolejności (LIFO).
 */
public class DefaultCountingOutRhymer {
    /**
     * Zwraca całkowitą liczbę elementów w stosie.
     * @return liczba elementów
     */
    public int getTotal() {
        return total;
    }

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_INDEX = -1;
    private static final int DEFAULT_VALUE = -1;

    private int total = -1;

    private int[] numbers = new int[MAX_SIZE];
    /**
     * Dodaje element do stosu, jeśli stos nie jest pełny.
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza, czy stos jest pusty
     * @return true jeśli stos jest pusty, false w przeciwnym przypadku
     */
    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }
    /**
     * Sprawdza, czy stos jest pełny
     * @return true jeśli stos jest pełny
     */
    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }
    /**
     * Zwraca ostatni element na stosie bez usuwania go.
     * @return ostatni element lub -1 jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }
    /**
     * Zwraca ostatni element i usuwa go ze stosu.
     * @return ostatni element lub -1 jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
}