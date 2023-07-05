package unoquattro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class QuattroGame {

    private List<Card> drawPile;
    private List<Card> discardPile;
    private List<Player> players;
    private Scanner scanner;

    public QuattroGame() {
        drawPile = new ArrayList<>();
        discardPile = new ArrayList<>();
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        createCards();
        createPlayers();
        dealCards();
        playFirstCard();
        playByTurn();
    }

    private void createCards() {
        // Create all cards
        // ...
    }

    private void createPlayers() {
        // Create human player
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        while (name.isEmpty()) {
            System.out.println("Please enter your name:");
            name = scanner.nextLine();
        }

        players.add(new Player(name, true));

        // Create bot players
        // ...
    }

    private void dealCards() {
        // Deal cards to players
        // ...
    }

    private void playFirstCard() {
        // Show the top card from discard pile
        // ...
    }

    private void playByTurn() {
        // ...

        while (!gameWon) {
            // ...

            // Let the human player enter their option and process the game accordingly
            if (currentPlayer.isHuman()) {
                System.out.println("Your turn! Enter the card index to play (0-" + (handSize - 1) + "):");
                int cardIndex = -1;
                boolean validInput = false;

                while (!validInput) {
                    try {
                        cardIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        // Check if the entered card index is valid
                        if (cardIndex >= 0 && cardIndex < handSize) {
                            validInput = true;
                        } else {
                            throw new IllegalArgumentException("Invalid card index. Please enter a valid card index.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Please try again:");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid card index.");
                        System.out.println("Please try again:");
                        scanner.nextLine(); // Consume the invalid input
                    }
                }

                // Process the game based on the human player's selected card
                try {
                    Card selectedCard = currentPlayer.getCard(cardIndex);
                    // ... Process the selected card
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Please try again:");
                    continue; // Continue to the next iteration of the loop
                }
            }

            // ...
        }
    }

    // Other methods and classes...
    public static void main(String[] args) {
        QuattroGame game = new QuattroGame();
        game.playGame();
    }
}
