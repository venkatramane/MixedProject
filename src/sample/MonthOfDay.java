package sample;

import java.util.Scanner;

public class MonthOfDay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter month");
		int month = in.nextInt();
		
		String monthName="";
		
		switch(month){
		
		case 1:
			monthName="January";
			break;
		case 2:
			monthName="Febuary";
			break;
		case 3:
			monthName="March";
			break;
			default:
				System.out.println("Print after");
		}
		System.out.println(monthName);
		
		

	}

}
