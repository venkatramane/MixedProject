package pramothProject2;

import java.util.Scanner;

public class MobileshopTest2 {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter Brand Name");
		
		String outbrand = inp.nextLine();
		
		Mobileshop1 test=new Mobileshop1();
		test.getBrandName(outbrand);

	}

}
