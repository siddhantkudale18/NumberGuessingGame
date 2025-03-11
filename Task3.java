//                    S T R I N G S   P A R T - 1

// String defination and printing
// public class Task3 {
//    public static void main(String[] args) {
//     String str = "Siddhant Kudale";
//     System.out.println(str);
//     String str1 = new String("Siddhant Nitin Kudale");
//     System.out.println(str1);
//    }
// }


// String concatenation without using any inbuilt methods
// public class Task3 {

//     public static void main(String[] args) {
//         String str1 = "Siddhant";
//         String str2 = " Kudale";
//         String str3 = concateString(str1, str2);
//         System.out.println(str3);
//     }
//     public static String concateString(String str1, String str2){
//         int l1 = str1.length();
//         int l2 = str2.length();
//         char result[] = new char[l1 + l2];
//         for(int i=0; i<l1; i++){
//             result[i] = str1.charAt(i);
//         }
//         for(int i=0;  i<l2; i++){
//             result[l1 + i] = str2.charAt(i);
//         }
//         return new String(result);
//     }
// }

// String concatation using in build method
/*public class Task3 {

    public static void main(String[] args) {

        String str1 = "Siddhant";
        String str2 = str1.concat(" Kudale");
        System.out.println(str2);

        String str3 = "Siddhant";
        String str4 = " Kudale";
        System.out.println(str3.concat(str4));
        System.out.println(str4.concat(str3));
    }
}*/

// String Concatation using '+' operator
// public class Task3 {

//     public static void main(String[] args) {

//         String str1 = "Siddhant";
//         String str2 = "Kudale";

//         String str3 = str1 + str2;
//         String str4 = str2 + str1;

//         System.out.println(str3);
//         System.out.println(str4);
//     }
// }

// Difference between 'concat()' and '+' operator
// public class Task3 {

//     public static void main(String[] args) {
//         String str1 = "Siddhant";
//         String str2 = "";
//         String str3 = str1.concat(str2);
//         String str4 = str1 + str2;
//         if(str1 == str3){
//             System.out.println("concat() is equal");
//         }
//         else{
//             System.out.println("concat() is not equal");
//         }
//         if(str1 == str4){
//             System.out.println("+ is equal");
//         }
//         else{
//             System.out.println("+ is not equal");
//         }
//     }
// }

// Finding a character in the string
// public class Task3 {

//     public static void main(String[] args) {

//         String str = "Hello, World";
//         char ch = 'W';
//         int x = findCharacter(str, ch);

//         if(x != -1){
//             System.out.println("Index of " + ch + " is at " + x);
//         }
//         else{
//             System.out.println("Index of " + ch + " not found");
//         }

//     }
//     public static int findCharacter(String str, char ch){
//         int l = str.length();
//         for(int i=0; i<l; i++){
//             if(str.charAt(i) == ch){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

// Finding a sub string in the string
// public class Task3 {

//     public static void main(String[] args) {

//       String str1 = "Siddhant";
//       String str2 = "ant";
//       boolean answer = findSubString(str1, str2);

//       if(answer){
//         System.out.println(str2 + " is the part of the " + str1);
//       }
//       else{
//         System.out.println(str2 + " is not part of the " + str1);
//       }
//     }

//     public static boolean findSubString(String str1, String str2){
//         int n1 = str1.length();
//         int n2 = str2.length();
//         for(int i=0; i<=n1-n2; i++){
//             int j;
//             for(j=0; j<n2; j++){
//                 if(str1.charAt(i+j) != str2.charAt(j)){
//                     break;
//                 }
//             }
//             if(j == n2){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// Same code using inbuilt method
// public class Task3 {

//     public static boolean toSearch(String str, String str1){
//         return str.contains(str1);
//     }

//     public static void main(String[] args) {
//         String str = "Siddhant", str1 = "ant";
//         boolean bl = toSearch(str, str1);
//         System.out.println(bl);
//     }
// }

// Program to find character in the String
// public class Task3 {


//     public static void main(String[] args) {

//         String str = "GeeksforGeeks is a computer science portal";

//         int firstIndex = str.indexOf('s');
//         System.out.println("First index of s is : " + firstIndex);

//         int lastIndex = str.lastIndexOf('s');
//         System.out.println("Last index of s is : " + lastIndex);

//         int firstIn = str.indexOf('s', 10);
//         System.out.println("First occur of s after index 10 : " + firstIn);

//         int lastIn = str.lastIndexOf('s', 20);
//         System.out.println(lastIn);

//         char ch = str.charAt(20);
//         System.out.println("Character at index 20 is : " + ch);
//     }
// }

// Program to find substring in the String
// public class Task3 {

//     public static void main(String[] args) {
//         String str = "GeeksforGeeks is a computer science portal";

//         int firstIndex = str.indexOf("Geeks");
//         System.out.println("First index of Geeks : " + firstIndex);

//         int lastIndex = str.lastIndexOf("Geeks");
//         System.out.println("Last index of Geeks : " + lastIndex);

//         int firstIn = str.indexOf("Geeks", 10);
//         System.out.println("First occurance of Geeks after index 10 : " + firstIn);

//         int lastIn = str.lastIndexOf("Geeks", 20);
//         System.out.println("Last occurance of Geeks after index 20 : " + lastIn);
//     }
// }

// Java Program to Illustrate How to Find a Substring
// public class Task3 {

