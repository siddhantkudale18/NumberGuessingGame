// Program to find the minimum (or maximum) element of an array

/*import java.util.*;
public class Task1 {
    public static void main(String[] args) {
       int arr[] = {2,4,6,1,3,7,9};
       Arrays.sort(arr);
       System.out.println("min : "+ arr[0] + " max : " + arr[arr.length-1]);
    }
}*/

/*import java.util.*;
public class Task1{

    public static int getMin(int arr[], int size){
        int min = arr[0];
        for(int i=0; i<size; i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int getMax(int arr[], int size){
        int max = arr[0];
        for(int i=0; i<size; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {23, 45, 56, 67, 78, 89, 01};
        int size = arr.length;
        System.out.println("Min : " + getMin(arr, size));
        System.out.println("Max : " + getMax(arr, size));
    }
}*/
// Most frequent element in an array

/*import java.util.*;
public class Task1{

    public static int mostFrequent(int arr[], int n){
        int most_frequent = arr[1];
        int maxCount = 0; 
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                most_frequent = arr[i];
            }
        }
        return most_frequent;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 10, 20, 30, 10, 20, 10};
        int n = arr.length;
        System.out.println("Most frequent element is : " + mostFrequent(arr, n));
    }
}*/

// Least frequent element in an array

/*public class Task1{

    public static int leastFrequent(int arr[], int n){
        int minCount = Integer.MAX_VALUE;
        int leastFrequentElement = -1;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count < minCount){
                minCount = count;
                leastFrequentElement = arr[i];
            }
        }
        return leastFrequentElement;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,1,2,1};
        int n = arr.length;
        System.out.println(leastFrequent(arr, n));
    }
}*/



// Java program to check fixed point in an array using binary search 

/*public class Task1{

    public static int fixedPoint(int arr[], int low, int high){
        if(high>=low){
            int mid = low + (high-low)/2;
            if(arr[mid] == mid){
             return mid;
            }
            int res = -1;
            if(mid+1 <= arr[high]){
                res = fixedPoint(arr, mid+1, high);
            }
            if(res != -1){
                return res;
            }
            if(mid-1 >= arr[low]){
                return fixedPoint(arr, low, mid-1);
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println(fixedPoint(arr, 0, n-1));
    }
}*/

// Find the element that appears once in an array

/*public class Task1{

    public static int singleElement(int arr[], int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,2,5,4,5,3,4};
        int n = arr.length;
        System.out.println(singleElement(arr, n));
    }
}*/

// using XOR and Time complexity is O(n)

/*public class Task1{

    public static int singleElement(int arr[], int n){
        int x = arr[0];
        for(int i=1; i<n; i++){
            x = x ^ arr[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,3,4};
        int n = arr.length;
        System.out.println(singleElement(arr, n));
    }
}*/

// Common elements from two arrays

/*public class Task1{

    public static int[] commonElements(int arr1[], int n1, int arr2[], int n2, int temp[], int t){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                temp[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }
        int result[] = new int[k];
        System.arraycopy(temp, 0, result, 0, k);
        return result;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8};
        int n1 = arr1.length;
        int arr2[] = {1,3,5,7};
        int n2 = arr2.length;
        int temp[] = new int[2000];
        int t = temp.length;
        int common[] = commonElements(arr1, n1, arr2, n2, temp, t);
        for(int element : common){
            System.out.print(element + " ");
        }
    }
}*/

// Missing element from array

/*import java.util.Arrays;

public class Task1{

    public static int missingElement(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,2,3,4};
        int n = arr.length;
        System.out.println(missingElement(arr, n));
    }
}*/

// using (N*(N+1)) / 2

/*public class Task1{

    public static int missingElement(int arr[], int n){
        int N = n+1;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        return ((N*(N+1)) / 2) - sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,2,6,4};
        int n = arr.length;
        System.out.println(missingElement(arr, n));
    }
}*/

// Find the Number Occurring Odd Number of Times
// Time complexsity O(n^2)

/*public class Task1{

    public static int oddNumber(int arr[], int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count%2 != 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,4,5};
        int n = arr.length;
        System.out.println(oddNumber(arr, n));
    }
}*/

// using bitwise XOR --> Time complexity O(n)

/*public class Task1{

    public static int oddElement(int arr[], int n){
        int temp = 0;
        for(int i=0; i<n; i++){
            temp = temp^arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,0,2,3,1,2,3,4};
        int n = arr.length;
        System.out.println(oddElement(arr, n));
    }
}*/

// using hashing --> Time complexity O(n)

/*import java.util.HashMap;
public class Task1{

    public static int oddNumber(int arr[], int n){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hmap.containsKey(arr[i])){
                int value = hmap.get(arr[i]);
                hmap.put(arr[i], value+1);
            }
            else{
                hmap.put(arr[i], 1);
            }
        }
        for(Integer a : hmap.keySet()){
            if(hmap.get(a) % 2 != 0){
                return a;            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3};
        int n = arr.length;
        System.out.println(oddNumber(arr, n));
    }
}*/

// Find the first repeating element in an array of integers

/*public class Task1{

    public static int firstRepeat(int arr[], int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,41,2,3};
        int n = arr.length;
        System.out.println(firstRepeat(arr, n));
    }
}*/

// using hashset

/*import java.util.HashSet;
public class Task1{

    public static int firstRepeat(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            else{
                set.add(arr[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4};
        int n = arr.length;
        System.out.println(firstRepeat(arr, n));
    }
}*/

// Find lost element from a duplicated array

public class Task1{

    public static int nonDuplicate(int arr1[], int n1, int arr2[], int n2){
        int temp = 0;
        for(int i=0; i<n1; i++){
            temp = temp ^ arr1[i];
        }
        for(int i=0; i<n2; i++){
            temp = temp ^ arr2[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int n1 = arr1.length;
        int arr2[] = {1,2,3,4};
        int n2 = arr2.length;
        System.out.println(nonDuplicate(arr1, n1, arr2, n2));
    }
}