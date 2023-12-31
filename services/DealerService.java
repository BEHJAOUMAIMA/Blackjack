package services;

public class DealerService {
    private GameService gameService;

    public DealerService(GameService gameService) {
        this.gameService = gameService;
    }

    public void dealCard(int[][] hand, int[][] deck, int score) {
        int cardIndex = score;
        hand[cardIndex][0] = deck[score][0];
        hand[cardIndex][1] = deck[score][1];
    }

    public int[][] dealerTurn(int[][] deck, int[][] dealerHand) {
        int dealerScore = gameService.calculateScore(dealerHand);

        while (dealerScore < 17) {
            int[][][] result = CardService.tirerCarte(deck);
            int[][] drawnCard = result[0];
            int[][] remainingCards = result[1];

            int index = 0;
            while (dealerHand[index][0] != 0) {
                index++;
            }

            dealerHand[index][0] = drawnCard[0][0];
            dealerHand[index][1] = drawnCard[0][1];
            dealerScore = gameService.calculateScore(dealerHand);

            deck = remainingCards;

            System.out.println("Carte tirée par le croupier :");
            System.out.println(CardService.printCard(drawnCard[0][0], drawnCard[0][1]));

            System.out.println("Main du croupier :");
            for (int i = 0; i < dealerHand.length && dealerHand[i][0] != 0; i++) {
                System.out.println(CardService.printCard(dealerHand[i][0], dealerHand[i][1]));
            }
        }

        return deck;
    }
}
