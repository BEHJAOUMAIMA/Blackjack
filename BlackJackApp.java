import src.controllers.CardController;

import java.util.Scanner;

public class BlackJackApp {
    public static void main(String[] args) {
        CardController cardController = new CardController();
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
        }
        /*int[][] packet = cardController.createCards();
        String cards = cardController.displayCards(packet);
        System.out.println(cards);*/
    }
}
