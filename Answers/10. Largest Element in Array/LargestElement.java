import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        System.out.printf("Enter the size of Array\t: ");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter for element number");
            for (int i = 0; i < size; i++) {
                System.out.printf("%d : ", i);
                arr[i] = input.nextInt();
            }
            // int[] arr = {4,1,5,3};
            System.out.printf("Largest element in the array is %d.", largestElement(arr));
        }
    }

    static int largestElement(int[] arr) {
        int largest = 0;
        for (int i : arr) {
            if (i > largest)
                largest = i; // Largest
        }
        return largest;
    }
}