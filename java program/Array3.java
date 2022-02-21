/*program to take input of Two arrays and store the similar elements into the resultant array.
 sort the resultant array in ascending order using bubble sort.
NOTE: there must atleast be 6 similar elements.
similar elements= the elements occurring in both the arrays.*/
import java.io.*;
import java.util.*;
import java.util.Arrays;
class Array3
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no. of values in the array:");
			int num = sc.nextInt();
			int[] arr1 = new int[num];
			int[] arr2 = new int[num];
			int[] arr3 = new int[num];
			int count=0;
			System.out.println("enter the values in arr1:");
			for(int i=0;i<num;i++)
			{
				arr1[i] = sc.nextInt();
			}
			System.out.println("Enter the values in arr2:");
			for(int i=0;i<num;i++)
			{
				arr2[i] = sc.nextInt();
			}
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						arr3[count]=arr2[j];
						count++;
					}
				}
			}
			int len = arr3.length;
			for(int i=0;i<len-1;i++)
			{
				for(int j=0;j<len-i-1;j++)
				{
					if(arr3[j]>arr3[j+1])
					{
						int tem = arr3[j];
						arr3[j] = arr3[j+1];
						arr3[j+1] = tem;
					
					}
				}
			}
			System.out.println();
			System.out.println("After sorting:");
			System.out.println(Arrays.toString(arr3));
			
		}
	}