public class Board
{
    private String[][] emptyBoard = {{"| ", "| ", "| ",  "| ",  "| ",  "| ",  "|"},
                                     {"| ", "| ", "| ",  "| ",  "| ",  "| ",  "|"},
                                     {"| ", "| ", "| ",  "| ",  "| ",  "| ",  "|"},
                                     {"| ", "| ", "| ",  "| ",  "| ",  "| ",  "|"}, 
                                     {"| ", "| ", "| ",  "| ",  "| ",  "| ",  "|"}, 
                                     {"| ", "| ", "| ",  "| ",  "| ",  "| ",  "|"}};

    public Board()
    {
       for (String[] row : emptyBoard)
       {
        for (String s : row)
        {
            System.out.print(s);
        }
        System.out.println();
       }
    }
}
