import java.util.*;

public class CardGame {

    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;
        return deck;
    }

    static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int rand = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length || n % x != 0) {
            System.out.println("Cannot distribute " + n + " cards to " + x + " players evenly.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < x; i++)
            for (int j = 0; j < cardsPerPlayer; j++)
                players[i][j] = deck[index++];
        return players;
    }

    static void printPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i])
                System.out.println("  " + card);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int x = sc.nextInt(); 

        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, n, x);
        printPlayers(players);
    }
}
