package src.services;

public class CardService {
    int[][] paquette = {
            {1,1}, {2,1}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1} , {9,1}, {10,1}, {11,1}, {12,1}, {13,1},
            {1,2}, {2,2}, {3,2}, {4,2}, {5,2}, {6,2}, {7,2}, {8,2} , {9,2}, {10,2}, {11,2}, {12,2}, {13,2},
            {1,3}, {2,3}, {3,3}, {4,3}, {5,3}, {6,3}, {7,3}, {8,3} , {9,3}, {10,3}, {11,3}, {12,3}, {13,3},
            {1,4}, {2,4}, {3,4}, {4,4}, {5,4}, {6,4}, {7,4}, {8,4} , {9,4}, {10,4}, {11,4}, {12,4}, {13,4},
    };

    public int[][] createCards(){
        int[][] deck = new int[52][2];
        System.arraycopy(paquette, 0, deck, 0, 52);
        return  deck;
    }

    public String displayCards(int[][] deck){
        String cards = "";
        for (int[] card : deck){
            cards += "(" + card[0] + " " + card[1] + ")\n";
        }
        return cards;
    }
}
