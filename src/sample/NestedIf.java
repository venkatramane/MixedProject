package sample;

public class NestedIf {

	public static void main(String[] args) {
		
		int age=18;
		int weight = 50;
		
		if(age>=18){
			if(weight>30){
				System.out.println("eligible to donate blod");
			}else{
				System.out.println("come after some day");
			}
			
		}else{
			System.out.println("Two days after");
			if(age<=16){
				System.out.println("not allowed");
			}else{
				System.out.println("dont give");
			}
		}
System.out.println("always print");
	}

}
