import java.util.Scanner;

public class NoVowels {
    public static void main(String[] args) {
        System.out.print("Enter the String\t: ");
        Scanner input = new Scanner(System.in);
        String query = input.nextLine();
        input.close();
        // String query = "Avinash";
        System.out.printf("The String with all vowels removed : %s.", noVowels(query));
    }
    public static String noVowels(String query) {
        query = query.toLowerCase().replaceAll("(?i)a|e|i|o|u", "");
        return query;
    }
}