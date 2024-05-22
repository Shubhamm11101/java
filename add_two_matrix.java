public class add_two_matrix {
    public static void main(String args[]){
        int mat1[][] = {{1,2,3},
                      {3,4,5},
                      {4,5,6}};
        
       int mat2[][] = {{6,7,8},
                       {4,7,6},
                       {7,8,9}};
      int [][] result = {{0,0,0},
                         {0,0,0},
                         {0,0,0} };
      for(int i=0; i<mat1.length; i++){
        for(int j=0; j<mat1[i].length; j++){
            System.out.format("setttting values for i= %d and j=%d\n", i,j);
            result[i][j] = mat1[i][j] + mat2[i][j];

        }
        
      }

      for(int i=0; i<mat1.length; i++ ){
        for(int j=0; j<mat1[i].length; j++){
        System.out.print(result[i][j] + " ");
        result[i][j] = mat1[i][j] + mat2[i][j];
        }
        System.out.println(" ");
      }
        
    
}
}