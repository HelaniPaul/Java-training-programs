/*Create a arraylist of integers and find the sum and average of the entire list.*/
import java.util.ArrayList;
class IntegerArray1
	{
		public static void main(String[] args)
		{
			ArrayList<Integer> num =new ArrayList<Integer>();
			num.add(12);
			num.add(45);
			num.add(78);
			num.add(34);
			double sum = 0;
			for(int sum1 : num)
			{
				sum+=sum1;
			}
			double average = sum/num.size();
			System.out.println("Sum of the integer array:"+sum);
			System.out.println("Average of the integer array:"+average);
			
		}
	}