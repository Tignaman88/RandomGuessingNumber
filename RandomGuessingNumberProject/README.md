# 🎯 Number Guessing Game

This is a simple Java-based number guessing game built as a beginner project using IntelliJ IDEA.

## 📋 Description

The game randomly selects a number between **0 and 100**. The player is prompted to guess the number and receives feedback on how close their guess was:

- **"So Close!"** – if the guess is within 10 of the number
- **"Almost!"** – if the guess is within 20
- **"Not Even Close!"** – otherwise

If the player guesses the correct number, they can choose to play again or quit. The game tracks the number of successful guesses.

---

## 🛠 Technologies Used

- **Java 17+**
- **IntelliJ IDEA** (recommended IDE)

---

## 🚀 How to Run the Project

1. **Clone or download** the repository to your local machine.

2. **Open the project in IntelliJ IDEA**:
    - Go to `File` > `Open...`
    - Select the folder with the project files

3. **Build and run the `Main` class**:
    - Right-click `Main.java`
    - Select `Run 'Main.main()'`

4. **Play the game in the console** 🎮

---

## 🧠 Features

- Random number generation between 0–100
- Input validation: prevents crashes from invalid input
- Feedback based on how close the guess is
- Option to replay the game
- Score tracking for correct guesses

---

## 💡 Example Output

Hi! Try to guess the number between 0 and 100!
Please enter a number between 0 and 100:
50
Almost!
60
So Close!
65
Well done! You guessed the number!
Would you like to play again: if yes, press Y, press N for no:


---

## 🔍 What Could Be Improved

This was a great first project! Some next steps might include:

- Limiting number of attempts per round
- Tracking high scores across sessions
- Storing results to a file

---

## 👤 Author

This was my first solo project written in Java with IntelliJ 🎉

