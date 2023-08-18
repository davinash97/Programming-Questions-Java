import java.util.*;

public class FindCommonElements {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a size for 1st Array\t: ");
            int size1 = input.nextInt();
            System.out.print("\nEnter a size for 2nd Array\t: ");
            int size2 = input.nextInt();
            int[] arr1 = new int[size1];
            System.out.printf("\nEnter elements for 1st Array\n");
            for (int i = 0; i < size1; i++) {
                System.out.printf("%d\t: ", i);
                arr1[i] = input.nextInt();
            }
            int[] arr2 = new int[size2];
            System.out.printf("\nEnter elements for 2nd Array\n");
            for (int i = 0; i < size2; i++) {
                System.out.printf(" %d\t: ", i);
                arr2[i] = input.nextInt();
            }

            // Test Cases:
            /*
             * int[] arr1 = {1,2,3,4};
             * int[] arr2 = {2,3};
             */

            int[] result = findCommonElements(arr1, arr2);
            System.out.printf("The Common elements in both Arrays are : ");
            for (int i = 0; i < result.length; i++) {
                char punc = (i < result.length - 1) ? ',' : '.';
                System.out.printf(" %d%c", result[i], punc);
            }
        }
    }

    static int[] findCommonElements(int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet<>(); // Using Set to remove duplicate items
        for (int i : arr1)
            set.add(i);

        List<Integer> list = new ArrayList<>();
        for (int i : arr2)
            if (set.contains(i))
                list.add(i); // It will only add items present in set

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }
}