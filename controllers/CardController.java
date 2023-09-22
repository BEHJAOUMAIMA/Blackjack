package controllers;

public class CardController {
    int[][] packet = {
            {1,1}, {2,1}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1} , {9,1}, {10,1}, {11,1}, {12,1}, {13,1},
            {1,2}, {2,2}, {3,2}, {4,2}, {5,2}, {6,2}, {7,2}, {8,2} , {9,2}, {10,2}, {11,2}, {12,2}, {13,2},
            {1,3}, {2,3}, {3,3}, {4,3}, {5,3}, {6,3}, {7,3}, {8,3} , {9,3}, {10,3}, {11,3}, {12,3}, {13,3},
            {1,4}, {2,4}, {3,4}, {4,4}, {5,4}, {6,4}, {7,4}, {8,4} , {9,4}, {10,4}, {11,4}, {12,4}, {13,4},
    };

    public int[][] createCards(){
        int[][] deck = new int[52][2];
        System.arraycopy(packet, 0, deck, 0, 52);
        return  deck;
    }

    public String displayCards(int[][] deck){
        String cards = "";
        for (int[] card : deck){
            cards += "(" + card[0] + " " + card[1] + ")\n";
        }
        return cards;
    }
    public String welcomeToGame(){
        return "Bienvenue dans Black Jack !\n" +
                "Vous êtes prêt pour Jouer et Gagner ? \n"+
                "1- lire Les règles de Jeu ";
    }
    public String getRules(){
        return "Règles du jeu de blackjack :\n" +
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+
                "1. Le but du jeu est d'obtenir une main de cartes dont la valeur est la plus proche possible de 21, sans dépasser ce total.\n" +
                "2. Les cartes numérotées valent leur valeur nominale (par exemple, un 2 vaut 2 points).\n" +
                "3. Les cartes à figures (roi, dame, valet) valent chacune 10 points.\n" +
                "4. Les as peuvent valoir 1 ou 11 points, en fonction de ce qui est plus avantageux pour le joueur.\n" +
                "5. Chaque joueur reçoit deux cartes initiales, face visible. Le croupier reçoit une carte face visible et une carte face cachée.\n" +
                "6. Les joueurs peuvent choisir de 'rester' (ne pas prendre de carte supplémentaire) ou de 'tirer' (prendre une carte supplémentaire) à tour de rôle.\n" +
                "7. Le croupier suit des règles prédéfinies pour décider s'il doit tirer une carte supplémentaire ou non.\n" +
                "8. Le joueur ou le croupier qui atteint un total de 21 avec leurs deux premières cartes obtient un 'blackjack' et gagne la partie.\n" +
                "9. Si le total des cartes d'un joueur dépasse 21, il 'buste' et perd la partie.\n" +
                "10. Le joueur qui a la main la plus proche de 21 sans la dépasser gagne la partie.\n" +
                "11. En cas d'égalité (les deux mains ont le même total), la partie est nulle (push).\n" +
                "12. Les joueurs peuvent choisir de doubler leur mise après avoir reçu leurs deux premières cartes, mais cela les oblige à tirer une seule carte supplémentaire.\n" +
                "13. Les joueurs peuvent choisir de 'diviser' s'ils ont deux cartes de même valeur, créant ainsi deux mains séparées.\n" +
                "14. Le jeu continue jusqu'à ce que tous les joueurs aient terminé leur tour et que le croupier ait joué.\n" +
                "15. Le joueur qui a la main gagnante remporte la partie et la mise correspondante.\n" +
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+
                "2- Commencer le jeu\n"+
                "0- Quitter\n";
    }
}
