import java.util.Scanner;
public class GenericRoot {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();

      for(; n > 9;) {
         int sum = 0;
         int temp = n;

         for(; temp > 0; temp /= 10)
            sum += temp % 10;

         n = sum;
      }

      System.out.println("Generic Root: " + n);
   }
}