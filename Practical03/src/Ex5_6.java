// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.6 - Addition Questionnaire

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_6 {

    private static AdditionQuestion[] questions;
    private static int[] userAnswers;

    public static void main(String[] args) {
        System.out.println("Welcome to the Additions Questionnaire!" +
                "\nYou will answer 10 questions about additions for this test" +
                "\nGood luck!");

        createQuestions();
        answerQuestions();
        getResults();
    }

    private static void createQuestions() {
        questions = new AdditionQuestion[10];
        for (int i = 0; i < 10; i++) {
            questions[i] = new AdditionQuestion();
        }
    }

    private static void answerQuestions() {
        Scanner userInput = new Scanner(System.in);
        userAnswers = new int[10];
        int questionNumber = 0;
        for (int i = 0; i < 10; i++) {
            questionNumber++;
            System.out.println(questionNumber + ". " + questions[i].getQuestion());
            userAnswers[i] = userInput.nextInt();
        }
    }
    private static void getResults() {
        System.out.println("Here are the correct answers!");
        int correctCount = 0;
        int questionNumber = 0;
        for (int i = 0; i < 10; i++) {
            questionNumber++;
            System.out.println("Question " + questionNumber + ". Answer: " + questions[i].getCorrectAnswer());
            if (userAnswers[i] == questions[i].getCorrectAnswer()) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Your answer " + userAnswers[i] + " was incorrect.");
            }

        }
        System.out.println("You got " + correctCount + " out of 10 answers correct.");
    }
}
