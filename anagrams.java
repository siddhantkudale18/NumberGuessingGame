import java.util.Arrays;
public class anagrams {

    public static String checkAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            return "No";
        }
        else{
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return "No";
                }
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        String str1 = "liste";
        String str2 = "Slient";
        System.out.println(checkAnagrams(str1, str2));
    }
}
