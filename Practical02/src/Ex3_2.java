// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.2 - Largest Number of Divisors v1.0

public class Ex3_2 {
    public static void main(String[] args) {
        int divisorCount = 0;
        int largestDivisorNumber = 0;
        int largestDivisorCount = 0;

        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount > largestDivisorCount) {
                largestDivisorCount = divisorCount;
                largestDivisorNumber = i;
            }
            divisorCount = 0;
        }
        System.out.println("Number: " + largestDivisorNumber + "  |  Number of divisors: " + largestDivisorCount);
    }
}
