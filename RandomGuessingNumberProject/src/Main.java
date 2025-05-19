import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;
        int userGuessing;
        int checkUserAnswer;




        CheckUserInputWithRandomNumber userInput = new CheckUserInputWithRandomNumber();

        System.out.println("Hi! Try to guess the number between 0 and 100!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 100: ");

        boolean isGameOn = true;
        boolean isRightGuess = true;
        String wantToPlayAgain;

        while (isGameOn) {

            // Generate a random number between 0 and 100
            int random = (int) (Math.random() * 101);
            System.out.println(random);

            while (isRightGuess) {


                String guessing = scanner.nextLine();
                userGuessing = Integer.parseInt(guessing);

                if (!isNumeric(guessing)) {
                    System.out.println("You haven't entered a number, please try again: ");
                } else {

                    if (userInput.userNumberToCompareWithRandomNumber(userGuessing, random)) {

                    score++;
                    isRightGuess = false;
                    System.out.println("Would you like to play again: if yes, press Y, press N for no: ");
                    wantToPlayAgain = scanner.nextLine();
                    if (wantToPlayAgain.equalsIgnoreCase("n")) {
                        isGameOn = false;
                    } else if (wantToPlayAgain.equalsIgnoreCase("y")){
                        random = (int) (Math.random() * 101);
                        System.out.println(random);
                        isRightGuess = true;
                    }

                } else {
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

//        while (true) {
//
//            // Generate a random number between 0 and 10
//            RandomNumber rn = new RandomNumber();
//            int random;
//            random = rn.randomNumber;
//            System.out.println(random);
//
//
//            String guessing = scanner.nextLine();
//
//            if (guessing.equalsIgnoreCase("q")) break;
//
//            if (!isNumeric(guessing) || Integer.parseInt(guessing) > 100 || Integer.parseInt(guessing) < 0) {
//                System.out.println("You have not entered a number, or the number entered is" +
//                        " less than 0 or greater than 10, please try again: ");
//
//            } else {
//                    // Compare user's guessing to random number
//                    userGuessing = Integer.parseInt(guessing);
//                    if (userInput.userNumberToCompareWithRandomNumber(userGuessing, random)) {
//                        score++;
//                    } else if (random - userGuessing < 0 || random - userGuessing > 20) {
//                        System.out.println("Acqua");
//                    } else if (random - userGuessing <= 10) {
//                        System.out.println("Fuoco");
//                    } else System.out.println("Fuochino");

//
//            }
//
//
//
//            }



        System.out.println("You guessed " + score + " numbers!");






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
