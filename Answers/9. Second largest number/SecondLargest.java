import java.util.Scanner;

public class SecondLargest {
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
            System.out.printf("Second largest element in the array is %d.", secondLargest(arr));
        }
    }

    static int secondLargest(int[] arr) {
        int largest = 0;
        int secondLargest = 0;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i; // Largest
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}