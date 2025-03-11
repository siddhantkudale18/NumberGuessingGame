public class parkingSlot {

    public static int noOfCarsPark(char[] arr){
        int count = 1;
        int totalCount = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == 's'){
                count++;
            }
            else if((arr[i] != arr[i+1]) && count > 1){
                totalCount += count;
                count = 1;
            }
        }
        return totalCount;
    }
    public static void main(String[] args) {
        char[] arr = {'s','x','x','s','s','s','s','x','x','s','s'};
        System.out.println(noOfCarsPark(arr));
    }
}
