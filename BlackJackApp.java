import controllers.CardController;
import services.CardService;

import java.util.Scanner;


public class BlackJackApp {
    public static void main(String[] args) {
        CardService cardService = new CardService();

        int[][] deck = cardService.createNextCards(new int[] {1, 1});

        if (deck.length == 0) {
            System.out.println("Carte initiale non trouvée !");
        } else {
            System.out.println("Cartes du jeu :");
            for (int i = 0; i < deck.length; i++) {
                int card_number = deck[i][0];
                int card_symbol = deck[i][1];
                System.out.println("{" + card_number + "," + card_symbol+ "}" );
            }
        }

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

