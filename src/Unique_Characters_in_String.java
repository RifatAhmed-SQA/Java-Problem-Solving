import java.util.*;
public class Unique_Characters_in_String {
    public static  void main (String[]args){
        String input = "abcaabbcc";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) seen.add(ch);
        for (char ch : seen) result.append(ch);
        System.out.println("Output: " + result.toString());
        System.out.println("Total unique characters: " + seen.size());


    }
}
