public class conversions {
    public static void main(String[] args) {
        
        // int to double
        int a = 5; 
        double b = a;
        System.out.println(b);

        // double to int
        double c = 5.66;
        int d = (int)c;
        System.out.println(d);

        // int to long      -->   automatically
        // int to float     -->   automatically
        // long to int      -->   similar to double to int
        // float to int     -->   similar to double to int

        // int to char
        int e = 65;
        char f = (char)e;
        System.out.println(f);

        // char to int
        char g = 'A';
        int h = g;
        System.out.println(h);

        // String to int
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // int to String
        int num1 = 123;
        String str1 = String.valueOf(num1);
        System.out.println(str1);
        String str2 = Integer.toString(num1);
        System.out.println(str2);

        // double to String    -->    similar to int to String
        // String to double    -->    similar to String to int
    }
}
