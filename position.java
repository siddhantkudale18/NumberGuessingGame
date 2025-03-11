import java.lang.StringBuilder;
public class position {

    public static char findNumber(int n) {
        int i = 1;
        StringBuilder z = new StringBuilder();        
        while (i <= n) {
            z.append(i);
            i++;
        }
        String str = z.toString();
        // System.out.println(z.toString());         
        return str.charAt(n - 1);    }
    
    public static void main(String[] args) {
        System.out.println(findNumber(12));
    }
}
