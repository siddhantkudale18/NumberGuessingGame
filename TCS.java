
/*find sub arrays with a given sum i array. 
Given integer array find subarray with a given sum in it
ip = arr = [3, 4, -7, 1, 3, 3, 1, -4] target = 7
op = [3, 4], [3, 4, -7, 1, 3, 3], [1, 3, 3], [3, 3, 1]*/

// import java.util.ArrayList;
// import java.util.List;

// public class TCS {

//     public static List<List<Integer>> findSubArrays(int[] arr, int t){

//         List<List<Integer>> result = new ArrayList<>();

//         for(int i=0; i<arr.length; i++){
//             int sum = 0;
//             List<Integer> subArray = new ArrayList<>();

//             for(int j=i; j<arr.length; j++){
//                 sum += arr[j];
//                 subArray.add(arr[j]);

//                 if(sum == t){
//                     result.add(new ArrayList<>(subArray));
//                 }
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
//         int target = 7;

//         List<List<Integer>> resultArrays = findSubArrays(arr, target);

//         for(List<Integer> sub: resultArrays){
//             System.out.print(sub+", ");
//         }
//     }
// }

/*there is a robot on an m*n grid. The robot is initially 
located at the top-left corner (i.e. grid[0][0]).
the robot tries to move to the bottom-right corner(i.e. grid[m-1][n-1].
the robot can move either down or right at any point in time.
Given the two integers m*n, return the number of possible 
unique paths that the robot can take to reach the bottom-right corner.*/

// public class TCS {

//     public static int uniquePaths(int m, int n){
//         int N = m + n - 2;
//         int R = Math.min(m-1, n-1);
//         long result = 1;

//         for(int i=1; i<=R; i++){
//             result = result * (N - i + 1) / i; // Formula
//         }

//         return (int) result;
//     }

//     public static void main(String[] args) {
//         int m = 3, n = 3;
//         System.out.println("Unique Paths: " + uniquePaths(m, n));
//     }
// }

/*Given two Integers, find sum of cubes of all numbers in the range of n & m.
i/p: n = 1, m = 13
o/p: 8281*/

// import java.util.Scanner;

// public class TCS {

//     public static int findSumOfCubes(int m, int n){
        
//         int sum = 0;
//         for(int i=m; i<=n; i++){
//             sum += i * i * i;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = sc.nextInt();

//         int result = findSumOfCubes(m, n);
//         System.out.println(result);
//     }
// }

/*
You are given a grocery list which consists of three parameters ITEMS,
QUANTITY, PRICE.
Your task is to find
1) Higher selling item
2) Total selling items
3) Avg selling items
*/

import java.util.