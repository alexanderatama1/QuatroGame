package unoquattro;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand;
    private boolean isHuman;

    public Player(String name, boolean isHuman) {
        this.name = name;
        this.isHuman = isHuman;
        this.hand = new ArrayList<>();
    }

    // Getter and Setter for the name field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter for the isHuman field
    public boolean isHuman() {
        return isHuman;
    }

    // Getter and Setter for the hand field
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    // Method to add a card to the player's hand
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    // Method to remove a card from the player's hand
    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }

    // Method to check if the player's hand is empty
    public boolean isHandEmpty() {
        return hand.isEmpty();
    }

    // Method to get the size of the player's hand
    public int getHandSize() {
        return hand.size();
    }
}


