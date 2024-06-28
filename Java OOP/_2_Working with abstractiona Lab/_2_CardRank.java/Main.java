package _2_CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank[] cardRanks = CardRank.values();

        //"клъбс" е спатия
        //"даймъндс" е каро
        //"хартс" е купа
        //"спейдс" е пика

        System.out.println("Card Ranks:");
        for (CardRank cardRank : cardRanks) {
            int ordinal = cardRank.ordinal();
            System.out.printf("Ordinal value: %d; Name value: %s\n", ordinal, cardRank);
        }
    }
}
//Card Ranks:
//Ordinal value: 0; Name value: ACE
// Ordinal value: 1; Name value: TWO
// Ordinal value: 2; Name value: THREE
// Ordinal value: 3; Name value: FOUR
// Ordinal value: 4; Name value: FIVE
// Ordinal value: 5; Name value: SIX
// Ordinal value: 6; Name value: SEVEN
// Ordinal value: 7; Name value: EIGHT
// Ordinal value: 8; Name value: NINE
// Ordinal value: 9; Name value: TEN
// Ordinal value: 10; Name value: JACK
// Ordinal value: 11; Name value: QUEEN
// Ordinal value: 12; Name value: KING
