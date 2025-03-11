public class equiliburimx {

    public static int findPoint(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int lSum = arr[0];
        int rSum = arr[n-1];
        while(left<right){
            if((lSum == rSum) && (left+1 == right-1)){
                return left+1;
            }
            else if(lSum >= rSum){
                right--;
                rSum += arr[right];
                
            }
            else if(rSum >= lSum){
                left++;
                lSum += arr[left];
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 9, 10};
        System.out.println(findPoint(arr));
    }
}
