package project3;

import java.util.Scanner;

public class TestTeams {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("Enter a Team");
		
		String teams = inp.nextLine();
		
		TeamsProgram tm = new TeamsProgram();
		
		tm.getteam1(teams);
		

	}

}
