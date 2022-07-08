
public class FindGridNode {

	  public static int gridNodeSize(int [][] matrix, int row, int column, int A){
		  //Validations whether rows and column exist
	    if(row < 0 || column < 0 ) {
	    	return 0;
	    }
	    if(row >=matrix.length || column >= matrix[row].length || matrix[row][column] != A) {
	    	return 0;
	    }
	    matrix[row][column]  = 0;
	    //Initial size 1 
	    int size = 1;
	    for (int r = row - 1;r <= row + 1;r++ ){
	      for(int c = column -1;c <=column + 1;c++){
	        size +=gridNodeSize(matrix, r, c, A);	      
	    } 
	  }
	  return size;

	}
	public static int getBiggestRegion(int [][] matrix,int A){
		//Initial Region initialize to 0
	  int highestPart = 0;
	  
	  //Find the max region 
	  for(int row = 0; row < matrix.length; row++) {
		  for(int column = 0; column < matrix[row].length; column++) {
			    if(matrix[row][column] == A){
			    	//Identify Region size
				      int size = gridNodeSize(matrix, row, column, A);
				      
				      //Identify Max region value
				      highestPart = Math.max(size, highestPart);
			
				    } 
		  }
	  }
	  //Returning highest Region/Part
	  return highestPart;

	  }
}
