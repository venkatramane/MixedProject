package arrayConcept;

import java.util.Arrays;

public class ArrayFunction {

	public static void main(String[] args) {
		
		// It'll not good for memory management ok
	int[] a=new int [5];
	a[0]=10;
	a[2]=2;
	a[1]=3;
	a[3]=4;
	a[4]=5;
	
	for(int i:a){
		System.out.println(i);
	}
	
	for(int j=0;j<=a.length-1;j++){
		
		System.out.println(a[j]);
		
	}
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	int []b={1,2,3,4,5,6,7,8,9};
	
	System.out.println(Arrays.toString(b));
	
	String []sd={"dss","12","dssa"};
	
	for(String f:sd){
		System.out.println(f);
	}
	

	}

}
