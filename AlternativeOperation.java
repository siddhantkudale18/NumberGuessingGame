public class AlternativeOperation {

    public static int finalSum(int[] seq){
        int n = seq.length;
        int sum = seq[0];
        for(int i=1; i<=n; i+=2){
            sum += seq[i];
            sum -= seq[i+1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] seq = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(finalSum(seq));
    }
}