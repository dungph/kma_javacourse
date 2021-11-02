import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int expected = (int)(Math.random()*81) + 1;
       
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Number: ");
            number = scanner.nextInt();
            if (number > expected) {
                System.out.println("expected less than that");
            } else if (number < expected) {
                System.out.println("expected greater than that");
            } else {
                System.out.println("You found it!");
            }
        } while (number != expected);
    }
}
