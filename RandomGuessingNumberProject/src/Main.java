import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;
        int userGuessing;
        int userTries = 0;




        CheckUserInputWithRandomNumber userInput = new CheckUserInputWithRandomNumber();

        System.out.println("Hi! Try to guess the number between 0 and 10!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 10: ");

        while (true) {

            // Generate a random number between 0 and 10
            RandomNumber rn = new RandomNumber();
            int random;
            random = rn.randomNumber;


            String guessing = scanner.nextLine();

            if (guessing.equalsIgnoreCase("q")) break;

            if (!isNumeric(guessing) || Integer.parseInt(guessing) > 10 || Integer.parseInt(guessing) < 0) {
                System.out.println("You have not entered a number, or the number entered is" +
                        " less than 0 or greater than 10, please try again: ");

            } else {
                    // Compare user's guessing to random number
                    userGuessing = Integer.parseInt(guessing);
                    if (userInput.userNumberToCompareWithRandomNumber(userGuessing, random)) {
                        score++;
                    }
                userTries++;

            }



            }



        System.out.println("You guessed " + score + " out of " + userTries + " guessing!");

        if (score == userTries && score > 0) {
            System.out.println("You guessed all numbers, well done!");
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
