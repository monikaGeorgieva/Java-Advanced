import java.util.*;
import java.util.function.Consumer;

public class _7_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playerCards = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")){
            //Peter: 2C, 4H, 9H, AS, QS

           String name = input.split(": ")[0];
           String [] cards = input.split(": ")[1].split(", ");

            //1.Имам ли информация за тесте с карти за това име
            if (playerCards.containsKey(name)) {
                //Ако имам:
                playerCards.get(name).addAll(List.of(cards));
                //вземам досегашното тесте с карти и към него тези които е изтеглил

            }else {
                //Нов запис на този играч с празно тесте с карти
                playerCards.put(name,new HashSet<>());
                //към това празно тесте добавям тези които сега е изтеглил
                playerCards.get(name).addAll(List.of(cards));
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry :  playerCards.entrySet()) {

            String playerName = entry.getKey();
            Set<String> cards = entry.getValue();

            int totalCardValue = calculateValue(cards);
            System.out.printf("%s: %d\n",playerName,totalCardValue);
        }

    }

    private static int calculateValue(Set<String> cards) {
        int sum = 0;
        for (String card : cards) {

            //value = power * type;
            int cardValue;
            if (card.startsWith("10")){
                char cardType = card.charAt(2);
                cardValue = 10 * cardType;
            }else {
                char cardPower =  card.charAt(0);
                char cardType = card.charAt(1);
                cardValue = getSymbol(cardPower) * getSymbol(cardType);
            }
            sum += cardValue;
        }
        return sum;

    }
    private static int getSymbol(char symbol){
        int number = 0;
        switch (symbol){
            case '2' -> number = 2;
            case '3' -> number = 3;
            case '4' -> number = 4;
            case '5' -> number = 5;
            case '6' -> number = 6;
            case '7' -> number = 7;
            case '8' -> number = 8;
            case '9' -> number = 9;
            case 'J' -> number = 11;
            case 'Q' -> number = 12;
            case 'A' -> number = 14;
            case 'H' -> number = 3;
            case 'S' -> number = 4;
            case 'D' -> number = 2;
            case 'C' -> number = 1;
        }
        return  number;
    }
}
//Peter: 2C, 4H, 9H, AS, QS
//Slav: 3H, 10S, JC, KD, 5S, 10S
//Alex: QH, QC, QS, QD
//Slav: 6H, 7S, KC, KD, 5S, 10C
//Alex: QH, QC, JS, JD, JC
//Peter: JD, JD, JD, JD, JD, JD
//JOKER
//output:
//Peter: 167
//Slav: 175
//Alex: 197
