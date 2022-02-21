
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterWriteExample {

	public static void main(String[] args) {	
		
		//initialize a FileWriter
		FileWriter fw;
		try {
			fw = new FileWriter("test.txt");
			// initialize our BufferedWriter
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Starting the write operation");
			// write to a file			
			String s = "test string";		
			int off = 5;
			bw.write(s,off,s.length()-off);			
			
			// close the BufferedWriter object to finish operation
			bw.close();
			System.out.println("Finished");
		} catch (IOException e) {
			System.out.println(e);
		}		
		
	}
}