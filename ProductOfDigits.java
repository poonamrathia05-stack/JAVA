import java.util.Scanner;
public class ProductOfDigits {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      int n = sc.nextInt();

      int product = 1;

      for(; n != 0; n /= 10)
         product *= n % 10;

      System.out.println("Product: " + product);
   }
}