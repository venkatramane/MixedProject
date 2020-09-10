package pramothProject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMobileShop {

	public static void main(String[] args) {

		//Using Array List
	ArrayList<MobileShopPrgm> list=new ArrayList<MobileShopPrgm>();
	
	MobileShopPrgm samsung=new MobileShopPrgm("Samsung", 0123, 12000, "Gray");
	MobileShopPrgm redMi=new MobileShopPrgm("RedMi", 0124, 13000, "Light Gray");
	MobileShopPrgm onePlus=new MobileShopPrgm("OnePlus", 0124, 14000, "Black");
	MobileShopPrgm nokia=new MobileShopPrgm("Nokia", 0125, 15000, "White");
	MobileShopPrgm apple=new MobileShopPrgm("Apple", 0126, 16000, "Diomand color");
	MobileShopPrgm blackBerry=new MobileShopPrgm("BlackBerry", 0127, 17000, "Darck Gray");
	MobileShopPrgm karbon=new MobileShopPrgm("Karbon", 0121, 18000, "Whilte");
	
	list.add(samsung);
	list.add(redMi);
	list.add(onePlus);
	list.add(nokia);
	list.add(apple);
	list.add(blackBerry);
	list.add(karbon);
	

			
			for(MobileShopPrgm i:list){
				
				if(i.equals(samsung)){
				
				System.out.println(i.brandName+"  "+i.modelNum+"  "+i.price+"   "+i.color);
				}
			}
			


		
		//Using Constructor
//		samsung.brand();
//		redMi.brand();	
		
		
		
		
		
		
		
		
// using HashMap		
		
		HashMap<String,MobileShopPrgm> hm = new HashMap<String,MobileShopPrgm>();
		
		hm.put("Samsung", samsung);
		hm.put("RedMi", redMi);
		hm.put("OnePlus", onePlus);
		hm.put("Nokia", nokia);
		hm.put("Apple", apple);
		hm.put("BlackBerry", blackBerry);
		hm.put("Karbon", karbon);
		
//		System.out.println(hm);
		
		

		
		System.out.println("HashMap Output");
		
		for(Map.Entry g:hm.entrySet() ){
			
//			System.out.println(g.getKey()+"  "+g.getValue());
			
			String brand = (String) g.getKey();
			MobileShopPrgm mvalue = (MobileShopPrgm) g.getValue();
			
			if(brand.contains("")){
			
			System.out.println(brand+" Details ");
			
			System.out.println(mvalue.brandName+" "+mvalue.modelNum+" "+mvalue.price+" "+mvalue.color);
			
			System.out.println();
			}
		}
		}

	}


