import java.util.Scanner;
public class SumOfDigits {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number: ");
      int n = sc.nextInt();

      int sum = 0;
      for(; n != 0; n /= 10)
         sum += n % 10;

      System.out.println("Sum: " + sum);
   }
}