package stringMethods;

public class SplitString {

	public static void main(String[] args) {
		
		String str = "This is the split string in is the is formatuion";
		
		
		
		String[] spl = str.split("is");
		
		for(String spt:spl){
		System.out.println(spt);

	}
		
		String[] s = str.split("i", 2);
		for(String ss:s){
			System.out.println(ss);
			
		}
		}

}
