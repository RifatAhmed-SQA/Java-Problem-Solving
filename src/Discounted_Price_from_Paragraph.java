import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Discounted_Price_from_Paragraph {
     public  static  void  main(String[]agrs){
         String text = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";
         Matcher matcher = Pattern.compile("\\d+").matcher(text);
         int sum = 0;
         while (matcher.find()) sum += Integer.parseInt(matcher.group());
         double total = sum - (sum * 0.15);
         System.out.println("Total after 15% discount: " + total);


     }
}
