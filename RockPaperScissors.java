
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Enter your move (Rock, Paper, Scissors): ");
        String userMove = scanner.nextLine();
        
        int computerIndex = random.nextInt(3);
        String computerMove = options[computerIndex];
        
        System.out.println("Computer move: " + computerMove);
        
        if (userMove.equalsIgnoreCase(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                   (userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
                   (userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        
        scanner.close();
    }
}

