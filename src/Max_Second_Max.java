import java.util.Arrays;
public class Max_Second_Max {
    public static void main(String[]args){
        int[] numbers = {11, 7, 2, 15, 6};
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        int secondMax = numbers[numbers.length - 2];
        System.out.println("Output: " + (max - secondMax));

    }
}
