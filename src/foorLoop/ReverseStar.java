package foorLoop;

public class ReverseStar {

	public static void main(String[] args) {
		
		int dia = 6;
		for(int i=1;i<=dia;i++){
			for(int j=dia;j>=i;j--){
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
