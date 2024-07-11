import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGrouper {

    public static Map<Integer, List<Person>> groupByAge(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(person -> person.getAge()));
    }
}
