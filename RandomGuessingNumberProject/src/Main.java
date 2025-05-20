
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;
        int userGuessing;
        int checkUserAnswer;
        boolean isGameOn = true;
        boolean isRightGuess = true;
        boolean isPlayerWantingToPlayAgain;
        String wantToPlayAgain;
        String playerWantsToPlay;


        CheckUserInputWithRandomNumber userInput = new CheckUserInputWithRandomNumber();

        System.out.println("Hi! Try to guess the number between 0 and 100!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 100: ");


        while (isGameOn) {

            // Generate a random number between 0 and 100
            int random = (int) (Math.random() * 101);



            while (isRightGuess) {

                isPlayerWantingToPlayAgain = true;


                String guessing = scanner.nextLine();


                // Check if string entered by the user is a number
                // If not, ask them to try again until a number is entered
                if (!isNumeric(guessing)) {
                    System.out.println("You haven't entered a number, please try again: ");
                } else {

                    userGuessing = Integer.parseInt(guessing);

                    if (userInput.userNumberToCompareWithRandomNumber(userGuessing, random)) {

                        score++;
                        isRightGuess = false;
                        System.out.println("Would you like to play again: if yes, press Y, press N for no: ");


                        // Checks if user want to play again
                        // Ask user until they enter Y or N
                        while (isPlayerWantingToPlayAgain) {

                            wantToPlayAgain = scanner.nextLine();

                            if (!wantToPlayAgain.equalsIgnoreCase("y") && !wantToPlayAgain.equalsIgnoreCase("n")) {
                                System.out.println("You have not selected the right choice, please press Y or N: ");
                            } else {
                                playerWantsToPlay = wantToPlayAgain;
                                if (playerWantsToPlay.equalsIgnoreCase("n")) {
                                    isGameOn = false;
                                    isPlayerWantingToPlayAgain = false;
                                } else if (playerWantsToPlay.equalsIgnoreCase("y")) {
                                    random = (int) (Math.random() * 101);
                                    System.out.println(random);
                                    isRightGuess = true;
                                    isPlayerWantingToPlayAgain = false;
                                } else {
                                    System.out.println("You have not entered the right character, please try again: ");
                                }
                            }
                        }

                    } else {
                        // Checks the number entered by user to help them guess the right number
                        if (random < userGuessing) {
                            checkUserAnswer = userGuessing - random;
                            if (checkUserAnswer <= 10) {
                                System.out.println("So Close!");
                            } else if (checkUserAnswer <= 20) {
                                System.out.println("Almost!");
                            } else {
                                System.out.println("Not Even Close!");
                            }
                        }
                        if (random > userGuessing) {
                            checkUserAnswer = random - userGuessing;
                            if (checkUserAnswer <= 10) {
                                System.out.println("So Close!");
                            } else if (checkUserAnswer <= 20) {
                                System.out.println("Almost!");
                            } else {
                                System.out.println("Not Even Close!");
                            }
                        }

                    }
                }
            }
        }


        if (score == 1) {
            System.out.println("You guessed " + score + " number!");
        } else System.out.println("You guessed " + score + " numbers!");


    }

    public static boolean isNumeric(String userGuess) {
        try {
            Integer.parseInt(userGuess);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
