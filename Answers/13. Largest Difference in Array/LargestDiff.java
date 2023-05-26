import java.util.Scanner;

public class LargestDiff {
    public static void main(String[] args) {
        System.out.print("Enter the Size of Array\t: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter element for ");
        for(int i = 0; i < size; i++) {
            System.out.printf("%d\t: ", i);
            arr[i] = input.nextInt();
        }
        input.close();
        // int[] arr = {1, 2, 4, 7};
        System.out.printf("Largest Difference in given Array is %d", largestDiff(arr));
    }
    public static int largestDiff(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i : arr) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        return (max - min);
    }
}