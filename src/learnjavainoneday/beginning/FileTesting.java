package learnjavainoneday.beginning;

import java.util.*;
import java.io.*;
import java.net.URL;

public class FileTesting {
	
	private String line;
	private BufferedReader in;
	
	public FileTesting() {
		printFile();
		this.line = "That's a new line from FileTesting class.";
		writeToFile(line);
		copyAndDelete();	
	}
	
	private void printFile() {
		try {
			URL fileURL = this.getClass().getResource("input.txt");
			this.in = new BufferedReader(new FileReader(fileURL.getPath()));
			this.line = in.readLine();
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
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
	
	private void writeToFile(String lineToWrite) {
		// Second argument stands for appending - false or omitting will overwrite
		//Invoking in parenthesis - try-with-resources - automatically resources are closed after the try block is done 
		try (BufferedWriter out = new BufferedWriter(new FileWriter(new File("./src/learnjavainoneday/beginning","output.txt")))){
			out.write(lineToWrite);
			out.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	private void copyAndDelete() {
		File fWritten = new File("./src/learnjavainoneday/beginning","output.txt");
		File fRenamed = new File("./src/learnjavainoneday/beginning","Renamed_Version.txt");
		if(fWritten.renameTo(fRenamed)) {
			System.out.println("File succesfully renamed");
		}else {
			System.out.println("Couldn't rename the file");
		}
		if(fRenamed.delete()) {
			System.out.println("File sucesfully deleted");
		}else {
			System.out.println("Couldn't delete the file");
		}
	}
}