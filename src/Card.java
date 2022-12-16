import java.util.HashSet;
import java.util.Objects;

public class Card {

    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit.equals(card.suit) && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
