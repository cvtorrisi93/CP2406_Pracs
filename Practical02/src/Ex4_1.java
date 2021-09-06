// CP2406 Prac 2 - Christian Torrisi
//Exercise 4.1 - Print Capitalised

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println();
        String sentence = userInput.nextLine();

        System.out.println(printCapitalised(sentence));



    }

    private static String printCapitalised(String str) {
        String capitalisedString = "";
        String[] words = str.split("[,\\s\".]");

        for (String word : words) {
            if (word != "") {
                // Capitalise the first letter at element 0 and then add the rest of the string to it.
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                capitalisedString += word + " ";
            }
        }
        return capitalisedString;
    }

}

