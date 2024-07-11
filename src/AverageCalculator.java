import java.util.List;
import java.util.stream.Collectors;

public class AverageCalculator {

    public static int calculateAverage(List<Integer> numbers) {
        double average = numbers.stream()
                .collect(Collectors.averagingInt(num -> num));
        return (int) average;
    }
}
