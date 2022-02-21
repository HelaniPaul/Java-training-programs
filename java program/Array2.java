/*program to take input of two integer arrays from the user and to find the sum of both the arrays.
Sort the elements of the resultant array in ascending order using selection sort.*/
import java.io.*;
import java.util.*;
import java.util.Arrays;
class Array2
	{
		public static void main(String[] args)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no. of values for arr1");
			int num = sc.nextInt();
			int[] arr1 = new int[num];
			for(int i=0;i<num;i++)
			{
				arr1[i]=sc.nextInt();
			}
			System.out.println();
			int[] arr2 = new int[num];
			for(int i=0;i<num;i++)
			{
				arr2[i]=sc.nextInt();
			}
			System.out.println();
			System.out.println("Addition of both arrays");
			int[] result = new int[num];
			for(int i=0;i<num;i++)
			{
				result[i]=arr1[i]+arr2[i];
			}
			
			System.out.print(Arrays.toString(result));
			for(int i=0;i<num-1;i++)
				{
					int min = i;
					for(int j=i+1;j<num;j++)
					{
						if(result[j]<result[min])
						{
							min=j;
						}
					int tem = result[min];
					result[min] = result[i];
					result[i] = tem;
					}
				
				}
				System.out.println();
				System.out.println("After sorting:");
				System.out.print(Arrays.toString(result));
			} 
			
		
	}
