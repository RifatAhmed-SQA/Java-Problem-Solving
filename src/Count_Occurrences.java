import java.util.*;

public class Count_Occurrences {
    public static void main(String[]args){
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int n : numbers) countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        countMap.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
