// CP2406 Prac 1 - Christian Torrisi
//Exercise 2.6 - Name Splitter/Character Counter/Initial Finder

import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String fullName, firstName, lastName;
        int spaceIndex;

        System.out.println("Please enter your first name and last name, separated by a space.");
        fullName = userInput.nextLine();

        spaceIndex = fullName.indexOf(' ');
        firstName = fullName.substring(0, spaceIndex);
        lastName = fullName.substring(spaceIndex + 1);

        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
    }
}
