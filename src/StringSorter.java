import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static List<String> sortByLength(List<String> strings) {
        return strings.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
    }
}
