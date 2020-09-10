package stringMethods;

public class Empty {

	public static void main(String[] args) {
		
		String str = "this is the empty string or not"+"fdsfds";
		String emt = "s";
		
		
		
		if(emt.length()==0||emt.isEmpty()){
			System.out.println("true");
		}
		
//		else System.out.println(str);
		
		// To print the string using toCharArray()
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			
//			emt=emt+ch;
			System.out.print(ch[i]);
			
		}

	}

}
