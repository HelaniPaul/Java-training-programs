/* Program to find out if a particular number is a duck number*/
import java.io.*;
import java.util.*;
class DuckNumber
	{
		public static void main(String[] args)
		{
			int flag=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			String num =sc.nextLine();
			int len = num.length();
			for(int i=0;i< len;i++)
			{
				char chr = num.charAt(i);
				if(chr== '0')
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println("Its a duck number");
			}
			else
			{
				System.out.println("Not a duck number");
			}

		}
	}