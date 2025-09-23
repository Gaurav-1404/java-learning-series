import java.util.Random;
import java.util.Scanner;
public class C5_RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int playAgain = 0;

        while (playAgain == 0) {
            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Enter your choice: 0 for Rock, 1 for Paper, 2 for Scissors");

            int userChoice;
            while (true) {
                userChoice = sc.nextInt();
                if (userChoice >= 0 && userChoice <= 2) break;
                System.out.println("Invalid input! Please enter 0, 1, or 2.");
            }

            int computerChoice = ran.nextInt(3);

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a draw!...X");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!...:-)");
            } else {
                System.out.println("Computer wins!...:-(");
            }

            System.out.println("\nPress 0 to play again or 1 to exit...");
            playAgain = sc.nextInt();
        }

        sc.close();
        System.out.println("Thanks for playing!");
    }
}