//     public static void main(String[] args) {
//         String str = "software";
//         CharSequence seq = "soft";
//         CharSequence se = "war";
//         CharSequence s = "wr";
//         boolean a = str.contains(seq);
//         boolean b = str.contains(se);
//         boolean c = str.contains(s);
//         System.out.println("soft present in software: " + a);
//         System.out.println("war presesnt in software: " + b);
//         System.out.println("wr present in software: " + c);
//     }
// }

// Java Program to Match ofstart and endof a Substring
// public class Task3 {

//     public static void main(String[] args) {
//         String str = "GeeksforGeeks is a computer science portal";
//         System.out.println(str.startsWith("Geek"));
//         System.out.println(str.startsWith("is", 14));
//         System.out.println(str.endsWith("al"));
//     }
// }

// Reverse String using a for Loop:
// public class Task3 {

//     public static String reverseString(String str){

//         StringBuilder reverseStr = new StringBuilder();
//         for(int i=str.length()-1; i>=0; i--){
//             reverseStr.append(str.charAt(i));
//         }
//         return reverseStr.toString();
//     }

//     public static void main(String[] args) {
//         String str = "Siddhant Kudale";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }

// Using another method
public class Task3 {

    public static void main(String[] args) {
        String str = "siddhant";
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        System.out.println(str1);
    }
}

// Java program to reverse a string using StringBuffer class 
/*import java.util.Scanner;
public class Task3 {

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("The reverse String is : " + reverseString(str));
    }
}*/

// Recursive Java program to reverse a string
/*public class Task3 {

    public static void reverseString(char ch[], int i){
        int n = ch.length;
        if(i == n/2){
            return;
        }
        swap(ch, i, n-i-1);
        reverseString(ch, i+1);

    }
    public static void swap(char ch[], int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String str = "a b c d";
        char ch[] = str.toCharArray();
        reverseString(ch, 0);
        System.out.println(String.valueOf(ch));
    }
}*/

// A Simple Iterative Java program to reverse a String
/*public class Task3 {


    public static void reverseString(String str){
        int n = str.length();
        char ch[] = str.toCharArray();
        char temp;
        for(int i=0, j=n-1; i<j; i++, j--){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        ch.toString();
        System.out.print(ch);
    }

    public static void main(String[] args) {
        
        String str = "a b c d";
        reverseString(str);
    }
}*/

// Java program for Left Rotation
/*public class Task3 {

    public static void leftRotate(String str, int d){
        String ans = str.substring(d) + str.substring(0, d);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        leftRotate(str, 2);
    }
}*/

// Java program for Right rotation
/*public class Task3 {

    public static void rightRotate(String str, int d){
        int n = str.length();
        String ans = str.substring(n-d, n) + str.substring(0, n-d);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        rightRotate(str, 2);
    }
}*/

// Java program for Left Rotation 
/*public class Task3 {

    public static void leftRotate(String str, int n){
        int l = str.length();
        String temp = str + str;
        String ans = temp.substring(n, n+l);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "abcde";
        leftRotate(str, 2);
    }
}*/

// Java program for Right Rotation
/*public class Task3 {

    public static void rightRotate(String str, int n){
        int l = str.length();
        String temp = str + str;
        String ans = temp.substring(l-n, l+n+1);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "abcde";
        rightRotate(str, 2);
    }
}*/

// Java program for Left Rotation
/*public class Task3 {
    public static void leftRotate(char ch[], int d){
        int n = ch.length;
        for(int i=0; i<d; i++){
            char temp = ch[0];
            for(int j=0; j<n-1; j++){
                ch[j] = ch[j+1];
            }
            ch[n-1] = temp;

        }
        ch.toString();
        System.out.println(ch);
    }

    public static void main(String[] args) {
        String str = "abcde";
        char ch[] = str.toCharArray();
        leftRotate(ch, 2);
    }
}*/

// Java program to sort a string of characters using inbuilt method
/*import java.util.Arrays;
public class Task3 {

    public static void sortString(String str){
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        sortString("siddhant");
    }
}*/

// Sorting a string Without using inbuilt method
/*public class Task3 {

    public static void sortString(String str){
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        String str = "xaybzc";
        sortString(str);

    }
}*/

// How to insert characters in a string at a certain position
/*public class Task3 {
    public static String toInsert(String str, int arr[]){
        int j = 0;
        String ans = "";
        int n = str.length();
        for(int i=0; i<n; i++){
            if(j < arr.length && i == arr[j]){
                ans += "*";
                j++;
            }
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "siddhant";
        int arr[] = {1,3,5};
        System.out.println(toInsert(str, arr));
    }
}*/

// Program to check if two strings are same or not
/*public class Task3 {
    public static boolean sameOrNot(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        if(n != m){
            return false;
        }
        for(int i=0, j=0; i<n && j<m; i++, j++){
            if(str1.charAt(i) != str2.charAt(j)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str1 = "sidhant";
        String str2 = "siddhant";
        boolean b = sameOrNot(str1, str2);
        if(b){
            System.out.println("Strings are Same.");
        }
        else{
            System.out.println("Strings are not Same.");
        }
    }
}*/

// using inbuilt method
/*public class Task3 {

    public static void main(String[] args) {
        String str1 = "sid";
        String str2 = "sid";
        if(str1.equals(str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}*/

