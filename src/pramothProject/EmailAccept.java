package pramothProject;

import java.util.Scanner;

public class EmailAccept {

	public static void main(String[] args) {


		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter email");
		
		String email = inp.nextLine();
		
		String gmail = "@gmail.com";
		String yahoo = "@yahoo.com";
		
		if(email.endsWith(gmail)){
			System.out.println("Valid ID");
		}
		else if(email.endsWith(yahoo)){
				System.out.println("Valid email");
			}
		
		else
			System.out.println("Invalid ID give proper id");

		
		inp.close();

	}

}
