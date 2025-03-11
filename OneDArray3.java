// Find the element that appears once in an array where every other element appears twice
/*
import java.util.Arrays;
public class OneDArray3{
    public static int  once(int arr[], int n){
        Arrays.sort(arr);
           for(int i=0; i<n; i++){
            if(i%2 == 0){
                if(arr[i] != arr[i+1]){
                    return arr[i];
                }
            }
           }
           return -1;
    } 
     public static void main(String[] args) {
        int arr[] = {3, 3, 5, 4, 5, 2, 4};
        int n = arr.length;
        System.out.println(once(arr, n));
     }
}
 */

 // Least frequent element in an array
/* 
 import java.util.*;
 public class OneDArray3{
    public static int INT_MAX = 1000000000;
    public static int leastNum(int arr[], int n){
        int minFreqCount = -1;
        int minCount = INT_MAX;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count < minCount){
                minCount = count;
                minFreqCount = arr[i];
            }
            
        }
        return minFreqCount;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,2,1,3};
        int n = arr.length;
        System.out.println(leastNum(arr, n));
    }
 }
*/

// Find a Fixed Point (Value equal to index) in a given array
/* 
import java.util.*;
public class OneDArray3{
    public static int fixed(int arr[], int n){
           for(int i=0; i<n; i++){
            if(arr[i] == i){
                return arr[i];
            }
           }
           return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-10, -5, 0, 3, 7};
        int n = arr.length;
        System.out.println(fixed(arr, n));
    }
}
*/

// Common elements in three sorted arrays using two pointer:
/* 
import java.io.*;
class OneDArray3{

    public static void commonElement(int arr1[], int arr2[], int temp[], int m, int n, int k[]){
        int i=0; 
        int j=0;
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
               i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                temp[k[0]] = arr1[i];
                i++;
                j++;
                k[0]++;
            }
        }
    }
   public static void main(String[] args) {

    int arr1[] = {1,2,3,4,5};
    int arr2[] = {2,4,6,7,8,9};
    int arr3[] = {2,3,4,5};
    int n1 = arr1.length;
    int n2 = arr2.length;
    int n3 = arr3.length;

    int temp[] = new int[200000];
    int ans[] = new int[200000];
    int k[] = {0};

    commonElement(arr1, arr2, temp, n1, n2, k);
    int tempSize = k[0];
    k[0] = 0;

    commonElement(arr3, temp, ans, n3, tempSize, k);
    System.out.println("Common Elements in the array : ");
    for(int i=0; i<k[0]; i++){
        System.out.print(ans[i] + " ");
    }
    System.out.println();
   }
}
*/
// Check for Majority Element in a sorted array
/* 
import java.io.*;
class OneDArray3{
    public static int majorityElement(int arr[], int n){
        
        int maxCount = n/2;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;

                }
                if(count > maxCount){
                    maxCount = count;
                    return arr[i];
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 10};
        int n = arr.length;
        System.out.println(majorityElement(arr, n));
    }
}*/

// Find the Missing Number
/* 
import java.util.*;

class OneDArray3{
    public static void missingNumber(int arr[], int n){
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
               System.out.println(arr[i] - 1);
               return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,7,8};
        int n = arr.length;
        Arrays.sort(arr);

        missingNumber(arr, n);

    }
}*/

// Find the Number Occurring Odd Number of Times
/* 
import java.util.*;
public class OneDArray3{
    public static int occurringOdd(int arr[], int n){
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
        int arr[] = {1, 2, 3, 2, 3, 1, 3};
        int n = arr.length;
        System.out.println(occurringOdd(arr, n));
    }
}*/

// Find the first repeating element in an array of integers
/*
import java.io.*;
public class OneDArray3{
    public static int firstRepeating(int arr[], int n){
        for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(arr[i] == arr[j]){
                        return arr[i];
                    }
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        System.out.println(firstRepeating(arr, n));
    }
} */

