import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 88, 44, 11);
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 9, 8, 4, 1);
        List<String> strings = Arrays.asList("madara", "doflamingo", "gon", "gengar");
        List<Person> persons = Arrays.asList(
                new Person("Arnaldo", 30),
                new Person("Hibino", 18),
                new Person("Ichigo", 25),
                new Person("Shinoda", 30),
                new Person("Ulquiorra", 25),
                new Person("Naruto", 18)
        );

        boolean allGreaterThanTen = NumbersVerifier.areAllGreaterThan(numbers, 10);
        System.out.println("Are all numbers greater than 10? " + allGreaterThanTen);

        List<Integer> evenNumbers = NumbersFilter.filterEvenNumbers(numbers);
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> doubledNumbers = NumbersDoubler.doubleNumbers(numbers);
        System.out.println("Doubled numbers: " + doubledNumbers);

        Integer maxNumber = MaxFinder.findMax(numbers);
        System.out.println("The maximum number in the list is: " + maxNumber);

        List<String> upperCaseStrings = StringConverter.convertToUpperCase(strings);
        System.out.println("Strings to UPPER CASE: " + upperCaseStrings);

        List<String> sortedStrings = StringSorter.sortByLength(strings);
        System.out.println("Strings sorted by length: " + sortedStrings);

        Map<Integer, List<Person>> groupedByAge = PersonGrouper.groupByAge(persons);

        groupedByAge.forEach((age, people) -> {
            System.out.println("Age: " + age);
            people.forEach(System.out::println);
        });

        int average = AverageCalculator.calculateAverage(numbers);
        System.out.println("Average of numbers: " + average);

        List<Integer> uniqueNumbers = DuplicateRemover.removeDuplicates(numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);

        List<Integer> combinedList = ListCombiner.combineList(numbers, numbers2);
        System.out.println("Combined list: " + combinedList);
    }
}
