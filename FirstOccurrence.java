import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        String inputString = scanner.nextLine();
        
        
        char searchChar = scanner.next().charAt(0);
        
        
        int index = inputString.indexOf(searchChar);
        
        
        if (index != -1) {
            System.out.println(index);
        } 
        
        scanner.close();
    }
}
