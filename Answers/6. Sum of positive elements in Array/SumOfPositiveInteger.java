import java.util.Scanner;

public class SumOfPositiveInteger {
    public static void main(String[] args) {
        System.out.print("Enter the size of Array\t: ");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int[] inputArray = new int[size];
            System.out.println("Enter element for:");
            for (int i = 0; i < size; i++) {
                System.out.printf("%d - ", i);
                inputArray[i] = input.nextInt();
            }
            System.out.printf("Sum of all positive Integer is %d.", sumOfPositiveInteger(inputArray));
        }
    }

    static int sumOfPositiveInteger(int[] inputArray) {
        int temp = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0)
                temp += inputArray[i];
        }
        return temp;
    }
}