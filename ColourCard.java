
package unoquattro;

// ColourCard.java
public abstract class ColourCard extends Card {

    private String color;

    public ColourCard(String code, String color) {
        super(code);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean canMatch(Card card) {
        if (card instanceof ColourCard) {
            ColourCard colourCard = (ColourCard) card;
            return this.color.equals(colourCard.color);
            // A ColourCard can match another ColourCard if they have the same color.
        }
        return false;
        // By default, a ColourCard cannot match any other type of card.
    }
}
