import java.util.Scanner;
public class ApproximateE {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter value of n: ");
      int n = sc.nextInt();

      double e = 1.0;
      double fact = 1.0;

      for(int i = 1; i <= n; i++) {
         fact *= i;
         e += 1.0 / fact;
      }

      System.out.println("e: " + e);
   }
}