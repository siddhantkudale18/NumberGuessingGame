// To find the number of superior elements in the array


// Time complexity = O(n^2)

/*public class practice {

    public static int superiorElements(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int j;
            for(j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    break;
                }
            }
            if(j == n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {8, 10, 6, 2, 9, 7};
        System.out.println(superiorElements(arr));
    }
}*/

// Same code using Time complexity --> O(n)

/*public class practice {

    public static int superiorElements(int[] arr){
        int n = arr.length;
        int count = 0;
        int rightMax = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i] > rightMax){
                count++;
                rightMax = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 6, 2, 9, 7};
        System.out.println(superiorElements(arr));
    }
}*/

// To find the max number of pieces after the N cuts on the cake

/*public class practice {

    public static int maxPieces(int n){
        int ans = (n*(n+1)/2) + 1;
        ans %= 1000000007;
        return ans;
    }

    public static void main(String[] args) {
        int cut = 4;
        System.out.println(maxPieces(cut));
    }
}*/

// Make the given number a single digit by performing following operations
   // if number is single digit return as it is
   // if number is odd, operation : n/2
   // if number is even, operation : (n-2)/2
   // Time complexity --> O(logn)

/*public class practice {

    public static int floor(int n){
        
        if(n < 10){
            return n;
        }
        else if(n%2 == 0 && n > 9){
            return floor((n-2)/2);
        }
        else if(n%2 != 0 && n > 9){
            return floor(n/2);
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(floor(n));
    }
}*/

// Reverse The String
/*public class practice {

    public static String reverseString(String str){
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "siddhant";
        System.out.println(reverseString(str));
    }
}*/

// Calculate the sum of digits
/*public class practice {

    public static int sumOfDigits(int a){
        int sum = 0;
        while(a>0){
            int r = a%10;
            sum += r;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 4567854;
        System.out.println(sumOfDigits(a));
    }
}*/

// Transpose of the matrix 
/*public class practice {

    public static int[][] transposeMatrix(int[][] matx){

        int row = matx.length;
        int col = matx[0].length;

        int[][] ans =new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[j][i] = matx[i][j];
            }
        }
        return ans;
    }

    public static void printMatx(int[][] spd){
        for(int[] row : spd){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matx = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] spd = transposeMatrix(matx);
        
        printMatx(spd);
    }
}*/

// Check if the number is prime or not
/*public class practice {

    public static boolean checkPrime(int n){
        int count = 0;
        for(int i=1; i<n; i++){
            if(n%2 == 0){
                count++;
            }
            if(count == 2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 54;
        boolean bl = checkPrime(n);
        System.out.println(bl);
    }
}*/

// fibonacci series
/*public class practice {

    public static void fiboNacci(int n){
        int sum = 0;
        int a = 0;
        int b = 1;
            System.out.print(a + " ");
            System.out.print(b + " ");
        while(n>(2+0)){
            
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
            n--;

        }
    }

    public static void main(String[] args) {
        int n = 10;
        fiboNacci(n);
    }
}*/

// Anagram words
/*import java.util.Arrays;
public class practice {
    public static boolean checkAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "cat", str2 = "act";
        boolean bl = checkAnagram(str1, str2);
        System.out.println(bl);
    }
}*/

// Binary to its decimal 
/*public class practice {
    public static int toDecimal(String str){
        int a = Integer.parseInt(str, 2);
        return a;
    }

    public static void main(String[] args) {
        String str = "10101";
        System.out.println(toDecimal(str));
    }
}*/

// If number of upper case is max convert all string to uppercase and vice versa

/*public class practice {

    public static String examine(String str){
        int count1 = 0;
        int count2 = 0;
        for(char ch: str.toCharArray()){
            if(ch >= 65 && ch <= 90){
                count1++;
            }
            else if(ch >= 97 && ch <= 122){
                count2++;
            }
        }
        if(count1 > count2){
            return str.toUpperCase();
        }
        else{
            return str.toLowerCase();
        }
        
    }

    public static void main(String[] args) {
        System.out.println(examine("AsdffffGHJ"));
    }
}*/

// Contigous subArray sum Kadane's Algorithm

/*public class practice {

    public static int maxSum(int[] nums){

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(nums));
    }
}*/

// The function accepts an integer array 'arr' of size n and an integer 'k'.
//Implement the function to return a subarray of length 'k' whose sum of 
//elements is least.

/*import java.util.Scanner;
public class practice {

    public static void leastSum(int[] nums, int n, int x){
        int sum;
        int toIndex = 0;
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-x; i++){
            sum = 0;
            for(int j=i; j<i+x; j++){
                sum += nums[j];
            }
            if(sum < min){
                min = sum;
                index = i;
            }
        }
        for(int k=index; k<index+x; k++){
            System.out.print(nums[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : " );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of Array : ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter SubArray Size : ");
        int x = sc.nextInt();

        leastSum(arr, n, x);

    }
}*/



