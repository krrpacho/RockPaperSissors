import java.util.*;
import javax.swing.Timer;

public class rsp {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            while(true) {
                // 1 randomize computer moves
                String [] availableMoves = {"Rock", "Paper", "Scissors"};

                String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
                
                System.out.println("Computer chose move. Now you!");

                // 2 user
                String userMove;
                while (true) {
                    System.out.println("Enter move!");
                    userMove = scn.nextLine();

                    if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors") ) {
                        System.out.println();
                        break;
                    }
                    System.out.println("invalid");

                }

                System.out.println("Сomputer choose: " + computerMove);

                // 3 comparing

                if (userMove.equals(computerMove)) {
                    System.out.println("Draw");
                } 
                else if (userMove.equals("Rock")) {
                    if (computerMove.equals("Paper")) {
                        System.out.println("Computer won!");
                    } else if (computerMove.equals("Scissors")) {
                        System.out.println("You won!");
                    }
                }
                else if (userMove.equals("Paper")) {
                    if (computerMove.equals("Rock")) {
                        System.out.println("You won!");
                    } else if (computerMove.equals("Scissors")) {
                        System.out.println("Computer won!");
                    }
                }
                else if (userMove.equals("Scissors")) {
                    if (computerMove.equals("Paper")) {
                        System.out.println("You won!");
                    } else if (computerMove.equals("Rock")) {
                        System.out.println("Computer won!");
                    }
                }

                System.out.println();
            	String playAgain;
            	System.out.println("Do you want to play again? ");

                while (true) {
                    System.out.println("Type 'yes' or 'no'");
                    playAgain = scn.nextLine();
                    if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
            			System.out.println();
            			System.out.println("*****************************************************************************");
            			System.out.println();
            			break;
            		}
                    System.out.println("Invalid imput");
                }

                if(playAgain.equals("no") || playAgain.equals("No")) {
            		break;
            	}
               
            }
        }
    }
}