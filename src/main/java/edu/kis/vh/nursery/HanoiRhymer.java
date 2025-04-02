package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza DefaultCountingOutRhymer
 * i dodaje logikę odrzucania elementów większych niż szczyt stosu.
 * Przydaje się do testowania selektywnego przyjmowania danych wejściowych.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Licznik odrzuconych wartości.
     * Wartość jest zwiększana, gdy liczba wejściowa jest większa od szczytu stosu.
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych elementów (takich, które nie zostały dodane do stosu).
     *
     * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje wartość na stos, chyba że jest większa od szczytowego elementu – wtedy ją odrzuca.
     *
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
