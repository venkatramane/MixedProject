package collectionProgram;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
		map.put(19, null);
		map.put(20, "Venkat");
		map.put(21, "Venkat");
		map.put(11, "Pramoth");
		map.put(12, "Vinayak");
		map.put(14, "Bharath");
		map.put(null, "Vino");
		map.put(16, "Mani");
		map.put(17, "Remus");
		map.put(18, "Manoj");
		
		for(Map.Entry m:map.entrySet()){
		
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		map.putIfAbsent(11,"pramoth");
		
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(null, "Vino");
		map1.put(16, "Mani");
		map1.put(17, "Remus");
		map1.put(18, "Manoj");
		
		map1.putAll(map);
		
		map.replaceAll((k,v)->"Vijay");
		
		for(Map.Entry f:map.entrySet()){
			System.out.println(f.getKey()+"  "+f.getValue());
			
		}
		
		for(Map.Entry s:map1.entrySet()){
			
			
			System.out.println(s.getKey()+"  "+s.getValue());
		}

	}

}
