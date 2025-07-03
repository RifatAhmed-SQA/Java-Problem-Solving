public class Check_for_Binary {
    public  static  void  main(String[]agrs){
        String input1 = "1001";
        String input2 = "2001";

        System.out.println("\"" + input1 + "\" is binary? " + isBinary(input1));
        System.out.println("\"" + input2 + "\" is binary? " + isBinary(input2));
    }

    static boolean isBinary(String str) {
        return str.matches("[01]+");
    }
}
