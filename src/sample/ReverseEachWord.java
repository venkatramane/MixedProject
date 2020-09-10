package sample;

public class ReverseEachWord {

	public static void main(String[] args) {


		String sr = "reverse the string each word";
		String rever = "";
		
		String word[]=sr.split(" ");
		 
		for(int i=0;i<word.length;i++){
		
			String storeWord = word[i];
			String reveword = "";
			
			for(int j=storeWord.length()-1;j>=0;j--){
				reveword = reveword+storeWord.charAt(j);
				
			}
		rever = rever+reveword+" ";
			
		}
System.out.println(rever);
	}

}
