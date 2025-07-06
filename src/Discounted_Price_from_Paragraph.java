import java.util.regex.*;

public class Discounted_Price_from_Paragraph {
     public  static  void  main(String[]agrs){String paragraph = "A Core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. "
             + "If I buy the laptop and 1 piece of mouse, what will be my total cost after giving 15% discount?";

         // Extract only the laptop and mouse prices
         Pattern pattern = Pattern.compile("\\d+");
         Matcher matcher = pattern.matcher(paragraph);

         int total = 0;
         int priceCount = 0;

         while (matcher.find()) {
             int num = Integer.parseInt(matcher.group());

             // Laptop and mouse price assumed to be the first two prices
             if (num >= 1000 && priceCount < 2) {
                 total += num;
                 priceCount++;
             }
         }

         // Apply 15% discount
         double discounted = total * 0.85;

         // Display with thousands separator
         System.out.printf("Output: %,d tk\n", (int) discounted);
     }
}
