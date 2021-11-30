import java.util.Scanner;
import java.util.Vector;

//Viết chương trình  nhập  số  cạnh  của đa giác, chiều  dài  
//các  cạnh sau đó hiển  thị  lên 
//màn hình tất cả các thông tin đã nhập, tính chu vi đa giác.

public class AdvancePractice1 {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of edges = ");
        
        var nEdges = scanner.nextInt();
        var parimeter = 0.0;
        for (int i = 0; i < nEdges; i++) {
            parimeter += scanner.nextDouble();
        }

        System.out.println("parimeter = " + parimeter);

    }
}
