package collectionProgram;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrgm {

	public static void main(String[] args) {
		
	LinkedList<String> link = new LinkedList<String>();
	
	link.add("werewr");
	link.add("ssadar");
	link.add("wsadwr");
	link.add("wsdwr");
	link.add("wesadwr");
	link.add("weasdwr");
	link.add("er");
	
	for(int i = 0;i<link.size();i++){
		System.out.println(link.get(i));
		
	}
	Iterator<String> it = link.iterator();
	while(it.hasNext()){
		
		String pr = it.next();
		
		System.out.println(pr);
	}
	
	for(String s:link){
		
		System.out.println(s);
	}
	
	System.out.println(link.poll());
	
	System.out.println(link.pollFirst());
	
	System.out.println(link.pop());
	link.push("ds");
	
	System.out.println(link.removeFirstOccurrence(link));
//	
	LinkedList<String> link2 = new LinkedList<String>();
	
	link2.add("er");
	link2.add("er");
//	
	System.out.println(link2.retainAll(link));
	
	System.out.println(link2);

	}

}
