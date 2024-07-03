import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = List.of("radioactivo", "enfermera", "hospital", "manutencion", "quesadilla");

        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        String randomWord = words.get(randomIndex);

        StringBuilder hiddenWord = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            hiddenWord.append('_');
        }

        int maxIncorrectAttempts = 6;
        int incorrectAttempts = 0;
        boolean wordGuessed = false;

        while (incorrectAttempts < maxIncorrectAttempts && !wordGuessed) {
            System.out.println("Word: " + hiddenWord);
            System.out.println("Guest the letter: ");
            char guessedLetter = scanner.next().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == guessedLetter) {
                    hiddenWord.setCharAt(i, guessedLetter);
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                incorrectAttempts++;
                System.out.println("Incorrect letter, you have: " + (maxIncorrectAttempts - incorrectAttempts) + " attempts");
            } else {
                System.out.println("Excellent!");
            }

            if (hiddenWord.toString().equals(randomWord)) {
                wordGuessed = true;
                System.out.println("Congratulations! You guest the word: " + randomWord);
            }
        }

        if (!wordGuessed) {
            System.out.println("You don't have more attemps! The word was " + randomWord);
        }

        scanner.close();

    }
}