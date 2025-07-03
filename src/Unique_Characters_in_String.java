import java.util.*;
public class Unique_Characters_in_String {
    public static  void main (String[]args){
        String input = "abcaabbcc";

        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            uniqueChars.add(ch);
        }
        System.out.print("Unique characters: ");
        int i = 0;
        for (char ch : uniqueChars) {
            System.out.print(ch);
            if (++i < uniqueChars.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("\nTotal unique characters: " + uniqueChars.size());

    }
}

