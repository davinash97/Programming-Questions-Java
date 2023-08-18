import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        System.out.print("Enter the size of the Array\t: ");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int[] inputArray = new int[size];
            System.out.println("Enter elements for:");
            for (int i = 0; i < size; i++) {
                System.out.printf("%d - ", i);
                inputArray[i] = input.nextInt();
            }
            // int[] inputArray = {2, -1, 2, 4};
            System.out.printf("Sum of Even and greater than 0 elements in given array is %d", sumOfEven(inputArray));
        }
    }

    static int sumOfEven(int[] inputArray) {
        int temp = 0;
        for (int i : inputArray)
            if ((i > 0) && (i % 2 == 0))
                temp += i;
        return temp;
    }
}