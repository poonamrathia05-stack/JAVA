import java.util.Scanner;
public class DigitsPowerCount {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();
      int temp = n;
      int count = 0;

      while(temp != 0) {
         count++;
         temp /= 10;
      }

      temp = n;
      int sum = 0;

      while(temp != 0) {
         int d = temp % 10;
         int p = 1;

         for(int i = 1; i <= count; i++)
            p *= d;

         sum += p;
         temp /= 10;
      }

      System.out.println("Result: " + sum);
   }
}