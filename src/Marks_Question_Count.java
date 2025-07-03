public class Marks_Question_Count {
    public  static void main(String[]args){
        for (int x = 0; x <= 15; x++) {
            for (int y = 0; y <= 15; y++) {
                if (x + y == 15 && (x * 5 + y * 10) == 100) {
                    System.out.println("5 marks question is " + x);
                    System.out.println("10 marks question is " + y);
                }
            }
        }

    }
}
