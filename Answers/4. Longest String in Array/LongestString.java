import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        System.out.print("Enter a size for Array\t: ");
        try(Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            String[] strings = new String[n];
            System.out.println("Enter your string for:");
            for(int i = 0; i < n; i++) {
                System.out.printf("%d - ", i);
                strings[i] = input.next();
            }
            // String[] strings = {"Cat", "Dog", "Elep", "crow"};
            System.out.printf("The Longest String in the given Array is %s", longestString(strings));
        }
    }
    static String longestString(String[] strings) {
        String result = strings[0];
        for(String i : strings) if(result.length() < i.length()) result = i;
        return result;
    }
}