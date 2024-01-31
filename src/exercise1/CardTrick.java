package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card c = new Card();
            Random rand = new Random();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            hand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[0]);
        hand[0] = luckyCard;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card (enter value and suit): ");
        int userValue = scanner.nextInt();
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }


    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Parv Patel, but you can call me Parv");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Cloud Computing and AI-ML enthusiast");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Travelling");
        System.out.println("-- Cycling");
        System.out.println("-- Watching Movies");
        System.out.println("-- Swimming");

        System.out.println();
        
    
    }

}
