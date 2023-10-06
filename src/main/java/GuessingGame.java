import java.util.Random;
import java.util.Scanner;

public class GuessingGame {



    public static void main(String [] args) {


        // prompt user to guess the secret number
        System.out.println("Guess my lucky number");


       // collect user input
        Scanner reader = new Scanner(System.in);
        int userGuess = Integer.parseInt(reader.nextLine());
        Random random = new Random();

       // guessing the number
        int secretNumber = 7;
        boolean hasGuessedCorrectly = false;

        if (userGuess < secretNumber) {
            System.out.println("The number is higher " + ". Nope, loseeer  .");
        } else if (userGuess > secretNumber) {
            System.out.println("The number is lower " +". How did you know ?.");
        } else if (userGuess == 7){
            System.out.println("Congratulations! You've guessed the number.");
            hasGuessedCorrectly = true;
        }









    }









}
