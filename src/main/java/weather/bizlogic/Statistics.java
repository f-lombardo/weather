package weather.bizlogic;

public class Statistics {
    private final double min;
    private final double max;
    private final double average;

    public Statistics(double min, double max, double average) {
        this.min = min;
        this.max = max;
        this.average = average;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getAverage() {
        return average;
    }
}
