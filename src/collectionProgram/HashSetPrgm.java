package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetPrgm {

	public static void main(String[] args) {
		
		
		HashSet<String> has = new HashSet<String>();
		
		has.add("sda");
		has.add("sssda");
		has.add("sfda");
		has.add("sdwesa");
		has.add("sdwea");
		
		has.removeIf(str->str.contains("Vijay"));
		

Spliterator<String> d=has.spliterator();
System.out.println(d.estimateSize());

ArrayList<String> ar= new ArrayList<String>();

			ar.add("venkat");
			ar.add("venkat");
			ar.add("venewqfdewfwskat");
			ar.add("vewewenkat");
			ar.add("venkat");
			ar.add("venkat");
			ar.add(null);

			HashSet<String> has1 = new HashSet<String>(ar);	
			
			has1.add("change");
			
		Iterator<String> it = has1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

		
		Collections.replaceAll(ar, "venkat", "newVenkat");
		
		System.out.println(ar);
	}

}
