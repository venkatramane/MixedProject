package pramothProject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mobileshop1 {

	public void getBrandName(String brand){
		
		List<String> list=new ArrayList<String>();
		list.add("black");
		list.add("A50");
		
		List<String> list2=new ArrayList<String>();
		list2.add("Gray");
		list2.add("Mi2");
		
		List<String> list3=new ArrayList<String>();
		list3.add("Blue");
		list3.add("6KT");
		
		HashMap<String,List<String>> map=new HashMap<String,List<String>>();
		
		map.put("samsung", list);
		map.put("RedMi", list2);
		map.put("iphone", list3);
		
		for(Map.Entry<String,List<String>> name:map.entrySet() ){
			
			if(name.getKey().equalsIgnoreCase(brand)){
				System.out.println(name.getValue());
			}
			
		}
		
	}

}
