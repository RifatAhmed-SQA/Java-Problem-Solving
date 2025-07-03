import java.util.*;
public class Sum_of_Unique_Values {
    public static void main(String[]args){
        int[] numbers = {11, 7, 7, 11, 2, 15, 6, 6};
        Set<Integer> unique = new HashSet<>();
        for (int n : numbers) unique.add(n);
        int sum = unique.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Output: " + sum);

    }
}
