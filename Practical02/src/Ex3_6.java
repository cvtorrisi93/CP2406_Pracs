// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.6 - Largest Number of Divisors v2.0

import java.util.ArrayList;

public class Ex3_6 {
    public static void main(String[] args) {
        int divisorCount = 0;
        int largestDivisorNumber = 0;
        int largestDivisorCount = 0;
        int[] allDivisorCounts = new int[10001];

        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount >= largestDivisorCount) {
                largestDivisorCount = divisorCount;
                largestDivisorNumber = i;

            }
            allDivisorCounts[i] = divisorCount;
            divisorCount = 0;
        }
        System.out.println("Largest number of divisors: " + largestDivisorCount);
        System.out.println("Numbers with the largest number of divisors are:");
        for (int i = 0; i <= 10000; i++) {
            if (allDivisorCounts[i] == largestDivisorCount)
                System.out.println(i);
        }
    }
}
