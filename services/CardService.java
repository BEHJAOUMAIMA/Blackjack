package services;

import java.util.Random;

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
    public int[][][] extraireIemeCarte(int[][] cards, int indice) {
        if (indice < 0 || indice >= cards.length) {
            return new int[0][][];
        }
        int[][] carteExtraite = { cards[indice] };
        int[][] cartesRestantes = new int[cards.length - 1][2];
        int new_index = 0;

        for (int i = 0; i < cards.length; i++) {
            if (i != indice) {
                cartesRestantes[new_index++] = cards[i];
            }
        }

        int[][][] result = new int[2][][];
        result[0] = carteExtraite;
        result[1] = cartesRestantes;

        return result;
    }
    public int[][][] drawCard(int[][] cards) {
        Random random = new Random();
        int index = random.nextInt(cards.length);
        int[][] remainingCards = new int[cards.length - 1][2];
        int newIndex = 0;

        for (int i = 0; i < cards.length; i++) {
            if (i != index) {
                remainingCards[newIndex][0] = cards[i][0];
                remainingCards[newIndex][1] = cards[i][1];
                newIndex++;
            }
        }

        int[][][] result = new int[2][][];
        result[0] = new int[][] { { cards[index][0], cards[index][1] } };
        result[1] = remainingCards;

        return result;
    }
    public int[][] shuffleDeck(int[][] deck) {
        int[][] shuffledDeck = new int[deck.length][2];
        int[] shuffledIndices = new int[deck.length];

        for (int i = 0; i < deck.length; i++) {
            shuffledIndices[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            int temp = shuffledIndices[i];
            shuffledIndices[i] = shuffledIndices[randomIndex];
            shuffledIndices[randomIndex] = temp;
        }

        for (int i = 0; i < deck.length; i++) {
            shuffledDeck[i] = deck[shuffledIndices[i]];
        }

        return shuffledDeck;
    }
    public int[][][] drawNCards(int[][] deck, int n) {
        if (n > deck.length) {
            return new int[0][][];
        }

        int[][] drawnCards = new int[n][2];
        int[][] remainingCards = new int[deck.length - n][2];

        for (int i = 0; i < n; i++) {
            drawnCards[i] = deck[i];
        }

        for (int i = n; i < deck.length; i++) {
            remainingCards[i - n] = deck[i];
        }

        return new int[][][] { drawnCards, remainingCards };
    }
    public int[][][] defausserCartes(int[][][] deck, int[][] cardsToDiscard) {
        int n = deck[0].length;
        int m = deck[1].length;

        int[][][] updatedDeck = new int[2][][];
        updatedDeck[0] = new int[n + cardsToDiscard.length][2];
        updatedDeck[1] = new int[m - cardsToDiscard.length][2];

        for (int i = 0; i < n; i++) {
            updatedDeck[0][i] = deck[0][i];
        }

        for (int i = 0; i < m; i++) {
            updatedDeck[1][i] = deck[1][i];
        }

        for (int i = 0; i < cardsToDiscard.length; i++) {
            updatedDeck[0][n + i] = cardsToDiscard[i];
        }

        return updatedDeck;
    }

}
