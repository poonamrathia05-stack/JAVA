import java.util.Scanner;
public class DecimalToOctal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter decimal number: ");
      int n = sc.nextInt();
       
      int octal = 0, place = 1;

      for(; n != 0; n /= 8) {
         octal += (n % 8) * place;
         place *= 10;
      }

      System.out.println("Octal: " + octal);
   }
}