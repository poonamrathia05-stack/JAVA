import java.util.Scanner;
public class CountLeapYears {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter start year: ");
      int start = sc.nextInt();

      System.out.print("Enter end year: ");
      int end = sc.nextInt();

      int count = 0;

      for(int y = start; y <= end; y++) {
         if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            count++;
      }

      System.out.println("Leap Years: " + count);
   }
}