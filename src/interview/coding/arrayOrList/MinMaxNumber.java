package interview.coding.arrayOrList;

import java.util.*;

public class MinMaxNumber {
    public static void main(String[] args) {
//        int numbers[] = new int[] {1,2,3};
//        System.out.println(Arrays.toString(numbers));

        List<Integer> numbers = Arrays.asList(10000,2,3,4);
        System.out.println("Given numbers=" + numbers);
        Integer min = null;
        Integer max = null;

        if (numbers.size() > 0) {
            min = numbers.get(0);
            max = min;
            for (Integer i : numbers) {
                if (i < min) min = i;
                if (i > max) max = i;
            }
        }

        System.out.println("Minimum number=" + min + "\nMaximum number=" + max);
    }
}
