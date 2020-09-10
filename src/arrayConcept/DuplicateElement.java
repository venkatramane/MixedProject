package arrayConcept;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String []dup={"wqe","qwe","wqe","qwe","dfs","SDf","sdf","dsf","dsf"};
		
		for(int i=0;i<dup.length-1;i++){
			
			for(int j=i+1;j<dup.length;j++){
				
				
				if((dup[i].equals(dup[j]))&&(i!=j)){
					
					System.out.println(dup[j]);
					
				}
			}
			
		}

	}

}
