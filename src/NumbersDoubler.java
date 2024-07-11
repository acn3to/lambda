import java.util.List;
import java.util.stream.Collectors;

public class NumbersDoubler {

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }
}
