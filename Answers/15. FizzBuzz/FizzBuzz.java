import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args) {
        System.out.print("Enter an Integer\t: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        // int num = 29;
        System.out.print(fizzBuzz(num));
    }
    public static String fizzBuzz(int num) {
        if (num %3 == 0)
         if (num %5 == 0) return "FizzBuzz";
         else return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        return Integer.toString(num);
    }
}