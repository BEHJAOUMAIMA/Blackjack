import services.CardService;
import services.*;
import java.util.Scanner;


public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService gameService = new GameService();
        PlayerService playerService = new PlayerService(gameService);
        DealerService dealerService = new DealerService(gameService);
        CardService cardService = new CardService();


        int[] initialCard = {1, 1};
        int[][] deck = cardService.createNextCards(initialCard);
        deck = cardService.shuffleDeck(deck);

        int money = 1000;

        while (money > 0) {
            int bet = playerService.takeBet(scanner, money);

            int[][] playerHand = new int[5][2];
            int[][] dealerHand = new int[5][2];

            int[][][] drawResult = CardService.piocherCartes(deck, 3);
            playerHand[0] = drawResult[0][0];
            playerHand[1] = drawResult[0][1];
            dealerHand[0] = drawResult[1][0];
            deck = drawResult[1];

            System.out.println("Votre main :");
            System.out.println(CardService.printCard(playerHand[0][0], playerHand[0][1]));
            System.out.println(CardService.printCard(playerHand[1][0], playerHand[1][1]));

            System.out.println("Carte du croupier :");
            System.out.println(CardService.printCard(dealerHand[0][0], dealerHand[0][1]));

            playerService.playerTurn(deck, playerHand, scanner);

            dealerService.dealerTurn(deck, dealerHand);

            int playerScore = gameService.calculateScore(playerHand);
            int dealerScore = gameService.calculateScore(dealerHand);

            money = gameService.determineWinner(playerScore, dealerScore, bet, money);

            System.out.println("Argent restant : " + money);

            System.out.println("Voulez-vous continuer à jouer ? (oui/non)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("oui")) {
                break;
            }
        }

        System.out.println("Merci d'avoir joué au Blackjack !");
        scanner.close();
        //int[] initialCard = {1, 1};

        /*int[][] deck = cardService.createNextCards(initialCard);

        for (int i = 0; i < deck.length; i++) {
            int cardValue = deck[i][0];
            int cardSymbol = deck[i][1];

            String cardString = cardService.printCard(cardValue, cardSymbol);

            System.out.println(cardString);
        }*/

       // int[][] deck = cardService.createNextCards(new int[] {1, 1});

        //Melanger les cartes

        /*System.out.println("Deck initial :");
        for (int i = 0; i < deck.length; i++) {
            System.out.println(Arrays.toString(deck[i]));
        }

        int[][] shuffledDeck = cardService.shuffleDeck(deck);

        System.out.println("\nDeck mélangé :");
        for (int i = 0; i < shuffledDeck.length; i++) {
            System.out.println(Arrays.toString(shuffledDeck[i]));
        }*/

        //Tirer une carte

        /*int[][][] result = cardService.drawCard(deck);

        int[] drawnCard = result[0][0];
        System.out.println("Carte tirée : " + Arrays.toString(drawnCard));

        int[][] remainingCards = result[1];
        System.out.println("Cartes restantes :");
        for (int i = 0; i < remainingCards.length; i++) {
            System.out.println(Arrays.toString(remainingCards[i]));
        }*/

        // Extraire une carte

        /*int indice = 51;

        int[][][] result1 = cardService.extraireIemeCarte(deck, indice);

        int[] drawn_card = result1[0][0];
        System.out.println("Carte tirée : " + Arrays.toString(drawn_card));

        int[][] remainingCards = result1[1];
        System.out.println("Cartes restantes :");
        for (int i = 0; i < remainingCards.length; i++) {
            System.out.println(Arrays.toString(remainingCards[i]));
        }*/

        //Afficher les cartes ( Creer des cartes a travers une carte initiale)

        /*if (deck.length == 0) {
            System.out.println("Carte initiale non trouvée !");
        } else {
            System.out.println("Cartes du jeu :");
            for (int i = 0; i < deck.length; i++) {
                int card_number = deck[i][0];
                int card_symbol = deck[i][1];
                System.out.println("{" + card_number + "," + card_symbol+ "}" );
            }
        }*/


    }
        /*CardController cardController = new CardController();
        String welcomeToGame = cardController.welcomeToGame();

        System.out.println(welcomeToGame);

        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1 :
                String rules = cardController.getRules();
                System.out.println(rules);
                break;
            case 2 :

                break;
            default:
                System.out.println("Choix Invalide !");
                break;
        }*/
        /*int[][] packet = cardController.createCards();
        String cards = cardController.displayCards(packet);
        System.out.println(cards);*/
}

