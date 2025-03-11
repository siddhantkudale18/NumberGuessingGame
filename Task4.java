
/*                     S T R I N G S   P A R T - 2


                       B I N A R Y   s T R I N G S
*/

// Check if all bits can be made same by single flip
/*public class Task4 {

    public static boolean toCheck(String str){
        int one = 0;
        int zero = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '1'){
                one++;
            }
            else if(ch == '0'){
                zero++;
            }
        }
        if(one == 1 || zero == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "11011";
        System.out.println(toCheck(str) ? "Yes" : "No");
    }
}*/

// Minimum number of flips required for alternative binary
/*public class Task4 {

    public static void numberOfFlips(String str){
        int count1 = 0;
        int count2 = 0;
        int n = str.length();
        for(int i=0; i<n; i++){
            char firstChar = (i % 2 == 0) ? '0' : '1';
            char secondChar = (i % 2 == 0) ? '1' : '0';
            if(str.charAt(i) != firstChar){
                count1++;
            }
            if(str.charAt(i) != secondChar){
                count2++;
            }
        }
        int count = Math.min(count1, count2);
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "00001010111111";
        numberOfFlips(str);
    }
}*/

// Binary representation of next number
/*public class Task4 {

    public static String nextNumber(String str){
        int number = Integer.parseInt(str, 2);
        int nextNumberr = number + 1;
        String str2 = Integer.toBinaryString(nextNumberr);
        return str2;
    }

    public static void main(String[] args) {
        String str = "1101";
        System.out.println(nextNumber(str));
    }
}*/

// Java program to find min flips in binary
// string to make all characters equal
/*public class Task4 {

    public static int minFlips(String str){
        int n = str.length();
        char last = ' ';
        int temp = 0;
        for(int i=0; i<n; i++){
            if(last != str.charAt(i)){
                temp++;
            }
            last = str.charAt(i);
        }
        return temp/2;
    }

    public static void main(String[] args) {
        String str = "1110001100011";
        System.out.println(minFlips(str));
    }
}*/





/*                  S T R I N G S   P A R T - 3



            S U B S T R I N G S  &  S U B S E Q U E N C E S
*/

// Program to print all substrings of a given string Using 2 for loops
/*public class Task4 {

    public static void subStrings(String str){
        int n = str.length();
        
        for(int i=0; i<n; i++){
            String subStr = "";
            for(int j=i; j<n; j++){
                subStr += str.charAt(j);
                System.out.println(subStr+"\n");
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        subStrings(str);
    }
}*/

// Using another method  TimeComplexity --> O(n^3)
/*public class Task4 {

    public static void subString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        subString(str);
    }
}*/

// Naive Pattern Searching algorithm
/*public class Task4 {

    public static void findPattern(String str, String pat){
        int n = str.length();
        int m = pat.length();

        for(int i=0; i<=n-m; i++){
            int j;

            for(j=0; j<m; j++){
                if(str.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }

            if(j == m){
                System.out.println("Pat found at index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabaladlhfaabakjadaaba";
        String pat = "aaba";
        findPattern(str, pat);
    }
}*/






/*                 S T R I N G S   P A R T - 4


                   B A S I C S  P R O B L E M S
*/

// Write a function to reverse a string. Method 1
/*public class Task4 {
    public static String reverseString(String str){
        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverseString(str));
    }
}*/

// Write a function to reverse a string Method 2
/*import java.lang.StringBuilder;
public class Task4 {

    public static void main(String[] args) {
        String str = "abcdef";
        StringBuilder st = new StringBuilder();
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            st.append(str.charAt(i));
        }
        System.out.println(st);
    }
}*/

// Write a function to check if a string is a palindrome
/*public class Task4 {
    public static void checkPalindrome(String str){
        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        String ans = new String(arr);
        
        if(str.equals(ans)){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is not palindrome");
        }
    }

    public static void main(String[] args) {
        String str = "abcdedcba";
        checkPalindrome(str);
    }
}*/

// Write a function to count the number of vowels in a string
/*public class Task4 {
    public static int countVowels(String str){
        int count = 0;
        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||  arr[i] == 'o' || arr[i] == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(countVowels(str));
    }
}*/

// Write a function to check if two strings are anagrams of each other
/*import java.util.Arrays;
public class Task4 {
    public static String anagrams(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1 != n2){
            return "Not anagrams";
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<n1; i++){
            if(arr1[i] != arr2[i]){
                return "Not anagrams";
            }
        }
        return "Are anagrams";
    }

    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cat";
        System.out.println(anagrams(str1, str2));
    }
}*/

// Write a function to find the first non-repeated character in a string
// Time Complexity --> O(n^2)
/*public class Task4 {

    public static char firstNonRepeated(String str){
        char arr[] = str.toCharArray();
        int n = arr.length;
        char ch = '\0';
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(count > 1){
                    break;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return ch; 
    }

    public static void main(String[] args) {
        String str = "abcdabce";
        System.out.println(firstNonRepeated(str));
    }
}*/

// Another Method with Time Complexity --> O(n)
/*public class Task4 {

    public static void firstNonRepeated(String str){
        int[] countChar = new int[256];
        int n = str.length();
        for(int i=0; i<n; i++){
            countChar[str.charAt(i)]++;
        } 
        for(int i=0; i<n; i++){
            if(countChar[str.charAt(i)] == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcdabce";
        firstNonRepeated(str);
    }
}*/

// Write a function to remove duplicate characters from a string
/*import java.lang.StringBuilder;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {

    public static void nonRepeated(String str, int n){
        Set<Character> set = new LinkedHashSet();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }
        sb.toString();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "abcdab";
        int n = str.length();
        nonRepeated(str, n);
    }
}*/

// Write a function to check if a string contains only digits
/*public class Task4 {

    public static boolean onlyDigits(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123456";
        boolean bl = onlyDigits(str);
        if(bl){
            System.out.println("String contains only digits");
        }
        else{
            System.out.println("String do not contains only digits");
        }
    }
}*/

// Write a function to convert a string to title case.
    public class Task4 {

    public static String toTitlecase(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean bl = true;
        for(char ch : str.toCharArray()){
            if(Character.isSpaceChar(ch)){
                bl = true;
                sb.append(ch);
            }
            else if(bl){
                sb.append(Character.toTitleCase(ch));
                bl = false;
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        String op = sb.toString();
        return op;
    }

    public static void main(String[] args) {
        String str = "siddhant nitin kudale";
        
        System.out.println(toTitlecase(str));
    }
}
