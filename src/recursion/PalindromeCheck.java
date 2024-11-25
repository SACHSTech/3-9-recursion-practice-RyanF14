package recursion;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (s.length() <= 1) {
            return true;
        }

        // Check if the first and last characters are the same
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursive case: check the substring excluding the first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(isPalindrome(input));

        input = "hello";
        System.out.println(isPalindrome(input));
    }
}
