package unoquattro;

// StandardColourCard.java
public class StandardColourCard extends ColourCard {

    private int number;

    public StandardColourCard(String code, String color, int number) {
        super(code, color);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean canMatch(Card card) {
        if (card instanceof StandardColourCard) {
            StandardColourCard standardCard = (StandardColourCard) card;
            return super.canMatch(card) || this.number == standardCard.number;
            // A StandardColourCard can match another StandardColourCard if they have the same color or number.
        }
        return false;
        // By default, a StandardColourCard cannot match any other type of card.
    }
}
