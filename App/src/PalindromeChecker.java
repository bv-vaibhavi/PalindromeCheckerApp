// UC4: Character Array Based Palindrome Check

public class PalindromeChecker {

    public static void main(String[] args) {

        String word = "madam";

        // Step 1: Convert string to char array
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Step 2: Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
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