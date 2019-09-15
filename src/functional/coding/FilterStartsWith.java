package functional.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStartsWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sriram", "Sadeesh", "Akshitha", "Rithisha", "Gangu", "Rithvin");
        System.out.println(names);
        System.out.println(names.stream().filter(n -> n.startsWith("R")).collect(Collectors.toList()));
    }
}
