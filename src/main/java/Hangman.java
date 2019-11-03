import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        String word = "Welcome";
        int life = word.length () + 5;
        guessTheWord (word, life);
    }

    private static void guessTheWord(String word, int life) {
        System.out.println ("Guess the " + word.length () + " letters word");
        System.out.println ("Your lifes: " + life);

        char[] filler = new char[word.length ()];
        int x = 0;

        for (int j = 0; j < word.length (); j++) {
            filler[j] = '_';
        }
        System.out.println (filler);
        Scanner scanner = new Scanner (System.in);

        ArrayList<Character> listWhichStoreEnteredLetters = new ArrayList<Character> ();

        while (life > 0) {
            char playersInput = scanner.nextLine ().charAt (0);

            if (listWhichStoreEnteredLetters.contains (playersInput)) {
                System.out.println ("Already entered");
                continue;
            }
            listWhichStoreEnteredLetters.add (playersInput);


            if (word.contains (playersInput + "")) {
                for (int i = 0; i < word.length (); i++) {
                    if (word.charAt (i) == playersInput) {
                        filler[i] = playersInput;
                    }
                }
            } else {
            }
            life--;

            if (word.equals (String.valueOf (filler))) {
                System.out.println (filler);
                System.out.println ("You won!");
                break;
            }

            System.out.println (filler);
            System.out.println ("Lifes remaning = " + life);
        }
        if (life == 0) {
            System.out.println ("You lose");
        }

    }

}




