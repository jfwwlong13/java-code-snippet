package design.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class CardIterator implements Iterator<Card> {
    private final List<Card> cards;
    private int index = 0;

    CardIterator(final List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean hasNext() {
        return index < cards.size();
    }

    @Override
    public Card next() {
        return cards.get(index++);
    }
}
