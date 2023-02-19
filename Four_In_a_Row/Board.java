import java.util.Scanner;

public class Board
{
    private Scanner scan = new Scanner(System.in);
    private String[][] board = new String[6][8];
    private int col = -1;

    public Board()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if (j == 7)
                {
                    board[i][j] = "|";
                }
                else
                {
                    board[i][j] = "| ";
                }
            }
        }
    }

    public boolean checkWin()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if (!(board[i][j].equals("| ") || board[i][j].equals("|")))
                {
                    //for loop checks if there is 4 in a row horizontally
                    for (int rowWin = j; rowWin < j + 4 && rowWin < board[0].length; rowWin++)
                    {
                        if (!board[i][rowWin].equals(board[i][j]))
                        {
                            break;
                        }
                        else if (rowWin == j + 3)
                        {
                            return true;
                        }
                    }
                    //end row win check loop

                    //for loop checks if there is 4 in a row vertically
                    for (int colWin = i; colWin < i + 4 && colWin < board.length; colWin++)
                    {
                        if (!board[colWin][j].equals(board[i][j]))
                        {
                            break;
                        }
                        else if (colWin == i + 3)
                        {
                            return true;
                        }
                    }
                    //end col win check loop
                    
                     //if + loop checks if there is 4 in a row diagonally (major)
                    if (i < board.length - 3 && j < board[0].length - 4)
                    {
                        for (int diag = 0; diag < 4; diag++)
                        {
                            if (!board[i + diag][j + diag].equals(board[i][j]))
                            {
                                break;
                            }
                            else if (diag == 3)
                            {
                                return true;
                            }
                        }
                    }
                    //end major diag win check

                    if (i < board.length - 3 && j > board[0].length - 6)
                    {
                        for (int diag = 0; diag < 4; diag++)
                        {
                            if (!board[i + diag][j - diag].equals(board[i][j]))
                            {
                                break;
                            }
                            else if (diag == 3)
                            {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void placeTile(int player)
    {
        System.out.println("Choose column: ");
        col = scan.nextInt();

        int row = 0;
        while (row < board.length)
        {
            if (!board[row][col].equals("| "))
            {
                if (player == 1)
                {
                    board[row - 1][col] = "|R";
                    break;
                }
                else
                {
                    board[row - 1][col] = "|Y";
                    break; 
                }
            }
            else if (row == 5)
            {
                if (player == 1)
                {
                    board[row][col] = "|R";
                    break;
                }
                else
                {
                    board[row][col] = "|Y";
                    break; 
                }
            }

            row++;
        }
    }

    public String toString()
    {
        String boardString = " 0 1 2 3 4 5 6 \n";
        for (String[] row : board)
       {
        for (String s : row)
        {
            boardString += s;
        }
        boardString += "\n";
       }
       boardString += "---------------";

        return boardString;
    }
}
