package Z_Program_Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String input = "Him";
        String input2 = "miH";

        if (input.length() != input2.length()) {
            System.out.println("Not valid for checking anagram");
        } else {
            char c1[] = input.toLowerCase().toCharArray();
            char c2[] = input.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        }
    }
}
