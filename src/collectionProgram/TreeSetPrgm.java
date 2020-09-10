package collectionProgram;

import java.util.TreeSet;

public class TreeSetPrgm {

	public static void main(String[] args) {
		
		TreeSet<String> tr = new TreeSet<String>();
		
		tr.add(null);       // doesn't allow null values
		tr.add("erer");
		tr.add("dfdsf");
		
		System.out.println(tr);

	}

}
