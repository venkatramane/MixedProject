package sample;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 123456789;
		int rev=0;
		
		while(number!=0){
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		System.out.println(rev);
// 2 Method
for(int i=10;i>=1;i--){
	System.out.println(i);
}
		

	}

}
