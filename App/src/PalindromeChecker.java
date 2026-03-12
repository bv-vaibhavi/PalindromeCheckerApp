// UC3: Palindrome check using char array and two-pointer technique

public class PalindromeChecker {

    public static void main(String[] args) {

        String word = "madam";

        // Step 1: Convert string to char array
        char[] chars = word.toCharArray();

        // Step 2: Two-pointer technique
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}