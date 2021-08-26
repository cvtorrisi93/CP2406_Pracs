// CP2406 Prac 2 - Christian Torrisi
//Exercise 3.5 - City Sales Figures

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        File textFile = new File("C:\\SSD\\Uni\\JCU\\BoIT__3.2\\CP2406 - Programming III\\Pracs\\Practical02\\src\\sales.dat");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        double salesTotal = 0;
        int numNoReportCities = 0;

        while (fileReader.hasNextLine()) {
            fileReader.useDelimiter(":\\s|\n");

            // Will read the city name, colon and space before the sales number
            fileReader.next();

            // Try and convert everything after the city name, colon and space into a double
            // If it is not converted, it will be added to show that the city did not have a sales number
            try {
                salesTotal += Double.parseDouble(fileReader.next());
            }

            catch (NumberFormatException e) {
                numNoReportCities++;
            }
        }
        System.out.println("Total Sales: $" + salesTotal);
        System.out.println("Number of cities with no reports: " + numNoReportCities);
    }
}

