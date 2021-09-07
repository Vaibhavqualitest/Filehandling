package filepractice;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class Csvfile {

	public static void main(String[] args) {
		double balance = 0;
		// TODO Auto-generated method stub
		String filepath = "C:\\javafilehandling\\credit.csv";
		File f1=new File(filepath);
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
		
		List<String[]> transactions = new ArrayList<String[]>();
		String datarow;
		try {
			BufferedReader br=new BufferedReader(new FileReader(filepath));
			while((datarow = br.readLine()) != null) {
				String[] line = datarow.split(",");
				transactions.add(line);
			}
			br.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(String[] trans: transactions) {
			for(String field: trans) {
				System.out.println(field+ " ");
			}
			System.out.println("");
		}
		
		for(String[] trans: transactions) {
			String date = trans[0];
			String type = trans[1];
			String vendor = trans[2];
			double amount = Double.parseDouble(trans[3]);
			if(type.equalsIgnoreCase("credit")) {
				balance= balance+amount;
			}
			
			if(type.equalsIgnoreCase("debit")) {
				balance= balance-amount;
			}
			System.out.println(balance);
		}
		
		if(balance>0) {
			System.out.println("New balance: "+ balance*1.1);
		}
		else if(balance<0) {
			System.out.println("Thanks for payment"+ balance);
		}
		else {
			System.out.println("Thanks for payment");
		}
		
	}

}
