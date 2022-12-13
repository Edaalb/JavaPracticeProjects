package practiceQuestions;

public class Blackjack {

        //Blackjack keep hand
        //In blackjack after the player asks to keep the house 4 things may happen.
        //1. if the card total is bigger than 21 the player busts.
        //2. if the house score is bigger then the player, the player loses .
        //3. if the player score is equal to the house then they are a draw.
        //4. if the player score is bigger then the house the player wins.
        //player and house scores are represented by  player and house int variables.
        //check them using ifs to determine the result.
        //Example:
        //```
        //input:
        //8
        //21
        //output: player win
    
    public static void main(String[] args) {

        int player = 21;
        int house = 8;
        int card = 0;

        System.out.println("Score : ");

        if (card > 21 ) {
            System.out.println("The player busts");
        } else if  (house > player) {
            System.out.println("The player losts");
        } else if (player == house) {
            System.out.println("You are a draw");
        } else if (player > house) {
            System.out.println("The player wins");
        }
    }
}
