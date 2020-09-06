import java.util.*;
public class tictactoe
{
    public static void display(char [][]b)
    {
        for (int rows = 0; rows<3; rows++)
        {
            System.out.println();
            for (int cols=0; cols<3; cols++)
            {
                System.out.print(b[rows][cols]+" ");
            }
    }
}
   
    public static void play1(char b[][] )
    {
       int pick;
       Scanner input = new Scanner(System.in);
       System.out.println(" ");
       System.out.println("X pick a square");
       pick = input.nextInt();
       if (pick == 1)
       {
           b [0][0]='x';
        }
        else if (pick==2)
        {
            b[0][1]='x';
        }
        else if (pick==3)
        {
            b [0][2]='x';
        }
        else if (pick==4)
        {
            b [1][0]='x';
        }
        else if (pick==5)
        {
            b[1][1]='x';
        }
        else if (pick==6)
        {
            b[1][2]='x';
        }
        else if (pick==7)
        {
            b[2][0]='x';
        }
        else if (pick==8)
        {
            b[2][1]='x';
        }
        else if (pick==9)
        {
            b[2][2]='x';
        }
        else
        {
            System.out.println("invalid entry");
        }
    }
    
    public static void play2(char [][] b)
    {
        int pick;
       Scanner input = new Scanner(System.in);
       System.out.println("O pick a square");
       pick = input.nextInt();
       if (pick == 1)
       {
           b [0][0]='o';
        }
        else if (pick==2)
        {
            b[0][1]='o';
        }
        else if (pick==3)
        {
            b [0][2]='o';
        }
        else if (pick==4)
        {
            b [1][0]='o';
        }
        else if (pick==5)
        {
            b[1][1]='o';
        }
        else if (pick==6)
        {
            b[1][2]='o';
        }
        else if (pick==7)
        {
            b[2][0]='o';
        }
        else if (pick==8)
        {
            b[2][1]='o';
        }
        else if (pick==9)
        {
            b[2][2]='o';
        }
        //else if (pick == "o" ||"x")
        //{
          //  System.out.println("invalid entry");
        //}
        else
        {
            System.out.println("invalid entry");
        }
            
    }
       

   public static void main(String [] args)
    {
        int answer=1;
         while (answer==1)
        {
        char b[][] = new char [][] {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        boolean flag;
        Scanner input = new Scanner(System.in);  
        System.out.println("Welcome to tic tac toe");
       
        display(b);
        
        for (int count=0; count<9; count++)
        {
        play1(b);
        display(b);
        checkForWinner(b);
        flag=checkForWinner(b);
        if (flag==true)
        {
           break;
        }
        play2(b);
        display(b);
        checkForWinner(b);
        flag=checkForWinner(b);
        if (flag==true)
        {
            break;
        }
    }
        System.out.println();
        displaywinner(b);
        answer=playagain();
    }
    }
    
    public static boolean checkForWinner(char[][] b)
   {
    // checkForWinner() method determines if a pattern of data stored
    // in the 2 D char array indicates the a player has won the game.
     
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
    
        // checks the contents of each row for matching data   
        for (int i = 0; i <= 2; i++)
        {
            if ((b[i][0] == b[i][1] && b[i][1] == b[i][2]) && b[i][2] != ' ') 
                flag1 = true;
        }
        
         // checks the contents of each column for matching data
        for (int j = 0; j <= 2; j++)
        {
            if ((b[0][j] == b[1][j] && b[1][j] == b[2][j]) && b[2][j] != ' ') 
                flag2 = true;
        }
        
        // checks the contents of one diagonal for matching data
        if ((b[0][0] == b[1][1] && b[1][1] == b[2][2]) && b[2][2] != ' ') 
                flag3 = true;

        // checks the contents of the other diagonal for matching data
        if ((b[0][2] == b[1][1] && b[1][1] == b[2][0]) && b[2][0] != ' ') 
                flag4 = true;
                
        // checks if any of the previous conditions evaluated to true        
        if (flag1 == true || flag2 == true || flag3 == true || flag4 == true)
            flag = true;
            
       // returns true if a winner was found; returns false is no winner     
       return flag;
   } // end of checkForWinner method
   
   public static void displaywinner(char [][]b)
   {
       boolean flag;
       checkForWinner(b);
       flag=checkForWinner(b);
       if (flag=true)
       {
          System.out.println("Last player is the winner");
        }
          
          
        }
        
   public static int playagain()
   {
       int repeat;
       Scanner input = new Scanner(System.in);
       System.out.println("Would you like to play again?");
       System.out.println("Enter 1 for yes 2 for no");
       repeat = input.nextInt();
       return repeat;
    }
       
    }

      
        
        