// CP2406 Prac 1 - Christian Torrisi
//Exercise 2.2 - Roll the Dice

public class Ex2_2 {
    public static void main(String[] args) {
        int firstDie = (int)(Math.random()*6) + 1;
        int secondDie = (int)(Math.random()*6) + 1;
        int totalRoll = firstDie + secondDie;

        System.out.println("The first die comes up " + firstDie);
        System.out.println("The second die comes up " + secondDie);
        System.out.println("Your total roll is " + totalRoll);
    }
}