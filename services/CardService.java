package services;

public class CardService {
    public int[][] createNextCards(int[] initialCard) {
        int[][] deck = new int[52][2];
        int cardNumber = initialCard[0];
        int cardSymbol = initialCard[1];
        int index = 0;

        for (int symbol = cardSymbol; symbol <= 4 ; symbol++) {
            for (int number = (symbol == cardSymbol ? cardNumber : 1); number <= 13 ; number++) {
                deck[index][0] = number;
                deck[index][1] = symbol;
                index++;
            }
        }

        int[][] result = new int[index][2];

        for (int i = 0; i < index; i++) {
            result[i][0] = deck[i][0];
            result[i][1] = deck[i][1];
        }

        return result;
    }



}
