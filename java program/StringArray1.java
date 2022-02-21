/*Create two arraylist of strings to take First_name and Last_name of the students,
and print their whole name.*/
import java.util.ArrayList;
class StringArray1
	{
		public static void main(String[] args)
		{
			ArrayList<String> str1 =new ArrayList<String>();
			ArrayList<String> str2 =new ArrayList<String>();
			str1.add("Meenu");
			str1.add("Sonu");
			str1.add("Manu");
			System.out.println("First name:"+str1);
			str2.add("John");
			str2.add("Ram");
			str2.add("Raj");
			System.out.println("Last name :"+str2);
			for(int i=0;i<str1.size();i++)
			{
				System.out.print(str1.get(i)+ " "+ str2.get(i)+ ",");
			}
			
			
		}
	}