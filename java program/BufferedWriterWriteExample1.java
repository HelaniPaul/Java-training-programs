import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterWriteExample1 {

	public static void main(String[] args) {	
		
		//initialize a FileWriter
		FileWriter fw;
		try {
			fw = new FileWriter("input.txt");
			// initialize our BufferedWriter
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Starting the write operation");
			// write values
			
			
			String s = "test string";
			char[] cbuf = s.toCharArray();
			bw.write(cbuf,0,4);			
			
			// close the BufferedWriter object to finish operation
			bw.close();
			System.out.println("Finished");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}		
		
	}
}