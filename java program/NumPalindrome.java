/*Program to find the first 10 natural palindrome numbers.*/
import java.io.*;
class NumPalindrome
	{
		public static void main(String[] args)
		{
			int n, b, rev = 0;
			System.out.print("Palindrome numbers from 1 to 10:");
			for (int i = 1; i <= 11; i++)
			{
				n = i;
				while (n > 0)
				{
					b = n % 10;
					rev = rev * 10 + b;
					n = n / 10;
				}
				if (rev == i)
				{
					System.out.print(i + " ");
				}
				rev = 0;
			}
		}
 
	}

				
			
	
