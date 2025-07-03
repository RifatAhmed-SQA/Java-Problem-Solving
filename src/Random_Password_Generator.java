import java.util.*;
public class Random_Password_Generator {
        public static void main(String[] arg) {
            String password = generatePassword();
            System.out.println("Generated Password: " + password);
        }
        public static String generatePassword() {
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lower = "abcdefghijklmnopqrstuvwxyz";
            String digits = "0123456789";
            String special = "!@#$%^&*";

            String allChars = upper + lower + digits + special;
            Random rand = new Random();

            // Ensure at least one of each required type
            StringBuilder password = new StringBuilder();
            password.append(upper.charAt(rand.nextInt(upper.length())));
            password.append(lower.charAt(rand.nextInt(lower.length())));
            password.append(digits.charAt(rand.nextInt(digits.length())));
            password.append(special.charAt(rand.nextInt(special.length())));

            // Fill remaining 4 characters randomly from all character sets
            for (int i = 4; i < 8; i++) {
                password.append(allChars.charAt(rand.nextInt(allChars.length())));
            }

            // Shuffle the characters to avoid predictable pattern
            List<Character> pwdChars = new ArrayList<>();
            for (char c : password.toString().toCharArray()) {
                pwdChars.add(c);
            }
            Collections.shuffle(pwdChars);

            // Convert back to string
            StringBuilder finalPassword = new StringBuilder();
            for (char c : pwdChars) {
                finalPassword.append(c);
            }

            return finalPassword.toString();
        }
    }

