import java.util.Scanner;
public class LCM {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first number: ");
      int n1 = sc.nextInt();

      System.out.print("Enter second number: ");
      int n2 = sc.nextInt();

      int max = Math.max(n1, n2);

      for(;; max++) {
         if(max % n1 == 0 && max % n2 == 0) {
            System.out.println("LCM: " + max);
            break;
         }
      }
   }
}