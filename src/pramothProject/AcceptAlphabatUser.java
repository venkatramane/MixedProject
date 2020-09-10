package pramothProject;

import java.util.Scanner;

public class AcceptAlphabatUser {

	public static void main(String[] args) {


		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter user name");
		
		char username = inp.next().charAt(0);
		
		 
		if((username>='a' && username<='z')||(username>='A' && username<='Z')){
			
			System.out.println("Given character is alphabat");
			
		}
		else
			System.out.println("Given character is Not--alphabat");
		
		
	}

}
