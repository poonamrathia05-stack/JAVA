import java.util.Scanner;
public class DecimalToBinary {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter decimal number: ");
      int n = sc.nextInt();

      int binary = 0, place = 1;

      for(; n != 0; n /= 2) {
         binary += (n % 2) * place;
         place *= 10;
      }

      System.out.println("Binary: " + binary);
   }
}