// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.2 - Statistics Calculator

public class StatCalc {

    private int count;
    private double sum;
    private double squareSum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;
    }

    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

}  // end class StatCalc