package aniruddha_code;

public class MultiDimensionalArray3D {

	public static void main(String[] args) {
		
		int[][] multidimensionalArray = { {1,2,3},{4,5,6}, {7,5,9} };//{value of row,value of column}
	     
	      for(int i = 0 ; i < 3 ; i++){ //representing the row value 
	         //row
	         for(int j = 0 ; j < 3; j++){//representing the column value
	            System.out.print(multidimensionalArray[i][j] + " ");
	         }
	         System.out.println();
	      }

	}

}
