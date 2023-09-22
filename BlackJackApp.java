import controllers.CardController;
import services.CardService;

import java.util.Scanner;

public class BlackJackApp {
    public static void main(String[] args) {
        CardService cardService = new CardService();

        int[][] deck = cardService.createCards(new int[] {1, 1});

        int[] givenCard = {7, 1};

        int[][] next_cards = cardService.nextCards(deck, givenCard);

        System.out.println("Cartes suivantes :");
        for (int i = 0; i < next_cards.length; i++) {
            int number = next_cards[i][0];
            int symbol = next_cards[i][1];
            System.out.println(number + " " + symbol);
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
}
