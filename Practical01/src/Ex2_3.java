// CP2406 Prac 1 - Christian Torrisi
//Exercise 2.3 - Uppercase Greeter

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name;

        System.out.println("What is your name?");
        name = userInput.next().toUpperCase();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }


}
