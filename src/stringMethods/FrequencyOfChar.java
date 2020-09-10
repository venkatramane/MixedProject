package stringMethods;

public class FrequencyOfChar {

	public static void main(String[] args) {
		
		
		String sr = "Frequency of character of the string";
		
		int count=0;
		System.out.println(sr.length());
		for(int i=0;i<sr.length()-1;i++){
			if(sr.charAt(i)=='r'){
				count++;
				
			}
			}
		System.out.println(count);
	}

}
