public class oneTowTenPattern {
    public static void main(String[] args) {
        int c = 1;
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c++ + " ");
                if(c == 11){
                    break;
                }
            }
            System.out.println();
        }
    }
}
