// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.6 - Addition Questionnaire

import java.util.Scanner;

public class Ex5_6 {

    private static AdditionQuestion[] questions;
    private static int[] userAnswers;

    public static void main(String[] args) {
        System.out.println("Welcome to the Additions Questionnaire!" +
                "\nYou will answer 10 questions about additions for this test" +
                "\nGood luck!");

        createQuestions();
        //TODO answerQuestions();
        //TODO getResults();
    }

    private static void createQuestions() {
        questions = new AdditionQuestion[10];
        for (int i = 0; i < 10; i++) {
            questions[i] = new AdditionQuestion();
        }
    }

}
