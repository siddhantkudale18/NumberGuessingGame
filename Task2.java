// Third largest element in an array of distinct elements

/*public class Task2 {

    public static int trdLarge(int arr[], int n){
        int large1 = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > large1){
                large1 = arr[i];
            }
        }
        int large2 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > large2 && arr[i] < large1){
                large2 = arr[i];
            }
        }
        int large3 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > large3 && arr[i] < large2){
                large3 = arr[i];
            }
        }
        return large3;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,57,89,2,3};
        int n = arr.length;
        System.out.println(trdLarge(arr, n));
    }
}*/

// Alternative Method

/*public class Task2{
    public static int thirdLarge(int arr[], int n){
        int first = arr[0]; 
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] < first && arr[i] > second){
                third = second;
                second = arr[i];
            }
            else if(arr[i] < second && arr[i] > third){
                third = arr[i];
            }
        }
        return third;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,82,3,4};
        int n = arr.length;
        System.out.println(thirdLarge(arr, n));
    }
}*/

// Find element in a sorted array whose frequency is greater than or equal to n/2.

/*public class Task2{

    public static boolean maxFrequency(int arr[], int n){
        int maxFrequent = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxFrequent){
                maxFrequent = count;
            }
            if(maxFrequent > n/2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,2,2};
        int n = arr.length;
        System.out.println(maxFrequency(arr, n));
    }
}*/

// Ceiling in a sorted array --> Time complexity O(n)

/*import java.util.Scanner;
public class Task2{

    public static int celingElement(int arr[], int n, int low, int x){

        if(x < arr[low]){
            return low;
        }
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                return i;
            }
            else if(arr[i] < x && arr[i+1] > x){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,9};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(celingElement(arr, n, 0, x));
    }
}*/

// Using Binary Search --> Time complexity O(logn)

/*import java.util.Scanner;
public class Task2{

    public static int celingElement(int arr[], int n, int x){

        if(x == 0){
            return -1;
        }

        int h = n-1;
        int l = 0;
        while(l <= h){
            int m = l + (h-l) / 2;
            if(arr[m] == x){
                return m;
            }
            else if(arr[m] > x){
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,9};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(celingElement(arr, n, x));
    }
}*/

// Find the only repetitive element between 1 to N-1 --> Time Complexity O(nlogn)

/*public class Task2{

    public static int repeatedElement(int arr[], int n){
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(repeatedElement(arr, n));
    }
}*/

// Find a peak element which is not smaller than its neighbours

/*public class Task2{

    public static int peakElement(int arr[], int n){
        if(n == 1){
            return 0;
        }
        if(arr[0] >= arr[1]){
            return 0;
        }
        if(arr[n-1] >= arr[n-2]){
            return n-1;
        }
        for(int i=1; i<=n; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,7,1};
        int n = arr.length;
        System.out.println(peakElement(arr, n));
    }
}*/

// Leaders In array 

/*public class Task2{

    public static void theLeader(int arr[], int n){
        int max = arr[n-1];
        System.out.print(max + " ");
        for(int i=n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        theLeader(arr, n);
    }
}*/

// Equilibrium index of an array

/*public class Task2{

    public static int theEquilibrium(int arr[], int n){
        for(int i=0; i<n; i++){
            int leftSum = 0;
            for(int j=0; j<i; j++){
                leftSum += arr[j];
            }
            int rightSum = 0;
            for(int j=i+1; j<n; j++){
                rightSum += arr[j];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;
        System.out.println(theEquilibrium(arr, n));
    }
}*/

// Repeated Elements

/*public class Task2 {

    public static void twoRepeated(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int n = arr.length;
        twoRepeated(arr, n);
    }
}*/

// Using HashSet --> Time complexity O(n

/*import java.util.HashSet;
public class Task2 {
    public static void repeatedElement(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i] + " ");
            }
            set.add(arr[i]);
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int n = arr.length;
        repeatedElement(arr, n);
    }
}*/

// Triplet Sum eqial to given number

/*public class Task2 {
    public static void tripletSum(int arr[], int n, int sum){
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; j<n; j++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int sum = 12;
        tripletSum(arr, n, sum);
    }
}*/

// A Simple Java program to count triplets with sum smaller 
// than a given value 

/*public class Task2 {

    public static int tripletSum(int arr[], int n, int sum){
        int count = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] < sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 7};
        int n = arr.length;
        System.out.println(tripletSum(arr, n, 12));
    }
}*/

// Odd Occurance of the numbers in arr

/*public class Task2 {

    public static void twoOddOccur(int arr[], int  n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 12, 12, 23, 12, 45};
        int n = arr.length;
        twoOddOccur(arr, n);
    }
}*/

/*public class Task2 {

    public static void twoOddOccur(int arr[], int n){
        int temp = 0;
        for(int i=0; i<n; i++){
            temp = temp ^ arr[i];
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 12, 12, 23, 12, 45};
        int n = arr.length;
        twoOddOccur(arr, n);
    }
}*/

// Check if a given array contains duplicate elements within k distance from each other

/*public class Task2 {
    
    public static boolean atDistanceOfK(int arr[], int n, int k){
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<=i+3; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,3};
        int n = arr.length;
        int k = 3;
        System.out.println(atDistanceOfK(arr, n, k));
    }
}*/

// Using HashSet --> Time complexity O(n)

/*import java.util.HashSet;
public class Task2 {

    public static boolean isPresent(int arr[], int n, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
            if(i >= k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        int n = arr.length;
        int k = 3;
        if(isPresent(arr, n, k)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}*/

// the task is to find the number of pairs of integers in the array whose sum is equal to K.
// Time complexity --> O(n)
/*public class Task2 {
    
    public static int sumOfPairs(int arr[], int n, int k){
        int count =0;
        for(int i=0; i<n-1; i++){ 
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,7,-1,3,4,3,2};
        int n = arr.length;
        System.out.println(sumOfPairs(arr, n, 6));
    }
}*/