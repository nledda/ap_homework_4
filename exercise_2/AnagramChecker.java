import java.util.Scanner;

public class AnagramChecker {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        
        // Process strings to ignore spaces and capitalization
        a = a.toLowerCase().replaceAll("\\s", "");
        b = b.toLowerCase().replaceAll("\\s", "");
        
        // Quick check if lengths are different
        if (a.length() != b.length()) {
            return false;
        }
        
        // Compare letter counts
        int[] countsA = countLetters(a);
        int[] countsB = countLetters(b);
        
        for (int i = 0; i < 26; i++) {
            if (countsA[i] != countsB[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Helper method to count how many times each letter (a-z) appears.
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }
        
        return counts;
    }
    
    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {
        // Process string to ignore spaces and capitalization
        s = s.toLowerCase().replaceAll("\\s", "");
        
        int[] counts = countLetters(s);
        
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get two strings from the user
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();
        
        // Process strings and check if they are anagrams
        boolean areAnagrams = isAnagram(word1, word2);
        System.out.println("Are they anagrams? " + areAnagrams);
        
        System.out.println("\nLetter counts for first string:");
        printLetterCounts(word1);
        
        // Close the scanner
        scanner.close();
    }
}
