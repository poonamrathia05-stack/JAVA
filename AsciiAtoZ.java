import java.util.Scanner;
public class AsciiAToZ {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      for(char c = 'a'; c <= 'z'; c++)
         System.out.println(c + " = " + (int)c);
   }
}