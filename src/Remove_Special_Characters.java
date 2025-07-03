public class Remove_Special_Characters {
    public  static void main(String[]arg){
        String input = "s@atur!day";
        String output = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("Output: " + output);

    }
}
