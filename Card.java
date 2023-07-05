
package unoquattro;

// Card.java
public abstract class Card {

    private String code;

    public Card(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public abstract boolean canMatch(Card card);
    // The abstract method canMatch() will be implemented by subclasses to determine if a card can match another card.
}
