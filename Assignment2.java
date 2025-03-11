// Write a program to print the character for ASCII value in range 90 - 65

/*public class Assignment2 {
    public static void main(String[] args) {
        for(int ascii = 90; ascii >= 65; ascii--){
            char ch = (char)ascii;
            System.out.print(ch + " ");
        }
    }
}*/

// Write a program to print the numbers divisible by 5 in the range 50 - 10.

/*public class Assignment2 {
    public static void main(String[] args) {
        for(int i=50; i>=10; i--){
            if(i%5 == 0){
                System.out.println(i);
            }
        }
    }
}*/

// Write a program to print the only consonant alphabets from A to Z

/*public class Assignment2 {

    public static void main(String[] args) {
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                System.out.print(ch + " ");
            }
        }
    }
   
}*/

// Write a program where you have to print sum of integer from 90 to 11
 /*public class Assignment2 {
 
    public static void main(String[] args) {
        int count = 0;
        for(int i=90; i>=11; i--){
            count = count + i;
        }
        System.out.println(count);
    }
 }*/

 // Write a program to print the sum of odd numbers from 150 to 101

 /*public class Assignment2 {
 
    public static void main(String[] args) {
        int sum = 0;
        for(int i=150; i>=101; i--){
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
 }*/

// Write a program to print Remarks according to their respective grades.

/*import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine().toUpperCase();
        String remark;

        switch (grade){
            case "O" : remark = "Out-Standing";
            break;
            case "A" : remark = "Excellent";
            break;
            case "B" : remark = "Best";
            break;
            case "C" : remark = "Better";
            break;
            case "D" : remark = "Good";
            break;
            case "E" : remark = "Bad";
            break;
            case "F" : remark = "Fail";
            break;
            default : remark = "Invalid Input";

            
        }
        System.out.println(remark);
    }
}*/

// Write a program to print longform of cloth sizes according to their acronym

/*import java.util.Scanner;
public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String longForm;
        switch (str) {
            case "S" : longForm = "Small";
            break;
            case "M" : longForm = "Medium";
            break;
            case "L" : longForm = "Large";
            break;
            case "Xl" : longForm = "Very Large";
            break;
            case "XXL" : longForm = "2Very Large";
            break;
            default : longForm = "Wrong Input";
            break;
        }
        System.out.println(longForm);
    }
}*/

// Write a program that takes a number from 0 to 5 and print its spelling

/*import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        switch(n){
            case 1 : str = "One";
            break;
            case 2 : str = "Two";
            break;
            case 3 : str = "Three";
            break; 
            case 4 : str = "Four";
            break;
            case 5 : str = "Five";
            break;
            default : str = "Number is greater than 5";

        }
        System.out.println(str);
    }
}*/

// Write a program in which takes two numbers if both the numbers are positive
// multiply them and provide to switch case to verify whether the number is even or
// odd, if the user enters any negative number program should terminate by saying
// “Sorry negative numbers not allowed”

/*import java.util.Scanner;
public class Assignment2 {

    public static void theMethod(int num1, int num2){
        if(num1 > 0 && num2 > 0){
            int num3 = num1 * num2;
            switch (num3 % 2){
                case 0 : System.out.println("Even"); 
                break;
                case 1 : System.out.println("Odd");
            }
        }
        else{
            System.out.println("Negative Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        theMethod(num1, num2);
    }
}*/
