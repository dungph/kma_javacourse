import java.util.Scanner;
public class Student {
    String ma_sinh_vien;
    float diem_tb;
    int nam_sinh;
    String lop;

    Student() {}
    Student(String a, float b, int c, String d) {
        ma_sinh_vien = a;
        diem_tb = b;
        nam_sinh = c;
        lop = d;
    }

    public void inputInfo() {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap ma_sinh_vien: ");
            ma_sinh_vien = scanner.nextLine();
            ma_sinh_vien.trim();
        } while (ma_sinh_vien.length() != 4);

        do {
            System.out.print("Nhap diem_tb: ");
            diem_tb = scanner.nextFloat();
        } while (diem_tb < 0.0 || diem_tb > 10.0);

        do {
            System.out.print("Nhap nam_sinh: ");
            nam_sinh = scanner.nextInt();
        } while (nam_sinh < 2002);
        scanner.nextLine();
        do {
            System.out.print("Nhap lop: ");
            lop = scanner.nextLine();
            lop.trim();
            System.out.println(lop);
        } while (lop.charAt(0) != 'A' && lop.charAt(0) != 'B' && lop.charAt(0) != 'C');
    }
    public void printInfo() {
        System.out.println("ma_sinh_vien: " + ma_sinh_vien);
        System.out.println("diem_tb: " + diem_tb);
        System.out.println("nam_sinh: " + nam_sinh);
        System.out.println("lop: " + lop);
    }
    public static void main(String[] a) {
        Student s = new Student();
        s.inputInfo();
        s.printInfo();
    }
}
