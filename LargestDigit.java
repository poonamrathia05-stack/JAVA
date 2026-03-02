import java.util.Scanner;
public class LargestDigit {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();
      int max = 0;

      while(n != 0) {
         int d = n % 10;
         if(d > max)
            max = d;
         n /= 10;
      }

      System.out.println("Max Digit: " + max);
   }
}