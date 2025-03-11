public class oneInMatrix{

    public static int minSteps(int[][] mat){
       int count = 0;
       int x = 0;
       int y = 0;
       if(mat[2][2] == 1){
          return count;
       }
       for(int i=0; i<mat.length; i++){
          for(int j=0; j<mat.length; j++){
             if(mat[i][j] == 1){
               x = Math.abs(i-2);
               y = Math.abs(j-2);
             }
          }
       }
       count = x+y;
       return count;
    }
    public static void main(String[] args){
        int[][] mat = {
                         {0,0,1,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}
                      };
         System.out.print(minSteps(mat));
        
    }
 }
