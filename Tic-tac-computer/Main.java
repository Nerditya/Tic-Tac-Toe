import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String s[] = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
    
    // public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Welcome to the game, X is Player1, O is player 2(Computer)");
        System.out.println("New numbers are as follows: ");
        System.out.println(" 1  |  2  |  3  ");
        System.out.println(" 4  |  5  |  6  ");
        System.out.println(" 7  |  8  |  9  ");
        Scanner input = new Scanner(System.in);
        Boolean check;
        check = false;
        Boolean gameon=true; 
        int x = 0;
        // for(int i = 1; i<=10;i++)
        // {
        // System.out.print(a[i]);
        // }
        Random rnd = new Random();
        System.out.println(gameon);
        while (gameon) {
            System.out.print(" Player 1 - Enter Your Desired Location[ 1-9]: ");
            x = input.nextInt();
            while(s[x]=="X"||s[x]=="O")
            {
                System.out.println("Please enter Valid no");
                x = input.nextInt();
            }
            s[x] = "X";
            System.out.println(s[1]+" | "+s[2]+" | "+s[3]);
            System.out.println(s[4]+" | "+s[5]+" | "+s[6]);
            System.out.println(s[7]+" | "+s[8]+" | "+s[9]);


            if (s[1] == s[2] && s[2] == s[3]&&s[1]!=" ") {
                if (s[1] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if (s[4] == s[5] && s[5] == s[6]&&s[4]!=" ") {
                if (s[4] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if (s[7] == s[8] && s[8] == s[9]&&s[7]!=" ") {
                if (s[7] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[1] == s[4] && s[4] == s[7]&&s[1]!=" ") {
                if (s[1] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if (s[2] == s[5] && s[5] == s[8]&&s[2]!=" ") {
                if (s[2] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[3] == s[6] && s[6] == s[9]&&s[3]!=" ") {
                if (s[3] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[1] == s[5] && s[5] == s[9]&&s[1]!=" ") {
                if (s[3] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[3] == s[5] && s[5] == s[7]&&s[3]!=" ") {
                if (s[3] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if(gameon==false)
            {
                break; 
            }

            System.out.println(" Computer Played: ");
            
            x=(rnd.nextInt() %8)+1; 
            if(x<0)
            {
                x=0-x; 
            }
            while(s[x]=="X"||s[x]=="O")
            {
                x=(rnd.nextInt() %8)+1; 
                if(x<0)
            {
                x=0-x; 
            }
            
            }
            s[x]="O"; 
            System.out.println(s[1]+" | "+s[2]+" | "+s[3]);
            System.out.println(s[4]+" | "+s[5]+" | "+s[6]);
            System.out.println(s[7]+" | "+s[8]+" | "+s[9]);


            if (s[1] == s[2] && s[2] == s[3]&&s[1]!=" ") {
                if (s[1] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if (s[4] == s[5] && s[5] == s[6]&&s[4]!=" ") {
                if (s[4] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if (s[7] == s[8] && s[8] == s[9]&&s[7]!=" ") {
                if (s[7] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[1] == s[4] && s[4] == s[7]&&s[1]!=" ") {
                if (s[1] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }
            if (s[2] == s[5] && s[5] == s[8]&&s[2]!=" ") {
                if (s[2] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[3] == s[6] && s[6] == s[9]&&s[3]!=" ") {
                if (s[3] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[1] == s[5] && s[5] == s[9]&&s[1]!=" ") {
                if (s[3] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }

            if (s[3] == s[5] && s[5] == s[7]&&s[3]!=" ") {
                if (s[3] == "X") {
                    System.out.println("Player 1 Won the game");
                } else {
                    System.out.println("Player 2 Won the game");
                }
                gameon = false;
            }


        }

    }
}