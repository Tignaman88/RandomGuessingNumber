public class CheckUserInputWithRandomNumber {

    public void userNumberToCompareWithRandomNumber (int userNumber, int randomNumber, int score) {

        score = 0;

        if (userNumber == randomNumber) {

            System.out.println("Well done! You guessed the number!");
            score++;
        }

        else {
            System.out.println("Too bad! Try again");
        }

        System.out.println("You guessed " + score + " numbers!");
    }
}
