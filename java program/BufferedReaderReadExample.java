import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class BufferedReaderReadExample {

	public static void main(String[] args) {	
		
		//initialize a FileReader
		FileReader fw;
		try {
			fr = new Filereader("test1.txt");
			BufferedReader br = new BufferedReader(fw);
			System.out.println("Starting the write operation");
			System.out.println("Finished");
		} catch (FileNotFoundException fe) {
			System.out.println("File not Found");
		}		
		char[] ch = new char[fr.available()];
		int off = 5;
		br.read(ch,off,ch.length()-off);
		for(char c:ch)
		{
			System.out.print(c);
		}
		
		
	}
}