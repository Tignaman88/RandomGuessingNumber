public class CheckUserInputWithRandomNumber {

    public boolean userNumberToCompareWithRandomNumber (int userNumber, int randomNumber) {



        if (userNumber == randomNumber) {

            System.out.println("Well done! You guessed the number!");
            return true;
        }


        return false;
    }
}
