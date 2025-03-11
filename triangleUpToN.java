public class triangleUpToN{

    public static void theTriangle(int n){
      int x = 1;
      for(int i=0; i<n; i++){
        for(int j=0; j<=i; j++){
          System.out.print(x++ + " ");
          if(x == n+1){
            break;
          }
        }
        if(x == n+1){
          break;
        }
        System.out.println();
      }
    }
    public static void main(String[] args){
      int n = 25;
      theTriangle(n);
    }
  }
