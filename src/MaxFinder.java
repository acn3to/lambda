import java.util.List;
import java.util.Optional;

public class MaxFinder {

    public static Integer findMax(List<Integer> numbers) {
        Optional<Integer> maxNumber = numbers.stream()
                .max((num1, num2) -> num1.compareTo(num2));
        return maxNumber.orElse(null);
    }
}
