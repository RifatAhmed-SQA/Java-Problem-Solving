public class sum_of_all_prime_numbers {
    public static void main(String[]args){
        int[] numbers = {11, 7, 2, 15, 6};
        int sum = 0;

        for (int n : numbers) {
            if (isPrime(n)) sum += n;
        }

        System.out.println("Output: " + sum); // Output: 18
    }

    // Method defined outside main
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
