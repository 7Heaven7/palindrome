public class palindrome {
    static int maxPalindromeLength;
    static int firstPalindromeIndex;

    public static void main(String[] args) {
        String word = "l-ANNA@SUGAGA_ANMNA-";

        System.out.println("Longest Palindrome is : " + findLongestPalindrome(word));
    }

    public static String findLongestPalindrome(String word) {
        int wordLength = word.length();
        if (wordLength == 0) {
            return "the word is empty.";
        }
        if (wordLength == 1) {
            return word;
        }
        for (int index = 0; index < wordLength; index++) {
            findPalindromeLength(word, index, index);
            findPalindromeLength(word, index, index + 1);
        }

        return word.substring(firstPalindromeIndex, firstPalindromeIndex + maxPalindromeLength);
    }

    public static void findPalindromeLength(String word, int startIndex, int endIndex) {
        while (startIndex >= 0 && endIndex < word.length()
                && word.charAt(startIndex) == word.charAt(endIndex)) {
            startIndex--;
            endIndex++;
        }
        if (maxPalindromeLength <= endIndex - startIndex - 1) {
            firstPalindromeIndex = startIndex + 1;
            maxPalindromeLength = endIndex - startIndex - 1;
        }
    }
}