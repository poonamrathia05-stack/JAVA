import java.util.Scanner;
public class SumAP {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first term (a): ");
      int a = sc.nextInt();

      System.out.print("Enter common difference (d): ");
      int d = sc.nextInt();

      System.out.print("Enter number of terms (n): ");
      int n = sc.nextInt();

      int sum = 0;
      int current = a;

      for(int i = 1; i <= n; i++) {
         sum += current;
         current += d;
      }

      System.out.println("Sum: " + sum);
   }
}
