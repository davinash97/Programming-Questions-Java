import java.util.Scanner;

public class EvenNumbers {
    public static void main (String[] args) {
        System.out.print("Enter size of Array:\t");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int[] numbers = new int[size];
            for(int i = 0; i < size; i++) {
                System.out.printf("\nEnter value for %d element\t: ",i);
                numbers[i] = input.nextInt();
            }
        System.out.printf("Sum of even numbers of given Array is %d.", evenNum(numbers));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static int evenNum(int[] numbers) {
        int temp = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) temp += numbers[i];
        }
        return temp;
    }
}