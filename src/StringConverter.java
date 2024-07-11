import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {

    public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }
}
