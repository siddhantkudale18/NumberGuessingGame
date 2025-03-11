// Maximum and Minimum Element in the Array

/*public class dsaSheet {

    public static void maxAndMin(int[] arr){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max Element in the Array is : " + max);
        System.out.println("Min Element in the Array is : " + min);
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 1, 89};
        maxAndMin(arr);
    }
}*/

// Reverse the given Array

/*import java.util.Arrays;
public class dsaSheet {

    public static int[] reverseArray(int[] nums){
        int n = nums.length;
        for(int i=0; i<nums.length / 2; i++){
            int temp = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-1-i] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {12, 34, 45, 67, 89};
        System.out.println("The Reversed Array is : " + Arrays.toString(reverseArray(nums)));
    }
}*/

// Maximum Sub Array

/*public class dsaSheet {

    public static int maxSumOfArray(int[] arr){
        int sum = arr[0];
        int maxSum = arr[0]; 
        for(int i=1; i<arr.length; i++){
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, -12, -78, 90, 34, -56, 47, -56, 95, 03, 82};
        System.out.println(maxSumOfArray(arr));
    }
}*/

// Array contains duplicates or not

/*import java.util.HashSet;
public class dsaSheet {

    public static boolean containsDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {12, 23, 45, 56};
        System.out.println(containsDuplicates(nums));
    }
}*/

import java.lang.StringBuilder;
public class dsaSheet {

    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        String str = Integer.toBinaryString(n);
        for(char ch : str.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=count; i++){
            sb.append('1');
        }
        String s = sb.toString();
        int intu = Integer.parseInt(s, 2);
        System.out.println(intu);
    }
}
