import java.util.Scanner;
import java.util.Random;

public class guessthenumber {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            Random random = new Random();
            String player;
            char restart;
            int rnumber = random.nextInt(19 + 1) + 1;
            int guess;
            int tries = 6;
            int attempt = 0;

        try{
            System.out.println("Hello! What is your name?");
            player = input.nextLine();
            System.out.println("Well, " + player + ", I'm thinking of a number between 1 and 20.");

            while (tries > 0) {
                System.out.println("Take a guess.");
                guess = input.nextInt();
                input.nextLine();
                attempt++;
                if (guess == rnumber) {
                    System.out.println("Good job, " + player + "! You guessed my number in " + attempt + " guesses!");
                    System.out.println("Would you like to play again? (y or n)");
                    attempt = 0;
                    restart = input.next().charAt(0);
                    if (restart == 'y') {
                        tries = 6;
                        rnumber = random.nextInt(19 + 1) + 1;
                    } else {
                        return;
                    }
                }

                if (guess != rnumber) {
                    tries--;
                    if (guess > rnumber) {
                        System.out.println("Your guess is too high.");
                    }
                    if (guess < rnumber) {
                        System.out.println("Your guess is too low.");
                    }
                }

                if (tries == 0) {
                    System.out.println("Would you like to play again? (y or n)");
                    attempt = 0;
                    restart = input.next().charAt(0);
                    if (restart == 'y') {
                        rnumber = random.nextInt(19 + 1) + 1;
                        tries = 6;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }
}