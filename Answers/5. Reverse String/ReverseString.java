import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {
        System.out.print("Enter a String\t: ");
        try (Scanner input = new Scanner(System.in)){
            String query = input.nextLine();
            System.out.printf("Reverse of %s is %s.", query,reverseString(query));
        }
    }
    public static String reverseString(String query) {
        if (query == null || query.isEmpty()) {
            return query;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i = query.length() - 1; i >= 0; i--) {
            reversed.append(query.charAt(i));
        }
        return reversed.toString();
    }
}