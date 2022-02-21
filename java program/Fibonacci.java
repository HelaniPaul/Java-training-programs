/*Program to take a number from the user and print the Fibanocci series until that number.*/
import java.util.*;
class Fibonacci
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the user input:");
			int n = sc.nextInt();
			int Firstnum=0,Secondnum=1,nextnum;
			System.out.println("Fibonacci series upto:"+n+":");
			int i;
			while(Firstnum<=n)
			{
				System.out.print(Firstnum+ ",");
				nextnum=Firstnum+Secondnum;
				Firstnum=Secondnum;
				Secondnum=nextnum;
				
			
			}
			

		}
	}