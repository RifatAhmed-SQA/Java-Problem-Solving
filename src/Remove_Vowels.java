public class Remove_Vowels {
    public static void main(String[]args){
        String input = "I am a SQA Engineer";
        String output = input.replaceAll("(?i)[aeiou]", "");
        System.out.println("Output: " + output);

    }
}
