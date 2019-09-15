package functional.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPredicate {

    public static void main(String[] args) {

        Predicate<String> criteria = s -> s.length() > 4;
        List<String> names = Arrays.asList("Ram", "Sriram", "Kanniah");
        System.out.print(filter(names, criteria));
    }

    private static List<String> filter(List<String> list, Predicate<String> criteria) {
        return list.stream().filter(criteria).collect(Collectors.toList());
    }
}