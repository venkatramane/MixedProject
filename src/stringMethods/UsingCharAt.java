package stringMethods;

public class UsingCharAt {

	public static void main(String[] args) {
		
		String str = "Welcome to Cgaracter At index";
		
//		char s = str.charAt(1);
//		System.out.println(s);
		
		for(int i=0;i<str.length()-1;i++){
			
			if(i%2!=0){                              //  printing Odd number
				System.out.println("Char at"+i+"   "+str.charAt(i));
				
			}	
		}
		String rev = "";
		for(int j=str.length()-1;j>=0;j--){
		
			char ss = str.charAt(j);
			rev=rev+ss;
			
		}
		System.out.println(rev);
		}

	}


