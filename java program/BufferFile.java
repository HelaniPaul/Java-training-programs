import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
class BufferFile
	{
		public static void main(String[] args) throws IOException
		{
			String str = "Hello World";
			BufferedWriter writes = new BufferedWriter(new FileWriter("Buffer.txt"));
			writes.write(str);
			writes.close();
			System.out.println("Finally writting");
			
		}
	}