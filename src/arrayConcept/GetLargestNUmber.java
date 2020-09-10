package arrayConcept;

public class GetLargestNUmber {

	public static void main(String[] args) {
		
		int larg[]={987,12,434,435,67,345,45,45};
		
		int max=larg[0];
		
		for(int i=0;i<larg.length;i++){
			if(larg[i]>max){
				max=larg[i];
				
			}
		
		}
		System.out.println(max);
	}

}
