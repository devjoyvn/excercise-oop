package b8;

import java.util.ArrayList;
import java.util.List;

public class ManagerCard {

    private List<Card> cards;

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public boolean delete(String id) {
        Card card = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }
}
