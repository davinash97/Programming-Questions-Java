import java.util.Scanner;

public class RandomInt {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int random = randomInt(); // 1 - 100
            int num = 101; // If random int returns the same as declared value
            System.out.print("Guess the Number\t: ");
            while (random != num) {
                num = input.nextInt();
                String result;
                if (random > num)
                    result = "Higher\t ";
                else if (random < num)
                    result = "Lower\t ";
                else {
                    result = "Congrats " + num + " is the number!";
                }
                System.out.print(result);
            }
        }
    }

    static int randomInt() {
        int random = (int) (Math.random() * 101);
        return random;
    }
}