import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class FirstOccur {
    public static void main(String[] args) {
        System.out.print("Enter a String\t: ");
        try (Scanner input = new Scanner(System.in)) {
            String query = input.nextLine();
            input.close();
            // String query = "banana";
            System.out.printf("\'%s\' is the first Occurence in \'%s\'.", firstOccur(query), query);
        }
    }
    public static String firstOccur(String query) {
        query = query.toLowerCase();
        Set<Character> data = new HashSet<Character>();
        StringBuilder result = new StringBuilder();
        for(int index = 0; index < query.length(); index++) {
            char ch = query.charAt(index);
            data.add(ch);
        }
        for(char ch : data) result.append(ch);
        return result.toString();
    }
    
}