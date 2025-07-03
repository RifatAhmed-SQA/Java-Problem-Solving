import java.util.*;
public class missing_number {
    public  static  void  main(String[]agrs){
        int[] arr = {0, 1, 2, 4, 5};
        int n = 5;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        System.out.println("Output: " + (expectedSum - actualSum));

    }
}
