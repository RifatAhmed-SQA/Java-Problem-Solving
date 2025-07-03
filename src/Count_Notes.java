import java.util.Scanner;
public class Count_Notes {
    public static  void main(String[]agrs){
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("input: ");
        int amount = scanner.nextInt();

        System.out.println("Breakdown of " + amount + ":");

        for (int note : notes) {
            int count = amount / note;
            if (count > 0) {
                System.out.println(note + " x " + count);
                amount %= note;
            }
        }

        scanner.close();
    }

    }
