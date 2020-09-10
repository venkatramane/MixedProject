package project3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamsProgram {
	
	
	public void getteam1(String team1){
	List<String> tlist=new ArrayList<String>();
	
	tlist.add("Venkat");
	tlist.add("Raman");
	tlist.add("Raj");
	tlist.add("Tilaga");
	tlist.add("Valli");
	
	
	HashMap<String,List<String>>  map= new HashMap<String,List<String>>();
	
				map.put(team1, tlist);
				
				for(Map.Entry<String,List<String>> constant:map.entrySet()){
					
					if(constant.getKey().endsWith("a")||constant.getKey().endsWith("e")||constant.getKey().endsWith("i")||constant.getKey().endsWith("o")||constant.getKey().endsWith("u")){
						
						System.out.println(constant.getValue());
						
					}
					
				}
				
	
	
	}
	public void getteam2(String team2){
	List<String> tlist2=new ArrayList<String>();
	
	tlist2.add("Elumalai");
	tlist2.add("Arivu");
	tlist2.add("Govinda");
	tlist2.add("Dhaya");
	tlist2.add("Shalini");
	
	
	}
	
	
	
	
	



}
