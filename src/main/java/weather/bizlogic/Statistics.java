package weather.bizlogic;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

public class Statistics {
    private final double min;
    private final double max;
    private final double average;

    public Statistics(double min, double max, double average) {
        this.min = min;
        this.max = max;
        this.average = average;
    }

    public Statistics(DoubleSummaryStatistics summaryStatistics) {
        this(summaryStatistics.getMin(), summaryStatistics.getMax(), summaryStatistics.getAverage());
    }

    public Statistics(IntSummaryStatistics intSummaryStatistics) {
        this(intSummaryStatistics.getMin(), intSummaryStatistics.getMax(), intSummaryStatistics.getAverage());
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
