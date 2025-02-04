import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter the Integer\t: ");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            System.out.printf("Sum of %d is %d.", num, sumOfDigits(num));
        }
    }

    static int sumOfDigits(int num) {
        int result = 0;
        int temp = 0;
        while (num > 0) {
            temp = num % 10;
            num /= 10;
            result = result * 10 + temp;
        }
        return result;
    }
}