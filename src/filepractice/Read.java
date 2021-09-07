package filepractice;

import java.util.*;
import java.io.*;
import java.io.IOException;
public class Read {
	public static void main(String[] args) {
		
		// Creation of file
		File f1=new File("C:\\javafilehandling\\createfile.txt");
		try {
			if(f1.createNewFile())
			{
				System.out.println("File-"+f1.getName()+" created successfuly.");
			}
			
			else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Writing in a file
		try {
			FileWriter fwt=new FileWriter("C:\\javafilehandling\\createfile.txt");
			fwt.write("First Time I am doing work on file handling in java. The next operation which we can perform on a file is \"read from a file\". In order to write data into a file, we will use the Scanner class. Here, we need to close the stream using the close() method. We will create an instance of the Scanner class and use the hasNextLine() method nextLine() method to get data from the file.");
			fwt.close();
			System.out.println("Successfully written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Not written");
			e.printStackTrace();
		}
		
		//Reading a file
		
		try {  
            // Create f1 object of the file to read data  
            File f = new File("C:\\\\javafilehandling\\\\createfile.txt");    
            Scanner dataReader = new Scanner(f);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
		
	}
}
