import java.util.Scanner;

public class MinimizeCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the arrays
        int N = sc.nextInt();
        
        // Read the arrays A and B
        long[] A = new long[N];
        long[] B = new long[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }

        // Calculate the minimum cost
        long result = findMinCost(A, B, N);
        System.out.println(result);
        
        sc.close();
    }

    public static long findMinCost(long[] A, long[] B, int N) {
        long MOD = 1000000007;
        long minCost = Long.MAX_VALUE;

        // Iterate over all pairs of i and j
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                long cost = Math.abs(A[i] - B[j]);
                if (cost < minCost) {
                    minCost = cost;
                }
            }
        }

        // Return the minimum cost modulo 10^9 + 7
        return minCost % MOD;
    }
}
