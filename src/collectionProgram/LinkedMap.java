package collectionProgram;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		
		hm.put(1, "value");
		hm.put(2, "value");
		hm.put(3, "value");
		hm.put(4, "value");
		
		System.out.println(hm.entrySet());
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry enter = (Map.Entry)itr.next();
			
			System.out.println(enter.getKey()+"  "+enter.getValue());
			
		}

	}

}
