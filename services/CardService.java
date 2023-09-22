package services;

public class CardService {

    public int[][] createCards(int[] initialCard){
        int[][] paquette = new int[52][2];
        int cardNumber = initialCard[0];
        int cardSymbol = initialCard[1];
        int index = 0;
        for (int i = cardSymbol ; i<= 4 ; i++){
            for (int j = cardNumber; j<=13; j++){
                paquette[index][0] = j;
                paquette[index][1] = i;
                index++;
            }
            cardNumber = 1;
        }
        return  paquette;
    }

    public int[][] nextCards(int[][] cards, int[] givenCard ){
        int index = -1;
        for (int i = 0; i < cards.length; i++){
            if (cards[i][0] == givenCard[0] && cards[i][1] == givenCard[1]){
                index = i;
                break;
            }
        }
        if (index != -1){
            int[][] next_cards = new int[cards.length - index -1][2] ;
            int new_index = 0;
            for (int i = index +1; i<cards.length; i++){
                next_cards[new_index][0] = cards[i][0];
                next_cards[new_index][1] = cards[i][1];
                new_index++;
            }
        return  next_cards;
        }else{
            return new int[0][0];
        }
    }
}
