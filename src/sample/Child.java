package sample;

import java.util.Scanner;

public class Child extends Sched{
	
	public static void method(){
		System.out.println("out");
	}

	public static void main(String[] args) {
		
		
		Sched s = new Sched();
		System.out.println(s.a);
		
		s.method();
		Child.method();
		
		System.out.println(s.s);
		
//		String name= "reverse the sting";
//		String rev="";
		
		String str="";
		String rev="";
		
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		
		for(int i=str.length()-1;i>=0;i--){
			
			rev = rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
		
		scan.close();
	}

}
