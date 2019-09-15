package interview.coding.string;

import java.util.Arrays;

public class ReverseString {

    public static char[] reverseString(char[] s) {
        int length = s.length;
        char reversedArray[] = new char[length];
        for (int i = length-1, j = 0; i >=0; i--, j++) {
            reversedArray[j] = s[i];
        }
        return reversedArray;
    }

    public static String reverseString(String s) {
        System.out.println("string=" + s + " length="+ s.length());
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        String input = "hello";
        System.out.println("Given Input=" + input);
        char[] reversedCharArray = reverseString(input.toCharArray());
        String reversedString = reverseString(input);
        System.out.println("Output String=" + reversedString);
    }
}