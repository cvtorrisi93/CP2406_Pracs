// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.3 - Basic Calculator

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double total = 0;
        double firstNumber = 1;
        double secondNumber;
        char operatorSymbol;
        String expression;

        System.out.println("Please enter your expression. If you wish to exit, enter 0 as the first number");

        expression = userInput.next();

        while (true) {
            // Regular expressions used in the split to separate the symbol and keep it in the array
            String[] splitExpression = expression.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
            firstNumber = Double.parseDouble(splitExpression[0]);
            if (firstNumber == 0) {
                break;
            }
            operatorSymbol = splitExpression[1].charAt(0);
            secondNumber = Double.parseDouble(splitExpression[2]);


            switch (operatorSymbol) {
                case '+':
                    total = firstNumber + secondNumber;
                    break;
                case '-':
                    total = firstNumber - secondNumber;
                    break;
                case '*':
                    total = firstNumber * secondNumber;
                    break;
                case '/':
                    total = firstNumber / secondNumber;
                    break;
            }
            System.out.println(total);
            expression = userInput.next();

        }
    }
}
