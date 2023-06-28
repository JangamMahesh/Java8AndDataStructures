package java8.lambda;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\91846\\OneDrive\\Documents\\JAVA 8\\ReadFile.txt";
		String writeFile = "C:\\Users\\91846\\OneDrive\\Documents\\JAVA 8\\WriteFile.txt";
		String str = "";

		try {
			FileReader fr = new FileReader(fileName);
			int i;
			while ((i = fr.read()) != -1) {
				str += (char) i;

			}
			FileWriter fw=new FileWriter(writeFile);
			fw.write(str);
			fr.close();
			fw.close();
			
			System.out.println("Writing into file over");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
		System.out.println("Writing into file over");

	}

}
