package services;

public class GameService {
    public void distributeCards(int[][][] deck, int[][] playerHand, int[][] dealerHand, int numCards) {
        if (deck[1].length < numCards * 2) {
            System.out.println("Il n'y a pas suffisamment de cartes restantes dans le deck.");
            return;
        }

        int[][][] result = CardService.piocherCartes(deck[1], numCards * 2);
        int[][] drawnCards = result[0];
        int[][] remainingCards = result[1];

        for (int i = 0; i < numCards; i++) {
            playerHand[i] = drawnCards[i];
        }
        for (int i = 0; i < numCards; i++) {
            dealerHand[i] = drawnCards[i + numCards];
        }

        deck[1] = remainingCards;
    }

    public int calculateScore(int[][] hand) {
        int score = 0;
        int numAces = 0;
        for (int i = 0; i < hand.length; i++) {
            int rank = hand[i][0];
            if (rank == 1) {
                score += 11;
                numAces++;
            } else if (rank >= 10) {
                score += 10;
            } else {
                score += rank;
            }
        }
        while (score > 21 && numAces > 0) {
            score -= 10;
            numAces--;
        }
        return score;
    }

    public int determineWinner(int playerScore, int dealerScore, int bet, int money) {
        System.out.println("Votre score : " + playerScore);
        System.out.println("Score du croupier : " + dealerScore);

        if (playerScore > 21) {
            System.out.println("Vous avez sauté ! Vous perdez " + bet + " euros.");
            money -= bet;
        } else if (dealerScore > 21) {
            System.out.println("Le croupier a sauté ! Vous gagnez " + bet + " euros.");
            money += bet;
        } else if (playerScore > dealerScore) {
            System.out.println("Vous gagnez " + bet + " euros.");
            money += bet;
        } else if (playerScore < dealerScore) {
            System.out.println("Le croupier gagne. Vous perdez " + bet + " euros.");
            money -= bet;
        } else {
            System.out.println("Égalité. Vous récupérez votre mise.");
        }
        return money;
    }

}
