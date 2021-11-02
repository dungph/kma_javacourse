import java.util.Scanner;

public class Looping {
    // Ask user input a number less than 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int number;
        do {
            System.out.print("input a number less than 10: ");
            number = scanner.nextInt();
        } while (number >= 10);
    } 
}
