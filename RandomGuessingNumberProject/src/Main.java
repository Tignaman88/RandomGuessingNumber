import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;
        int userGuessing;

        // Generate a random number between 0 and 10
        RandomNumber rn = new RandomNumber();
        int random = rn.randomNumber;

        CheckUserInputWithRandomNumber userInput = new CheckUserInputWithRandomNumber();

        System.out.println("Hi! Try to guess the number between 0 and 10!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 10: ");

        while (true) {
            String guessing = scanner.nextLine();
            userGuessing = Integer.parseInt(guessing);
            if (!isNumeric(guessing)) {
                System.out.println("You have not entered a number, please try again: ");
            } else {
                if (isNumeric(guessing)) {
                    // Compare user's guessing to random number
                    userInput.userNumberToCompareWithRandomNumber(userGuessing, random, score);
                } else if (guessing.equalsIgnoreCase("q")) {
                    break;
                }
            }
        }





    }

    public static boolean isNumeric(String userGuess) {
        try {
            Integer.parseInt(userGuess);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
