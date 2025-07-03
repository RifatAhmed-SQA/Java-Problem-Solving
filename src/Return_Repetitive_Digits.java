import java.util.*;
public class Return_Repetitive_Digits {
    public  static  void  main(String[]args){
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new LinkedHashSet<>();
        for (int n : numbers) {
            if (!seen.add(n)) repeated.add(n);
        }
        System.out.println("Output: " + repeated);

    }
}
