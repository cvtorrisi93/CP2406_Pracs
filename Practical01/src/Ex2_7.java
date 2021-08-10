// CP2406 Prac 1 - Christian Torrisi
//Exercise 2.7 -

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2_7 {
    public static void main(String[] args) {
        File textFile = new File("C:\\SSD\\Uni\\JCU\\BoIT__3.2\\CP2406 - Programming III\\Pracs\\src\\textdata.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        String name = fileReader.nextLine();
        // While loop can be implemented below for the scores.
        // Since there are only three I won't worry about it this time.
        int score1 = fileReader.nextInt();
        int score2 = fileReader.nextInt();
        int score3 = fileReader.nextInt();
        float scoresAverage = (score1 + score2 + score3) / 3f;

        System.out.println("Name: " + name);
        System.out.printf("Average Score: %.2f", scoresAverage);

    }
}
