// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.4 - Basic Calculator

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your sentence below.");
        String sentence = userInput.nextLine();
        System.out.println(sentence);

        String[] words = sentence.split("[,\\s\".]");

        for (String word : words) {
            if (word != "") {
                System.out.println(word);
            }
        }
    }
}
