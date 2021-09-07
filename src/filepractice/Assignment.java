package filepractice;
import java.io.*;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C:\\javafilehandling\\pwd.txt");
		String[] password=new String[13];
		try {
			BufferedReader b=new BufferedReader(new FileReader("C:\\javafilehandling\\pwd.txt"));
			for(int i=0; i<password.length;i++) {
				try {
					password[i]=b.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean alpha=false;
		boolean num=false;
		boolean special=false;
		
		for(String pwd: password) {
			System.out.println(pwd);
			for(int i=0;i<pwd.length();i++) {
				if("0123456789".contains(pwd.substring(i, i+1))) {
					num=true;
					System.out.println("it contains");
				}
				else if("abcdefghijklmnopqrstuvwxyz".contains(pwd.substring(i, i+1))) {
					alpha=true;
					System.out.println("it contains alphabet");
				}
				
				else if("!@#".contains(pwd.substring(i, i+1))) {
					special=true;
					System.out.println("It contains !@#");
				}
			}
		}
		
		try {
			if(alpha) {
				throw new AlphaException();
			}
		}catch(AlphaException e) {
			System.out.println("Valid");
		}
		
		try {
			if(num) {
				throw new NumberException();
			}
		}catch(NumberException e) {
			System.out.println("Valid");
		}
		
		try {
			if(special) {
				throw new SpecialCharException();
			}
		}catch(SpecialCharException e) {
			System.out.println("Valid");
		}
		
	}

}

class NumberException extends Exception{
	NumberException(){
		
	}
}

class AlphaException extends Exception{
	AlphaException(){
		
	}
}

class SpecialCharException extends Exception{
	
}