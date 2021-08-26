// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.7 - Birthday Problems

public class Ex3_7 {
    public static void main(String[] args) {


        System.out.println("Birthday Problem 1");

        int count = 0;
        int birthday;
        int[] bdayCounts = new int[365];

        while (true) {
            birthday = (int)(Math.random()*365);
            count++;
            bdayCounts[birthday]++;
            if (bdayCounts[birthday] == 3) {
                break;
            }
        }
        System.out.println("It has taken " + count + " times to find 3 people with the same birthday.");

        System.out.println("\nBirthday Problem 2");

        count = 0;
        boolean[] birthdays = new boolean[365];

        for (int i = 0; i < 365; i++) {
            birthday = (int)(Math.random()*365);
            birthdays[birthday] = true;
        }

        for (boolean day:birthdays) {
            if (day == true) {
                count++;
            }
        }
        System.out.println("There were " + count + " different birthdays.");

        System.out.println("\nBirthday Problem 3");

        count = 0;
        int birthdaysFound = 0;
        boolean[] foundBirthdays = new boolean[365];

        while (birthdaysFound < 365) {
            birthday = (int)(Math.random()*365);
            count++;
            if (foundBirthdays[birthday] == false) {
                birthdaysFound++;
            }
            foundBirthdays[birthday] = true;
        }
        System.out.println("It took " + count + " tries to find all birthdays for the year.");

    }

}
