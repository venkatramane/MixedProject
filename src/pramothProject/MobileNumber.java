package pramothProject;

import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Phone Number");
		
		String phNumber = inp.nextLine();
		
		int PhLength = phNumber.length();
		
		String fakeNum = "1234567890";
		
		if(PhLength==fakeNum.length()){
			
			System.out.println("Valid");
			
		}else
			System.out.println("Invalid give 10 digit number");
		

		inp.close();
		
	}

}
