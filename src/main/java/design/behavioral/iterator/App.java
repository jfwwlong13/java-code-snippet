package design.behavioral.iterator;

import java.util.Iterator;

public class App {
    public static void main(final String[] args) {
        final Iterator<Card> iterator = new CardDeck().iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card);
        }

        for (final Card card : new CardDeck()) {
            System.out.println(card);
        }
    }
}
