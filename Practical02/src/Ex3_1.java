// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.1 - Count Rolls to Snake Eyes

public class Ex3_1 {
    public static void main(String[] args) {
        int firstDie = 0;
        int secondDie = 0;

        int count = 0;

        while (firstDie != 1 || secondDie != 1) {
            firstDie = (int)(Math.random()*6) + 1;
            secondDie = (int)(Math.random()*6) + 1;
            count++;
            System.out.println("1st Die: " + firstDie + "  |  2nd die: " + secondDie + "  |  Total Rolls: " + count);
        }

    }
}