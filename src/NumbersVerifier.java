import java.util.List;

public class NumbersVerifier {

    public static boolean areAllGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream().allMatch(number -> number > threshold);
    }
}
