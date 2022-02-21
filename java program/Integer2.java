import java.io.FileWriter;
import java.io.IOException;
class Integer2
	{
		public static void main(String[] args) throws IOException
		{
			int c = 12;
			FileWriter int1 = new FileWriter("Integer3.txt");
			int1.write(c);
			System.out.println("Finally the file is written");
			int1.close();
			
		}
	}