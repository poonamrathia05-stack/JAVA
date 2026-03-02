import java.util.Scanner;
public class SpyNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int n = sc.nextInt();

      int sum = 0, product = 1;
      int temp = n;

      for(; temp != 0; temp /= 10) {
         int d = temp % 10;
         sum += d;
         product *= d;
      }

      if(sum == product)
         System.out.println("Spy Number");
      else
         System.out.println("Not Spy Number");
   }
}