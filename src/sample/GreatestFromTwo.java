package sample;

import java.util.Scanner;

public class GreatestFromTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print firsr number");
		int firstnum = sc.nextInt();
		System.out.println("Second Number");
		int secoNum = sc.nextInt();
		
		if(firstnum>=secoNum){
			System.out.println("First number is greast"+firstnum);
			
		}else{
			System.out.println("Second NUmber is greast"+secoNum);
		}

	}

}
