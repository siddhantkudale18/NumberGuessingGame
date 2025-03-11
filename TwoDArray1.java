// Taking an 2d array from user and printing it
/* 
import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        int numbers[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                 numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

// Searching for a given Number x in a matrix and print its indices
/* 
import java.util.Scanner;

public class TwoDArray1{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        int num[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                num[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int x = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(num[i][j] == x){
                    System.out.println(i +" "+ j);
                }
            }
        }
     }
}
*/

// Printing a transpose of a Matrix taken from user
/*
import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();
        int numbers[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                 numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }
    }
} 
*/

