// Taking Array from user And Printing It

/*
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n = sc.nextInt();
        int marks[] = new int[n];
          
        // input
        System.out.print("Enter Elements of Array : ");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        
        //output
        for(int i=0; i<n; i++){
             System.out.println(marks[i]);
        }
        
    }
}
*/

// Taking an Array from user. Search for a given number xand print the index of it

/* 
import java.util.Scanner;

public class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
           if(x == arr[i]){
            System.out.println(i);
            }
        }

    }
}
*/

// Take Array of names as input from the user and print them on the screen

/*
import java.util.*;

public class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        //intput
        System.out.println("Enter Elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        //output
        System.out.print("The Array is : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}*/

// Find the Max and Min number in an array of integers
/* 
import java.util.*;

public class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Input
        int Numbers[] = new int[size];
        for(int i=0; i<size; i++){
            Numbers[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<Numbers.length; i++){
            if(Numbers[i] > max){
                max = Numbers[i];
            }
            if(Numbers[i] < min){
                min = Numbers[i];
            }
        }    
        System.out.println("Max Number is : " + max);
        System.out.println("Min number is : " + min);

    }
}
*/

// Take an array of numbers as input and check if it is an aarray sorted in assending order
/* 
import java.util.*;

public class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Input
        int Numbers[] = new int[size];
        for(int i=0; i<size; i++){
            Numbers[i] = sc.nextInt();
        }
        
        boolean isAssending = true;

        for(int i=0; i<Numbers.length-1; i++){
            if(Numbers[i] > Numbers[i+1]){
                isAssending = false;
            }
           
        }
        if(isAssending){
            System.out.println("sorted");
        }
        else{
            System.out.println("not assending");
        }
    }
}
*/

// Last duplicate element in a sorted array
/*import java.util.*;
public class OneDArray{
    public static void dupe(int arr[], int n){
        if(n <= 0 || arr == null){
            System.out.println("Null");
            return;
        }
        for(int i=n-1; i>=0; i--){
            if(arr[i] == arr[i-1]){
                System.out.println(i);
                break;
            }
           }
    }
   public static void main(String[] args) {
   int arr[] = {1,1,2,2,3,4,5};
   int n=arr.length;
   dupe(arr, n);
  
   }
}*/

// Most frequent element in an array
/* 
import java.util.*;
class OneDArray1{
    public static int frequent(int arr[], int n){
        int maxcount = 0;
        int maxFrequent = 0;
        for(int i=0; i<n; i++){
            int count = 0; 
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                maxFrequent = arr[i];
            }
        }
        return maxFrequent;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,3,2,2,1};
        int n = arr.length;
        System.out.println(frequent(arr, n)); 
       }
}*/