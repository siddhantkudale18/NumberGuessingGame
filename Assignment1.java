// A student is in class 11th and there are 12 divisions of the class which
// data type is feasible to print the class and divisions. (Write a  java code to
// print the class and division).

// public class Assignment1 {
//     public static void main(String[] args) {

//         int classNumber = 11;
//         int divisionNumber = 12;

//         String arr[] = new String[divisionNumber];

//         for(int i=0; i<divisionNumber; i++){
//             arr[i] = "Division " + (i+1);
//         }

//         System.out.println("Class : " + classNumber);
//         for(String divi : arr){
//             System.out.println("Division : " + divi);
//         }
//     }
// }

// scientist is working on his research and wants to find an area using
// pi. (Write a code to print the value of pi angle of triangle).Scientists are
// also eager to print the highest degree of angle of circle(360 degree).

// public class Assignment1{
//     public static void main(String[] str){

//         final double PI = Math.PI;

//         double radius = 7.0;

//         double area = PI*radius*radius;

//         final double MAX_DEGREE = 360.0;

//         System.out.println("Value of Pi is : " + PI);
//         System.out.println("Area of the Circle is having Radius " + radius + " is : " + area);
//         System.out.println("The highest degree of angle of circle is : " + MAX_DEGREE);
//     }
// }

// Write a java program to print the percentage and grade of a student.

// import java.util.Scanner;
// public class Assignment1{
//     public static void main(String[] str){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Marks of Maths : ");
//         double mathMarks = sc.nextDouble();
//         System.out.print("Enter marks of Physics : ");
//         double phyMarks = sc.nextDouble();
//         System.out.print("Enter Marks of Chemistry : ");
//         double chemMarks = sc.nextDouble();

//         double totalMarks = mathMarks+phyMarks+chemMarks;
//         System.out.println("Total Marks : " + totalMarks);
//         double totalPercentage = totalMarks/3.0;
//         System.out.println("Total Percentage : " + totalPercentage);
        
//     }
// }

// Write a code for a real time example in which we can use 5 different data types

/*import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String str = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter Weight : ");
        float ft = sc.nextFloat();
        System.out.print("Enter Balance : ");
        double db = sc.nextDouble();

        System.out.println(str +" "+ age +" "+ ft +" "+ db);
    }
}*/

// Write a program to perform basic arithmetic operations on two numbers.

/*import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter a Number 2 : ");
        int b = sc.nextInt();

        System.out.println("Addition : " + (a+b));
        System.out.println("Substraction : " + (a-b));
        System.out.println("Multiplection : " + (a*b));
        System.out.println("Division : " + (a/b));
    }
}*/

// Write a program to compare two numbers using relational operators.

/*public class Assignment1{

    public static void compareNumbers(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " > " + secondNumber + " : " + (firstNumber > secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + " : " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + " : " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + " <= " + secondNumber + " : " + (firstNumber <= secondNumber));
        System.out.println(firstNumber + " == " + secondNumber + " : " + (firstNumber == secondNumber));
        System.out.println(firstNumber + " != " + secondNumber + " : " + (firstNumber != secondNumber));
    }
    public static void main(String[] args) {
        int firstNumber = 7;
        int secondNumber = 5;
        compareNumbers(firstNumber, secondNumber);
    }
}*/

// Write a program to demonstrate logical operators.

/*import java.util.*;
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Boolean Value : ");
        boolean firstBoolean = sc.nextBoolean();
        System.out.println("Enter Second Boolean Value : ");
        boolean secondBoolean = sc.nextBoolean();

        boolean andOperation = firstBoolean && secondBoolean;
        boolean orOperantion = firstBoolean || secondBoolean;
        boolean notOfFirst = !firstBoolean;
        boolean notOfSecond = !secondBoolean;

        System.out.println(firstBoolean + " & " + secondBoolean + " = " + andOperation);
        System.out.println(firstBoolean + " | " + secondBoolean + " = " + orOperantion);
        System.out.println("! " + firstBoolean + " = " + notOfFirst);
        System.out.println("! " + secondBoolean + " = " + notOfSecond);
    }
}*/

// Write a program to perform bitwise operations on two integers

/*import java.util.*;
public class Assignment1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int bitwiseAND = a & b;
        int bitwiseOR = a | b;
        int bitwiseXOR = a ^ b;  // same bit = 0 and dif bit = 1
        int bitwiseLeft = a << 2;
        int bitwiseRight = b >> 1;

        System.out.println("Bitwise AND : " + bitwiseAND);
        System.out.println("Bitwise OR : " + bitwiseOR);
        System.out.println("Bitwise XOR : " + bitwiseXOR);
        System.out.println("Bitwise left shift : " + bitwiseLeft);
        System.out.println("Bitwise right shift : " + bitwiseRight);
    }
}*/

// Write a program to demonstrate various assignment operators.

/*import java.util.*;
public class Assignment1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Operand : ");
        int a = sc.nextInt(); 
        System.out.print("Enter Second Operand : ");
        int b = sc.nextInt();

        a += 3; 
        System.out.println(a); 
        b -= 2;
        System.out.println(b);
        a *= 2;
        System.out.println(a);
        b /= 2;
        System.out.println(b);
        a %= 5;
        System.out.println(a);
    }
}*/

// Write a program to check whether the given Character is in UPPERCASE  or in lowercase

/*import java.util.Scanner;
public class Assignment1{

    static void toCheck(char ch){
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Character is lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Character is uppercase");
        }
        else{
            System.out.println("Not a alphabate");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        toCheck(ch);
    }
}*/

// Write a program to check the day number(1-7) and print the corresponding day of week

/*import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch (n){
            case 1 : System.out.println("Sunday");
            case 2 : System.out.println("Monday");
            case 3 : System.out.println("Tuesday");
            case 4 : System.out.println("Wednesday");
            case 5 : System.out.println("Thursday");
            case 6 : System.out.println("Friday");
            case 7 : System.out.println("Saturday");
            default : System.out.println("Wrong Input");
        }
    }
}*/

// Write a program to check whether the given character is a vowel or consonant.

/*import java.util.Scanner;
public class Assignment1{

    static void toCheck(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Is ovel");
        }
        else{
            System.out.println("Not Ovel");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        if(ch >= 'A' && ch <= 'Z' || ch >='a' && ch <= 'z'){
            char ch1 = Character.toLowerCase(ch);
            toCheck(ch1);
        }
        else{
            System.out.println("Not alphabate");
        }
        
    }
}*/

import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(isAlphabet(ch)){
            if(isOvel(ch)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    public static boolean isAlphabet(char ch){
        
            return ch >= 'a' && ch<= 'z';
        
    }
    public static boolean isOvel(char ch){
        
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        
    }
}