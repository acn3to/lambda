import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListCombiner {

    public static List<Integer> combineList(List<Integer> listOne, List<Integer> listTwo) {
        int size = Math.min(listOne.size(), listTwo.size());

        List<Integer> combinedList = IntStream.range(0, size)
                .boxed()
                .flatMap(i -> Stream.of(listOne.get(i), listTwo.get(i)))
                .collect(Collectors.toList());

        combinedList.addAll(listOne.subList(size, listOne.size()));
        combinedList.addAll(listTwo.subList(size, listTwo.size()));

        return combinedList;
    }
}
