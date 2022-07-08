public class ProjectA {

	public static void main(String[] args) {
		int[][] matrix = {{1,1,2,0},
			      {0,1,1,3},
			      {2,0,3,3},
			      {1,3,3,3}};
	//if we want, we can specify number of  columns and rows in the below array and generate random values(Need to replace  31,32,33 line matrix to values)
		
//		 int values[][] = new int[3][4];
//	     for (int i = 0; i < values.length; i++) 
//	     {
//	        for (int j = 0; j < values.length; j++) 
//	        {
//	 		   Random rand = new Random();
//			      int upperbound = 3;
//			      int randomValue = rand.nextInt(upperbound);
//	          values[i][j] = randomValue;
//	         System.out.println(values[i][j]);
//	        }
//	     }
		

		      


		int Green = FindGridNode.getBiggestRegion(matrix, 1);
		int Red = FindGridNode.getBiggestRegion(matrix, 2);
		int Grey = FindGridNode.getBiggestRegion(matrix, 3);
		String Highest;

		if(Green > Red) {
			if(Grey > Green) {
				Highest = "Grey";
				
			} else {
				Highest = "Green";
			}
		} else {
			if(Grey > Red) {
				Highest = "Grey";
				
			} else {
				Highest = "Red";
			}
			
		}
		System.out.println("Highest Region is :"+Highest);

//
//		System.out.println(Green);
//		System.out.println(Red);
//		System.out.println(Grey);



	}

}
