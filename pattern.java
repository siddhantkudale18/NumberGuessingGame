import java.util.Scanner;
public class pattern {

    // X pattern

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i==j || j==n-i-1){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // Z pattern

    // public static void main(String[] args) {
    //     int n = 10;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i == 0 || i == n-1 || j == n-1-i){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    

    // Hallow Rectangle

    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i==0 || i==n-1 || j==0 || j==n-1){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // C pattern

    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i == 0 || i == n-1 || j == 0){
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // Triangle pattern

    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n-i-1; j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0; j<(2*i)+1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Right angled triangle of 0s and 1s

    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<=i; j++){
    //             if((i+j)%2 == 0){
    //                 System.out.print("1");
    //             }
    //             else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
