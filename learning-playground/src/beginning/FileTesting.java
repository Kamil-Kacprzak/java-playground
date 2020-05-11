package beginning;

import java.util.*;
import java.io.*;
import java.net.URL;

public class FileTesting {
	
	private String line;
	private BufferedReader in;
	
	public FileTesting() {
		this.line = "That's a new line from FileTesting class.";
		printFile();
		writeToFile(line);
		copyAndDelete();
	}
	
	private void printFile() {
		try {
			URL fileURL = this.getClass().getResource("input.txt");
			this.in = new BufferedReader(new FileReader(fileURL.getPath()));
			while(in.readLine() != null) {
				line = in.readLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(in != null) {
					in.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void copyAndDelete() {
		File fWritten = new File("./src/beginning","output.txt");
		File fRenamed = new File("./src/beginning","Renamed_Version.txt");
		if(fWritten.renameTo(fRenamed)) {
			System.out.println("File succesfully renamed");
		}
		if(fRenamed.delete()) {
			System.out.println("File sucesfully deleted");
		}
	}

	private void writeToFile(String lineToWrite) {
		// Second argument stands for appending - false or omitting will overwrite
		//Invoking in parenthesis - try-with-resources - automatically resources are closed after the try block is done 
		try (BufferedWriter out = new BufferedWriter(new FileWriter(new File("./src/beginning","output.txt")))){
			out.write(lineToWrite);
			out.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}