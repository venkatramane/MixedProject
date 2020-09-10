package switchCase;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numberOfDays =0;
		String monthofName = "";
		
		System.out.println("Enter month");
		int month = input.nextInt();
		System.out.println("Enter year");
		int year = input.nextInt();
		
		switch (month){
		case 1:
			numberOfDays=31;
			monthofName = "January";
			break;
		case 2:
			monthofName="Febury";
			if((year%400==0)||(year%4==0)&&(year%100!=0)){
				numberOfDays=29;
				
			}else{
				numberOfDays=28;
			}
			break;
		case 3:
			numberOfDays=31;
			monthofName = "March";
			break;
default:
	System.out.println("No Month");
		}
		System.out.println(monthofName+"  "+numberOfDays+"  "+ year);
input.close();
	}

}
