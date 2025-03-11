import java.util.Scanner;
public class triobonasi{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 0;
      int b = 1;
      int c = 1;
      int d = a+b+c;
      for(int i=4; i<=n; i++){
        d = a + b + c;
        a = b; 
        b = c;
        c = d;
      }
      System.out.print(d);
    }
  }