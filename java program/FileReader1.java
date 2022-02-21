import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class FileReader1
	{
		public static void main(String[] args) throws IOException
		{
			String str1 = "Hello World";
			int len = str1.length();
			Scanner sc = new Scanner(System.in);
			int off = sc.nextInt();	
			FileReader fr = new FileReader("display.txt");
			for(int i=0;i<len;i++)
			{
				fr.write(str1,off,len);
			}
			System.out.println("the output displays");
			fr.close();


		}
	}