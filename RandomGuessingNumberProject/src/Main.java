import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;
        int userGuessing;

        // Generate a random number between 0 and 10
        RandomNumber rn = new RandomNumber();
        int random = rn.randomNumber;

        System.out.println("Hi! Try to guess the number between 0 and 10!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 10: ");
        String guessing = scanner.nextLine();
        userGuessing = Integer.parseInt(guessing);

        if (userGuessing == random) {
            System.out.println("Great job! You guessed correct!");
            score++;
        }
        

    }
}
