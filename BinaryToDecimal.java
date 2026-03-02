import java.util.Scanner;
public class BinaryToDecimal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter binary number: ");
      long binary = sc.nextLong();

      int decimal = 0;
      int base = 1;

      for(; binary > 0; binary /= 10) {
         int lastDigit = (int)(binary % 10);
         decimal += lastDigit * base;
         base *= 2;
      }

      System.out.println("Decimal: " + decimal);
   }
}