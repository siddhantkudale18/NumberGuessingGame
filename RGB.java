public class RGB {

    public static int findPosition(String str, String opr){
        int ind = 0;
        for(int i=0; i<opr.length(); i++){
            if(opr.charAt(i) == str.charAt(ind)){
                ind++;
            }
        }
        return ind+1;
    }
    public static void main(String[] args) {
        String str = "BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB";
        String opr = "BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB";
        System.out.println(findPosition(str, opr));
    }
}
