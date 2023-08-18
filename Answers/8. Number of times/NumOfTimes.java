import java.util.Scanner;

public class NumOfTimes {
    public static void main(String[] args) {
        System.out.print("\nEnter a String\t: ");
        try (Scanner input = new Scanner(System.in)) {
            String word = input.nextLine();
            System.out.print("Enter the character\t: ");
            char letter = input.next().charAt(0);
            // String word = "Avinash";
            // char letter = 'b';
            if (numOfTimes(word, letter) == 0)
                System.out.printf("\n\'%s\' doesn't contain any \'%c\'.", word, letter);
            else
                System.out.printf("\n\'%c\' is \'%d\' times in \'%s\'.", letter, numOfTimes(word, letter), word);
        }
    }

    static int numOfTimes(String word, char letter) {
        word = word.replaceAll(" ", "").toLowerCase();
        letter = Character.toLowerCase(letter);
        int result = 0;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == letter)
                result++;
        return result;
    }
}