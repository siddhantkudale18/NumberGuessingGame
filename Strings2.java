// Write a function to reverse a string.

// import java.util.*;
// public class Strings2{

//     public static String reverseString(String str){
//        char charArray[] = str.toCharArray();
//        int first = 0;
//        int last = charArray.length - 1;

//        while(first < last){
//         char temp = charArray[first];
//         charArray[first] = charArray[last];
//         charArray[last] = temp;
//         first++;
//         last--;
//        }

//        return new String(charArray);
//     }
//     public static void main(String[] args) {
//         String str = "Siddhant Kudale !";
//         System.out.println(reverseString(str));
//     }
// }

// Write a function to check if a string is a palindrome.

// import java.util.*;
// public class Strings2{

//     public static boolean checkPaledrom(String str){

//         char charArray[] = str.toCharArray();
//         int first = 0;
//         int last = charArray.length - 1;

//         while(first < last){
//             char temp = charArray[first];
//             charArray[first] = charArray[last];
//             charArray[last] = temp;
//             first++;
//             last--;
//         }
        
//         String str1 = new String(charArray);

//         if(str1.equals(str)){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String str = "asdffds";
//         System.out.println(checkPaledrom(str));
//     }
// }

// Write a function to count the number of vowels in a string

// import java.util.*;
// public class Strings2{

//     public static int numberOfVowels(String str){
//         str = str.toLowerCase();
//         char charArray[] = str.toCharArray();
//         int n = charArray.length;
//         int count = 0;
//         for(int i=0; i<n; i++){
//             if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         String str = "IMy name is Siddhant Nitin Kudale";
//         System.out.println(numberOfVowels(str));
//     }
// }

// Write a function to check if two strings are anagrams of each other

// import java.util.*;
// public class Strings2{

//     public static boolean areAnagrams(String str1, String str2){

//         str1 = str1.replaceAll("//s", "").toLowerCase();
//         str2 = str2.replaceAll("//s", "").toLowerCase();

//         if(str1.length() != str2.length()){
//             return false;
//         }

//         char charArray1[] = str1.toCharArray();
//         char charArray2[] = str2.toCharArray();

//         Arrays.sort(charArray1);
//         Arrays.sort(charArray2);

//         return Arrays.equals(charArray1, charArray2);
//     }
//     public static void main(String[] args) {
//         String str1 = "listen";
//         String str2 = "ilent";
//         if(areAnagrams(str1, str2)){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
// }

// Write a function to find the first non-repeated character in a string

// import java.util.*;
// public class Strings2{

//     public static char nonRepeatedChar(String str){
//         int charCount[] = new int[256];

//         return ' ';
//     }
//     public static void main(String[] args) {
//         String str = "abcdabcde";
//         char ch = nonRepeatedChar(str);
//         if(ch != ' '){
//             System.out.println(ch);
//         }
//         else{
//             System.out.println("No repeated char");
//         }
//     }
// }
// (Incomplet Code)

// Write a function to remove duplicate characters from a string

/*import java.util.HashSet;
public class Strings2{

    public static String removeDuplicates(String str){
        HashSet<Character> seen = new HashSet();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(!seen.contains(currentChar)){
                result.append(currentChar);
                seen.add(currentChar);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "asdfasdfg";
        System.out.println(removeDuplicates(str));
    }
}*/

// import java.lang.StringBuilder;
// public class Strings2 {

//     public static void main(String[] args) {
//         String str = "siddhant";
//         int n = str.length();
//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i<n/2; i++){
//             sb.append(str.charAt(i));
//             sb.append(str.charAt((n/2) + i));
//         }
//         System.out.println(sb.toString());
//     }
// }

//  Given a string str, a character ch1, and a character ch2, replace all 
//  occurrences of ch1 in str with ch2 and vice versa
import java.lang.StringBuilder;
public class Strings2 {

    public static String replaceTheChar(String str, char ch1, char ch2){
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == ch1){
                sb.append(ch2);
            }
            else if(ch == ch2){
                sb.append(ch1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "siddhant";
        char ch1 = 'd';
        char ch2 = 'n';
        System.out.println(replaceTheChar(str, ch1, ch2));
    }
}
