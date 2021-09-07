package filepractice;
import com.opencsv.CSVWriter;
import java.io.*;
public class SelfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creation of file
		String filepath="C:\\javafilehandling\\selfpractice.csv";
		File f1=new File(filepath);
		File f2=new File("C:\\javafilehandling\\practice.xlsx");
		
		try {
			if(f1.createNewFile()) {
				System.out.println("File is created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(f2.createNewFile()) {
				System.out.println("Xls file created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Writing in a file
		try {
			FileWriter fw=new FileWriter(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CSVWriter cw=new CSVWriter(fw);
		
	}

}
