import java.util.Scanner;

public class Game 
{
    private Scanner scan = new Scanner(System.in);
    private Board board;
    private Player player1; // player 1 is Red
    private Player player2; //Player 2 is Yellow
    private int playerNum = 2;


    public void play()
    {
        board = new Board();
        player1 = new Player(1);
        player2 = new Player(2);

        System.out.println(board);
        System.out.println("Player 1 = Red");
        System.out.println("PLayer 2 = Yellow" + "\n");
        while (!board.checkWin())
        {       
            if (playerNum == 1)
            {
                playerNum++;
                System.out.println("Player 2 Turn");
            }
            else
            {
                playerNum--;
                System.out.println("Player 1 Turn");
            }

            board.placeTile(playerNum);
            System.out.println(board);          
        }

        System.out.println("Player " + playerNum + " Won!");
    }
}
