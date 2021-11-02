import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Input a random number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number % 2 == 1) {
            number += 1;
            System.out.println("Your number + 1 = " + number);
        } else {
            System.out.println("Your number = " + number);
        }
    }
}
