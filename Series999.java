import java.util.Scanner;
public class Series999 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of terms: ");
      int n = sc.nextInt();

      long term = 9;
      long sum = 0;

      for(int i = 1; i <= n; i++) {
         sum += term;
         term = term * 10 + 9;
      }

      System.out.println("Sum: " + sum);
   }
}