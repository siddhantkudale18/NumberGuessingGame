public class compareStrings {

    public static int checkGreater(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1 > n2){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str1 = "siddhant";
        String str2 = "kudale";
        System.out.println(checkGreater(str1, str2));
    }
}
