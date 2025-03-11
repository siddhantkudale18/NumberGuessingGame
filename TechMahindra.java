// Write a program to return the difference between the count of odd numbers and even numbers.

// public class TechMahindra {
//     public static void main(String[] args) {
//         int n = 8;
//         int[] arr = {10, 20, 30, 40, 55, 66, 77, 83};
//         System.out.println(theDifference(n , arr));
//     }
//     public static int theDifference(int n, int[] arr){
//         int countOdd = 0;
//         int countEven = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i]%2 != 0){
//                 countOdd++;
//             }
//             else{
//                 countEven++;
//             }
//         }
//         return countOdd-countEven;
//     }
// }

// Write a program to calculate and return the sum of absolute difference between the adjacent 
// number in an array of positive integers from the position entered by the user.

// import java.util.Scanner;
// public class TechMahindra {

//     public static int findTotalSum(int n, int[] arr, int p){
        
//         return (Math.abs(arr[p] - arr[p-1])) + (Math.abs(arr[p] - arr[p+1]));
//     }

//     public static void main(String[] args) {
        
//         int n = 7; 
//         int[] arr = {11, 22, 12, 24, 13, 26, 14};
//         Scanner sc = new Scanner(System.in);
//         int p = sc.nextInt();
//         System.out.println(findTotalSum(n, arr, p));
//     }
// }

// Write a program to find the difference between the elements at odd index and even index.

// public class TechMahindra {

//     public static int findDifference(int n, int[] arr){
//         int ans = 0;
//         for(int i=0; i<n; i++){
//             if(i%2 == 0){
//                 ans += arr[i];
//             }
//             else{
//                 ans -= arr[i];
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 8;
//         int[] arr = {2, 3, 2, 3, 2, 3, 2, 3};
//         System.out.println(findDifference(n, arr));
//     }
// }

//A Cloth merchant has some pieces of cloth of different lengths. He has an order of curtains of length of 12 feet.
//He has to find how many curtains can  be made from these pieces. Length of pieces of cloth is recorded in feet.

// public class TechMahindra{

//     public static int findTotalCurtains(int n, int[] arr){
//         int ans = 0;
//         for(int i=0; i<n; i++){
//             ans += arr[i]/12;
//         }
//         return ans;
//     }

//     public static void main(String[] args){
//         int n = 6;
//         int[] arr = {12, 12, 12, 24, 24, 11, 11};
//     System.out.println(findTotalCurtains(n, arr));
//     }
// }

// Magic Number

// import java.util.*;
// public class TechMahindra {

//     public static int countRests(int n, int[] arr){
//         int count = 0;
//         for(int i=0; i<n; i++){
//             if(isSquare(arr[i])){
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static boolean isSquare(int n){
//         int x = (int)Math.sqrt(n);
//         if(x<0){
//             return false;
//         }
//         else if(x*x == n){
//             return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int n = 8; 
//         int[] arr = {12, 11, 34, 64, 75, 81, 100, 25};
//         System.out.println(countRests(n, arr));
//     }
// }

// Nth term of GP

// import java.util.Scanner;
// public class TechMahindra {

//     public static int theGP(int firstTerm, int secondTerm, int NthTerm){
//         int ratio = secondTerm/firstTerm;
//         int ans = (int)(Math.pow(ratio, NthTerm));
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int firstTerm = sc.nextInt();
//         int secondTerm = sc.nextInt();
//         int NthTerm = sc.nextInt();
//         System.out.println(theGP(firstTerm, secondTerm, NthTerm));
//     }
// }

// Encription and Dicription
import java.util.Scanner;
public class TechMahindra {

    public static String theDicription(String str){

        StringBuilder sb = new StringBuilder();

        for(char ch: str.toCharArray()){
            char x = (char)(ch+3);
            if(x > 'z'){

                x -= 26;
            }
            sb.append((char)x);
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdewz";
        System.out.println(theDicription(str));
    }
}