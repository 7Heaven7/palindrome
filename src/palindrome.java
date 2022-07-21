import java.util.Scanner;

public class palindrome {
    static int maxPalindromeLength;
    static int firstPalindromeIndex;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String inputString = scanner.next();
        System.out.println("Longest Palindrome is : " + findLongestPalindrome(inputString));
        scanner.close();
    }

    public static String findLongestPalindrome(String string) {
        int stringLength = string.length();
        if (stringLength == 0) {
            return "the string is empty.";
        }
        if (stringLength == 1) {
            return string;
        }
        for (int index = 0; index < stringLength; index++) {
            findPalindromeLength(string, index, index);
            findPalindromeLength(string, index, index + 1);
        }

        return string.substring(firstPalindromeIndex, firstPalindromeIndex + maxPalindromeLength);
    }

    public static void findPalindromeLength(String string, int startIndex, int endIndex) {
        while (startIndex >= 0 && endIndex < string.length()
                && string.charAt(startIndex) == string.charAt(endIndex)) {
            startIndex--;
            endIndex++;
        }
        if (maxPalindromeLength < endIndex - startIndex - 1) {
            firstPalindromeIndex = startIndex + 1;
            maxPalindromeLength = endIndex - startIndex - 1;
        }
    }
}