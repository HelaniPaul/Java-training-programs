import java.io.FileWriter;
import java.io.IOException;
class CreateFile
	{	
		public static void main(String[] args) throws IOException
		{
			char c ='A';
			FileWriter fw = new FileWriter("writer.txt");
			fw.write(c);
			System.out.println("Writting successful");
			fw.close();

		}
	}