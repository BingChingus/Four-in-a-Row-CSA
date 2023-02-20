
public class Game 
{
    private Board board;
    private int playerNum = 2; //player 1 is red, player 2 is yellow

    public void play()
    {
        board = new Board();

        System.out.println(board);
        System.out.println("Player 1 = Red");
        System.out.println("Player 2 = Yellow" + "\n");

        while (!board.checkWin())
        {       
            if (playerNum == 1) //if it was player1's turn, it's now player2's turn
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
            
            if (board.isTie())
            {
                break;
            }         
        }  

        if (board.isTie())
        {
            System.out.println("Tie Game!");
        }
        else
        {
            System.out.println("Player " + playerNum + " Won!");
        }    
    }
}
