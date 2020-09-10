package stringMethods;

import java.util.Locale;

public class CaseSencitive {

	public static void main(String[] args) {
		
		String low = "ChanGe TO lOWErCiiase";
		
		String lowerCase = low.toLowerCase();
		
		System.out.println(lowerCase);
		
		String changLan = low.toLowerCase(Locale.forLanguageTag("tr"));
		
		System.out.println(changLan);
		
		String uper = "Uperir Casie";
		
		
		
		String upperCas = uper.toUpperCase(Locale.forLanguageTag("tr"));
		
		System.out.println(upperCas);
	} 

}
