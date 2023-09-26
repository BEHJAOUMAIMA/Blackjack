import controllers.CardController;
import services.CardService;

import java.util.Arrays;
import java.util.Scanner;


public class BlackJackApp {
    public static void main(String[] args) {
        CardService cardService = new CardService();

        int[][] deck = cardService.createNextCards(new int[] {1, 1});

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

