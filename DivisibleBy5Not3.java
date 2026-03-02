import java.util.Scanner;
public class DivisibleBy5Not3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter range limit: ");
      int n = sc.nextInt();

      for(int i = 1; i <= n; i++) {
         if(i % 5 == 0 && i % 3 != 0)
            System.out.print(i + " ");
      }
   }
}