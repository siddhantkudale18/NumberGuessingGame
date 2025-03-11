// Find the Missing Number
/* 
import java.io.*;
import java.util.Arrays;

public class OneDArray4 {
    public static int missingElement(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,3};
            int n = arr.length;
            System.out.println(missingElement(arr, n));
    }
}
*/

// Find the Number Occurring Odd Number of Times
/* 
import java.io.*;
public class OneDArray4{
    public static int oddOccrance(int arr[], int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,1,3};
        int n = arr.length;
        System.out.println(oddOccrance(arr, n));
    }
}
*/

// Find the first repeating element in an array of integers
/* 
import java.io.*;
import java.util.Arrays;
public class OneDArray4{
    public static int firstRepeating(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
      public static void main(String[] args) {
        int arr[] = {6, 10, 5, 7, 9, 120, 4, 6, 10};
        int n = arr.length;
        System.out.println(firstRepeating(arr, n));
      }
}
*/

// Find lost element from a duplicated array

// import java.io.*;
// public class OneDArray4{
//     public static int missingElement(int arr1[], int arr2[], int n1, int n2){
//         boolean found;
//         for(int i=0; i<n1; i++){
//         found = false;

//            for(int j=0; j<n2; j++){
//             if(arr1[i] == arr2[j]){
//                 found = true;
//                 break;
//             }
//            }
//            if(!found){
//             return arr1[i];
//            }
//         }   
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr1[] = {4,5,6,7,8,9,2};
//         int arr2[] = {4,5,6,7,8,9};
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         System.out.println(missingElement(arr1,arr2,n1,n2));
//     }
// }

// Find element in a sorted array whose frequency is greater than or equal to n/2.
/* 
import java.io.*;
public class OneDArray4{
    public static int maxFreq(int arr[], int n){
        for(int i=0; i<n; i++){
            int freq = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }
            if(freq >= n/2){
                return arr[i];
            }
        }
     return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6,3, 4, 5, 5, 5};
        int n = arr.length;
        System.out.println(maxFreq(arr, n));
    }
}
*/

// Find the largest three distinct elements in an array without using sorting
/* 
import java.io.*;
public class OneDArray4{
    public static void threeDistinct(int arr[], int n){
        if(n < 3){
            System.out.println("In valid input");
            return;
        }
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println(first+" "+second+" "+third);
    }
    public static void main(String[] args) {
        int arr[] = {5,6};
        int n = arr.length;
        threeDistinct(arr, n);
    }
}
*/

// Move all zeroes to end of array
/*
public class OneDArray4{
    public static void zerosAtEnd(int arr[]){
        int nonZeroIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex++] = arr[i];
            }
        }
        for(int i = nonZeroIndex; i<arr.length; i++){
            arr[i] = 0;
        }   
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,4,0,5,6,0};
        zerosAtEnd(arr);
    }
}
 */

 // Rearrange an array in maximum minimum form using Two Pointer Technique
/* 
 class OneDArray4{
    public static void maxMinForm(int arr[], int n){
        int arr2[] = new int[n];
        int i;
        for(i=0; i<n/2; i++){
            arr2[i] = arr[i];
        }
        for(i=n-1; i>n/2; i--){
            arr2[i] = arr[i];
        }
        System.out.println(arr2[i]+" ");
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        maxMinForm(arr, n);
    }
 }
 */

 class OneDArray4{
    public static void target(int arr[], int n, int target){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,7,9,12};
        int n = arr.length;
        int target = 14;
        target(arr,n,target);
    }
 }