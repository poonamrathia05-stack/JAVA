import java.util.Scanner;
public class MultiplesOf3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      for(int i = 3; i <= 30; i += 3)
         System.out.print(i + " ");
   }
}