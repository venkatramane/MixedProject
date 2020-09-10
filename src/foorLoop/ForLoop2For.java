package foorLoop;

public class ForLoop2For {

	public static void main(String[] args) {           //   Reverse order             // O/P  54321
		                                                                                  //  54321
		for(int row=1;row<=5;row++){                  // for(int row=1;row<=5;row++){
			
			for(int col=1;col<=5;col++){             //  for(int col=5;col>=1;col--)
				
				System.out.print(col+"\t");         //  System.out.print(col);
			}                                      //  }
			
//			System.out.println(row+"\t");          //  System.out.println();
			System.out.println();                  //  }  }  }
			
		}

	}

}
