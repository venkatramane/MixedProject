package pramothProject;

import java.util.Scanner;

public class CourseAccept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course");
		String course = sc.next();
		
		if(course.contains("java")){
			System.out.println("Accepted java");
		}
		else if(course.contains("selenium")){
				System.out.println("Accepted selenium");
				
			}
		else
			System.out.println("Enter java or selenium");
		
		sc.close();
		
		
	}

}
