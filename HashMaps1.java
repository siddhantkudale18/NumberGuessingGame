/*import java.util.*;
class HashMaps1{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);
        System.out.println(map);
        map.remove("China");
        System.out.println(map);
    }
}*/

// Find the SubArray in the with the given sum

import java.util.HashMap;
public class HashMaps1 {

    public static void subArray(int[] nums, int sum){
        int curSum = 0, start = 0, end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            curSum += nums[i];
            if(curSum - sum == 0){
                start = 0; end = i; break;
            }
            else if(map.containsKey(curSum-sum)){
                start = map.get(curSum-sum) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        System.out.println(start + " " + end);
    }

    public static void main(String[] args) {
        int[] nums = {10, 15, -5, 15, -10, 5};
        int sum = 5;
        subArray(nums, sum);
    }
}