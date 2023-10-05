package services;

import java.util.Scanner;

public class PlayerService {
    private GameService gameService;

    public PlayerService(GameService gameService) {
        this.gameService = gameService;
    }

    public int takeBet(Scanner scanner, int money) {
        int bet = 0;
        while (bet <= 0 || bet > money) {
            System.out.println("Combien voulez-vous miser ? (1-" + money + ")");
            bet = scanner.nextInt();
        }
        return bet;
    }
    public int[][] playerTurn(int[][] deck, int[][] playerHand, Scanner scanner) {
        int playerScore = gameService.calculateScore(playerHand);
        int handIndex = 0;

        while (playerScore < 21 && handIndex < 5) {
            System.out.println("Tapez 'h' pour tirer une carte ou 's' pour rester.");
            char choice = scanner.next().charAt(0);

            if (choice == 'h') {
                int[][][] result = CardService.tirerCarte(deck);
                int[][] drawnCard = result[0];
                int[][] remainingCards = result[1];

                int index = 0;
                while (playerHand[index][0] != 0) {
                    index++;
                }

                playerHand[index][0] = drawnCard[0][0];
                playerHand[index][1] = drawnCard[0][1];
                handIndex++;
                playerScore = gameService.calculateScore(playerHand);

                deck = remainingCards;

                System.out.println("Carte tirée :");
                System.out.println(CardService.printCard(drawnCard[0][0], drawnCard[0][1]));

                System.out.println("Votre main :");
                for (int i = 0; i < playerHand.length && playerHand[i][0] != 0; i++) {
                    System.out.println(CardService.printCard(playerHand[i][0], playerHand[i][1]));
                }
            } else if (choice == 's') {
                break;
            }
        }

        return deck;
    }


}
