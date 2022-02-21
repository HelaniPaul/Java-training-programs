/*Program to find if a particular number is a Strong number.*/
import java.io.*;
import java.util.*;
class StrongNumber
{
    
   public static boolean Strong(int number)
   {

      int sum = 0, last = 0;
      int temp = number;
      while(temp != 0) {
          last= temp % 10;
          sum += facto(last);
          temp /= 10;
      }
      if(sum == number)
          return true; 
      return false; 
   }
   public static long facto(int n) {
      long fact = 1;
      for(int i=1; i<=n; i++) {
          fact *= i;
      }
      return fact;
   }

   public static void main(String[] args) {
      int number = 0;
      boolean result = false;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter any number:: ");
      number = scan.nextInt();
      result = Strong(number);
      if(result)
          System.out.println(number +
                  " is a strong number.");
      else
          System.out.println(number +
                 " is not a strong number");
      scan.close();
   }
}
	