public class SnakeAndLadder {
    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;
        int diceCount = 0;
        boolean player1Turn = true;

        System.out.println("Welcome to Snake and Ladder Game\n");

        while (player1 < 100 && player2 < 100) {

            int dice = (int) (Math.random() * 6) + 1;   // Dice 1–6
            int option = (int) (Math.random() * 3);    // 0,1,2
            diceCount++;

            if (player1Turn) {
                System.out.println("Player 1 rolled dice: " + dice);

                if (option == 0) {
                    System.out.println(" No Play");
                } 
                else if (option == 1) {
                    System.out.println(" Ladder");
                    if (player1 + dice <= 100)
                        player1 += dice;
                    System.out.println("Player 1 gets another turn");
                } 
                else {
                    System.out.println(" Snake");
                    player1 -= dice;
                }

                if (player1 < 0)
                    player1 = 0;

                System.out.println("Player 1 Position: " + player1 + "\n");

                if (option != 1)
                    player1Turn = false;

            } else {
                System.out.println("Player 2 rolled dice: " + dice);

                if (option == 0) {
                    System.out.println(" No Play");
                } 
                else if (option == 1) {
                    System.out.println(" Ladder");
                    if (player2 + dice <= 100)
                        player2 += dice;
                    System.out.println("Player 2 gets another turn");
                } 
                else {
                    System.out.println(" Snake");
                    player2 -= dice;
                }

                if (player2 < 0)
                    player2 = 0;

                System.out.println("Player 2 Position: " + player2 + "\n");

                if (option != 1)
                    player1Turn = true;
            }
        }

        if (player1 == 100)
            System.out.println("Player 1 WON the game");
        else
            System.out.println("Player 2 WON the game");

        System.out.println("Total Dice Rolls: " + diceCount);
    }
}
