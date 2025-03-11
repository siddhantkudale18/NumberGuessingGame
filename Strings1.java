// Reversing the String

// public class Strings1 {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Siddhant");

//         for(int i=0; i<sb.length()/2; i++){
//             int front = i;
//             int last = sb.length() - 1 - i;

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(last);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(last, frontChar);

            
//         }
//         System.out.println(sb);
//     }
// }

// Write a program to check if the letter 'e' is present in the word 

// import java.util.Scanner;
// public class Strings1{
//     public static void main(String[] args) {
//         String s = "Siddhant";
//         boolean ans = false;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i) == 'x'){
//                 ans = true;
//                 break;
//             }
//         }
//         System.out.println(ans);
//     }
// }

// Write a program to check if the word is prefent in sentence

import java.util.*;
public class Strings1{
    public static void main(String[] args) {
        String s = "My name is Siddhant Kudale";
        String a = "Siddhant";
        if(s.contains(a)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}

// Write a program to find the first and the last occurence of the letter 

// import java.util.*;
// public class Strings1{
//     public static void main(String[] args) {
//         String str = "Hello, World!";
//         int n = str.length();
//         int first = Integer.MAX_VALUE;
//         int last = Integer.MIN_VALUE;

//         for(int i=0; i<n; i++){
//             if(str.charAt(i) == 'o'){
//                 first = Math.min(first, i);
//                 last = Math.max(last, i);
//             }
//         }
//         System.out.println(first+" "+last);
//     }
// }

// siddhant nitin kudale -->> S. N. Kudale

// import  java.util.*;
// public class Strings1{
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Name : ");
//     String str = sc.nextLine();
//     String sr = "";
//     sr = sr+str.charAt(0);
//     sr = sr+". ";
//     for(int i=0; i<str.length(); i++){
//         if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ' && i+1<str.length()){
//             sr = (sr+str.charAt(i+1)).toUpperCase();
//             sr = sr+". ";
//         }
//     }
//     String last = "";
//     for(int i=str.length()-1; i>=0; i--){
//         if(str.charAt(i) == ' '){
//             last = str.substring(i+2);
//             break;
//         }
//     }
//     sr = sr.substring(0, sr.length()-2);
//     sr = sr+last;
//     System.out.println(sr);
//    }
// }

// counting number of consonants(aphabets rather than vowels)

// import java.util.*;
// public class Strings1{
//     public static void main(String[] args) {
//         String str = "My name in Siddhant Nitin Kudale";
//         int count = 0;

//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i) == ' ' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                 count++;
//             }
//         }
       
//         System.out.println(str.length()-count);
//     }
// }

// program to delete all consonents from the string 
// "Hello, have a good day

// import java.util.*;
// public class Strings1{
//     public static void main(String[] args) {
//         String input = "Hello, have a good day";
//         String result = remove(input);
//         System.out.println(result);
//     }

//     public static String remove(String str){
//         StringBuilder result = new StringBuilder();
//         for(int i=0; i<str.length(); i++){
//             char ch = Character.toLowerCase(str.charAt(i));
//             if(!isConsonant(ch)){
//                 result.append(str.charAt(i));
//             }
//         }
//         return result.toString();
//     }

//     public static boolean isConsonant(char ch){
//         return Character.isLetter(ch) && !isVowel(ch);
//     }

//     public static boolean isVowel(char ch){
//         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//     }
// }

// Input a string of alphabets. Find out the number of occurrence of all alphabets
//  in that string. Find out the alphabet with maximum occurrence.

// import java.util.*;
// public class Strings1{
//     public static void main(String[] args) {
//         String str = "My namde is Siddhant";
//        int n = str.length();
//        int count = 0;
//        String str1 = "";
//       for(int i=0; i<n; i++){
//         if(Character.isLetter(str.charAt(i))){
//             count++;
//         }
//       }
//       System.out.println(count);
//     }
// }

// Check if a given string is a Palindrome

// import java.util.*;
// class Strings1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.nextLine();
//     boolean ans = true;
//     for(int i=0; i<(str.length())/2; i++){
//       if(str.charAt(i) != str.charAt(str.length()-1-i)){
//         ans = false;
//         break;
//       }
//       System.out.println(ans);
//     }
//   }
// }

// Find out the largest and smallest word in the string

// import java.util.*;
// public class Strings1{
//   public static void main(String[] args) {
//     String str = "This is an umnrella";
//     char chSmall = 'z';
//     char chBig = 'a';
//     for(int i=0; i<str.length()-1; i++){
//       char ch1 = Character.toLowerCase(str.charAt(i));
      
//       if(Character.isLetter(ch1) && ch1 < chSmall){
//         chSmall = ch1;
//       }
//       if(Character.isLetter(ch1) && ch1 > chBig){
//         chBig = ch1;
//       }
//     }
//     System.out.println(chSmall);
//     System.out.println(chBig);
//   }
// }