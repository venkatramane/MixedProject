package sample;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Quantity");
		int unit = sc.nextInt();
		
		if(unit*100>=1000){
			
			System.out.println("You have a discount"+((unit*100)/10)+" Your Total is "+((unit*100)-((unit*100)/10)));
			
		}else{
			System.out.println("No discount");
		}

	}

}
