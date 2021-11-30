import java.util.Scanner;

// Viết chương trình: Nhập vào 2 số kiểu  số thực float, double (sử  dụng với các 
// phương thức nextFloat(), nextDouble(), in ra các kết quả của các phếp tính, tổng, hiệu, 
// tích, thương, lấy phần dư của các số đó.
//
public class AdvancePractice2 {
    public static void main(String[] a) {
        var scanner = new Scanner(System.in);

        var floatNum = scanner.nextFloat();
        var doubleNum = scanner.nextDouble();

        System.out.println("float + double = " + ((double)floatNum + doubleNum));
        System.out.println("float - double = " + ((double)floatNum - doubleNum));
        System.out.println("float * double = " + ((double)floatNum * doubleNum));
        System.out.println("float / double = " + ((double)floatNum / doubleNum));
        System.out.println("float % double = " + ((double)floatNum % doubleNum));

        scanner.close();
    }
}
