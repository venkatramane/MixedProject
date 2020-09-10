package pramothProject;

import java.util.Scanner;

public class StringAceptAlphabt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		
		String username = sc.nextLine();
		username.toLowerCase();
		
		String add="";
		
		char[] charname = username.toCharArray();
		
		for(int i=0;i<username.length()-1;i++){
			
			char name = charname[i];
			
			if(name>='a' && name<='z'){
				
				System.out.println(username+"valid");
				
			}else{
				System.out.println("Invalid");
			}
		}
		
	sc.close();


	}

}
