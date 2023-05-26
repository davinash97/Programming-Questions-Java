import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter a String\t: ");
        Scanner input = new Scanner(System.in);
        String query = input.nextLine();
        input.close();
        // String query = "A man, a plan. a canal' Panama";
        String result = (isPalindrome(query)) ? " a" : " not";
        System.out.print("\'" + query + "\'" + " is" + result + " Palindrome.");
    }
    public static boolean isPalindrome(String query) {
        query = query.replaceAll("(?i),|.|\'|\"||", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(query).reverse();
        return query.equals(reversed.toString());
    }
}