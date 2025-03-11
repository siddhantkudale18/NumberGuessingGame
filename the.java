import java.util.HashSet;
import java.util.Set;

public class LexicographicalStrings {

    public static void main(String[] args) {
        String L = "abcd";
        String R = "abef";
        System.out.println(countValidStrings(L, R));
    }

    public static int countValidStrings(String L, String R) {
        int N = L.length();
        Set<String> validStrings = new HashSet<>();

        // Generate all possible strings S of length N
        generateStrings(L, R, "", 0, N, validStrings);

        // Filter out strings where bitwise AND of character occurrences is not zero
        return (int) validStrings.stream().filter(LexicographicalStrings::isBitwiseAndZero).count();
    }

    private static void generateStrings(String L, String R, String current, int index, int N, Set<String> validStrings) {
        if (index == N) {
            if (current.compareTo(L) >= 0 && current.compareTo(R) <= 0) {
                validStrings.add(current);
            }
            return;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            generateStrings(L, R, current + c, index + 1, N, validStrings);
        }
    }

    private static boolean isBitwiseAndZero(String s) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        int bitwiseAnd = charCount[0];
        for (int i = 1; i < 26; i++) {
            bitwiseAnd &= charCount[i];
        }

        return bitwiseAnd == 0;
    }
}

