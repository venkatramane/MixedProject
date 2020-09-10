package pramothProject;

import java.util.Scanner;

public class AcceptOnlyNumeric {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a Number");
	
	String i = in.nextLine();
	
	
	try {
		int pwd = Integer.parseInt(i);
			if(String.valueOf(pwd) != null){
				
				System.out.println("Valid");
				
			}
	} catch (NumberFormatException e) {
		
		e.printStackTrace();
	
			System.out.println("Enter a Number Only");
		
	}
		in.close();
		

	}

}
