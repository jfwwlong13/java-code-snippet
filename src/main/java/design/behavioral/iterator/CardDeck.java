package design.behavioral.iterator;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardDeck implements Iterable<Card> {
    private final List<Card> cards = new ArrayList<>();

    public CardDeck() {
        final List<String> suits = ImmutableList.of("club", "diamond", "heart", "spade");
        for (int i = 1; i <= 13; i++) {
            for (String s : suits) {
                cards.add(new Card(i, s));
            }
        }
    }

    @Override
    public Iterator<Card> iterator() {
        return new CardIterator(cards);
    }
}
