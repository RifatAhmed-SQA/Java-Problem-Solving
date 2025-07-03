import java.util.*;
public class Permutations_of_String {
        static int count = 0;

        public static void main(String[] args) {
            String input = "cat";
            System.out.println("Permutations:");
            generatePermutations("", input);
            System.out.println("Total permutations: " + count);
        }

        static void generatePermutations(String prefix, String remaining) {
            int n = remaining.length();
            if (n == 0) {
                System.out.println(prefix);
                count++;
            } else {
                for (int i = 0; i < n; i++) {
                    generatePermutations(
                            prefix + remaining.charAt(i),
                            remaining.substring(0, i) + remaining.substring(i + 1)
                    );
                }
            }
        }
    }

