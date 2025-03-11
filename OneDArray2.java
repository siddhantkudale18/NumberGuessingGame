// 1. Checking wether given element is present in array or not

/*
import java.util.*;

public class OneDArray2 {

    public static void check(int arr[], int key){
          boolean test = false;
          for(int i=0; i<arr.length; i++){
            if(key == i){
                test = true;
                break;
            }
          }
          System.out.println(test);
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int key = -9;
        check(arr, key);
    }
}
*/

// 2. Finding Max Number in Array

// Finding Max and Min numbers in an array
/* 
import java.util.*;
public class OneDArray2{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,5,7};
        int max = arr[0]; 
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
    }
}
*/
/* 
import java.util.*;
public class OneDArray2{
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
    }
}*/

// 3. Sorting an elements in given array in assending order
/* 
import java.util.*;
public class OneDArray2{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,5,7};
        Arrays.sort(arr, 2, 5);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
*/

// Java program to reverse the elements in array
/* 
import java.util.*;

public class OneDArray2{
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
       }
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        
     }    
}
*/

// Finding the sum and average of elements in array
/*
import java.util.*;

public class OneDArray2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0, avg;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        avg = sum/n;
        System.out.println(avg);
    }
}
 */

 // To print only even and odd numbers from array
/* 
 import java.util.*;
 public class OneDArray2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }System.out.println();
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
 }
*/

// To print sum of odd elements from array
/* 
import java.util.*;
 public class OneDArray2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }    
 } 
 */

 // printing second largest and second smallest element of array
 /* 
 import java.util.*;
 public class OneDArray2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]+" "+arr[n-2]);
    }
 }  
 */      