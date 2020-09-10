package collectionProgram;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapPrgm {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> tr = new TreeMap<Integer,String>();
		
						tr.put(10, "Salue");
						tr.put(2, "value");
						tr.put(3, "dalue");
						tr.put(4, "value");
						tr.put(5, "aalue");
						tr.put(6, "balue");
						tr.put(7, "calue");
						
						System.out.println(tr.entrySet());
						
						for(Map.Entry d:tr.entrySet()){
							
							System.out.println(d.getKey()+"  "+d.getValue());
							
						}
						
						NavigableMap d = tr.descendingMap();
						
//						for(NavigableMap.Entry<Integer,String> h:d.entrySet()){
							
//							System.out.println(h.getKey()+"  "+h.getValue());
//							
//						}

	}

}
