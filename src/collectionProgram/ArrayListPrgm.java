package collectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrgm {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Venkat");
		list.add("Dhaya");
		list.add(null);
		list.add(null);
		list.add("Raj");
		
		System.out.println(list.size());
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			String ert = itr.next();
			
			System.out.println(ert);
			
		}

	}

}
