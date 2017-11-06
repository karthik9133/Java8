
public class MultiplyArray {

	public static void main(String[] args) {
		int a[] ={1,2,3,3,4,5};
		int b[] ={6,7,8,9,10};
		int[][] c = new int[a.length][b.length];
		
		for(int i = 0; i < a.length; i++){
		    for(int j = 0; j < b.length; j++){
		        c[i][j] = a[i] * b[j];
		       for(int x[]: c){
		    	  System.out.println(x); 
		       }
		    }
		}

	}

}
