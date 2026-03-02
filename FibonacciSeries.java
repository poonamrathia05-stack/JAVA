import java.util.Scanner;
public class FibonacciSeries {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of terms: ");
      int n = sc.nextInt();

      int t1 = 0, t2 = 1;

      System.out.print("Fibonacci Series: ");
      if(n >= 1) System.out.print(t1 + " ");
      if(n >= 2) System.out.print(t2 + " ");

      for(int i = 3; i <= n; i++) {
         int next = t1 + t2;
         System.out.print(next + " ");
         t1 = t2;
         t2 = next;
      }
   }
}