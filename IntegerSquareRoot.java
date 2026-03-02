import java.util.Scanner;
public class IntegerSquareRoot {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();
      int root = 1;

      for(int i = 1; i * i <= n; i++)
         root = i;

      System.out.println("Sqrt (floor): " + root);
   }
}