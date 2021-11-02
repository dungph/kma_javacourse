import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        // Insert long side and short side of a rectangle
        int length;
        int width;

        System.out.print("Input Long and Short side: ");
        Scanner scanner = new Scanner(System.in);

        length = scanner.nextInt();
        width = scanner.nextInt();

        int area = width * length;
        System.out.println("Area equal " + area);

        scanner.close();
    }
}
