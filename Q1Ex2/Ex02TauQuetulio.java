package ex02tauquetulio;

/**
 *
 * @author TAU - Marra Alliyaj Nicole Quetulio
 */
import java.util.Scanner;
public class Ex02TauQuetulio {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isPlaying = true;
        Scanner sc = new Scanner(System.in);
        
        int min = 1;
        int max = 10;
        int num_guesses = 3;
        
        while (isPlaying) {          
            System.out.printf("Welcome to Higher or Lower! \nRange: %s to %s \nGuesses: %s \n \nWhat will you do? \n- Start game \n- Change settings \n- End application \n", min, max, num_guesses);
            String choice = sc.nextLine();
            System.out.print("\n");
            
            if (choice.equalsIgnoreCase("Start game")) {
                int random = (int)Math.floor(Math.random()*(max - min + 1)) + min;
                int num;
                
                for(num = num_guesses; num > 0; num--) {
                    System.out.print("You have " + num + " guess(es) left. What is your guess? ");
                    int guess = sc.nextInt();

                    if (guess < min || guess > max) {
                        System.out.print("Out of range. ");
                    }
                    else if (guess == random) {
                        System.out.print("You got it! \n");
                        num = 0;
                    }
                    else if (guess > random && num > 1) {
                        System.out.print("Guess lower! ");
                    }
                    else if (guess < random && num > 1) {
                        System.out.print("Guess higher! ");
                    }
                    else if (num == 1){
                         System.out.printf("You ran out of guesses. The answer was %s. Game over! \n", random);
                        num = 0;
                    }
                }
                System.out.print("Play again (y/n)? ");
                String play = sc.next();
                System.out.print("\n");
                String leftover = sc.nextLine();

                if (play.equalsIgnoreCase("n")) {
                    isPlaying = false;
                }
            } 
            else if (choice.equalsIgnoreCase("Change settings")) {
                System.out.print("lower limit of the range: ");
                min = sc.nextInt();
                System.out.print("upper limit of the range: ");
                max = sc.nextInt();
                System.out.print("number of guesses: ");
                num_guesses = sc.nextInt();
                String leftover = sc.nextLine();
                System.out.print("Settings successfully changed. \n \n");  
            }
            else if (choice.equalsIgnoreCase("End application")) {
                System.out.print("Ending application...\n");
                break;
            }
            else {
                System.out.print("Invalid choice. Please restart. \n"); 
                break;
            }
        }
    }
}
