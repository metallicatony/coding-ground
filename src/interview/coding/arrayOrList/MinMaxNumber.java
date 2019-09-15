package interview.coding.arrayOrList;

import java.util.*;

public class MinMaxNumber {
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(10000, 2, 3, 4);
      //int numbers[] = new int[] {1,2,3};
      // System.out.println(Arrays.toString(numbers));
      System.out.println("Given numbers=" + numbers);
      List<Integer> minMaxList = findMinMaxNumber(numbers);
      if (null != minMaxList) {
          System.out.println("Minimum number=" + minMaxList.get(0) + "\nMaximum number=" + minMaxList.get(1));
      } else {
        System.out.println("Invalid input numbers");
      }
  }

  /**
   * Finds the minimum and maximum numbers in a given list
   * @param {@code List<Integer>} a list of integer numbers
   * @return {@code List<Integer>} a list with 2 integers - first element being minimum number and the second element being the maximum number
   */
  public static List<Integer> findMinMaxNumber(List<Integer> numbers) {
        Integer min = null;
        Integer max = null;

        if (numbers.size() > 0) {
            min = numbers.get(0);
            max = min;
            for (Integer i : numbers) {
                if (i < min) min = i;
                if (i > max) max = i;
            }
            List<Integer> minMaxList = Arrays.asList(min, max);
            return minMaxList;
        }
        return null;
    }
}
