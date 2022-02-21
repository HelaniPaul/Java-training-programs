import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class FileWriter1
	{
		public static void main(String[] args) throws IOException
		{
			String str1 = "Hello World";
			int a = 34;
			String str2 = "Beautiful place";
			char[] c1 = {'x','y','z'};
			int len = str1.length();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the offset number");
			int off = sc.nextInt();	
				FileWriter fr = new FileWriter("display.txt");
				fr.write(str1,off,str1.length()-off);
				fr.close();
				System.out.println("the output displays");


		}
	}