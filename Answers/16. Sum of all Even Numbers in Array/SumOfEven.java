import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        System.out.print("Enter the size of Array\t: ");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int[] num = new int[size];
            System.out.println("Enter element for:");
            for (int i = 0; i < size; i++) {
                System.out.printf("%d - ", i);
                num[i] = input.nextInt();
            }
            System.out.printf("Sum of all Even Integer is %d.", sumOfEven(num));
        }
    }

    static int sumOfEven(int[] num) {
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                result += num[i];
        }
        return result;
    }
}