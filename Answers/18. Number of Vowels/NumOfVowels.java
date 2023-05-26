import java.util.Scanner;

public class NumOfVowels {
    public static void main(String[] args) {
        System.out.print("Enter the String\t: ");
        Scanner input = new Scanner(System.in);
        String query = input.nextLine();
        input.close();
        // String query = "Avinash";
        System.out.printf("The Number of vowels are : %d.", numOfVowels(query));
    }
    public static int numOfVowels(String query) {
        int count = 0;
        query = query.toLowerCase();
        for(int i = 0; i < query.length(); i++) {
            char ch = query.charAt(i);
            if(String.valueOf(ch).matches("(?i)[aeiou]")) count++;
        }
        return count;
    }
}