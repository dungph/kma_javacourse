import java.util.Scanner;

public class NhanVien {
    String hoten;
    int nam_sinh;
    String dia_chi;
    double tien_luong;
    int tong_gio_lam_viec;

    NhanVien() {
        hoten = "Ho va ten";
    }

    NhanVien(String hoten, int nam_sinh, String dia_chi, double tien_luong, int tong_gio_lam_viec) {
        this.hoten = hoten;
        this.nam_sinh = nam_sinh;
        this.dia_chi = dia_chi;
        this.tien_luong = tien_luong;
        this.tong_gio_lam_viec = tong_gio_lam_viec;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten: ");
        hoten = scanner.nextLine();

        System.out.print("nam_sinh: ");
        nam_sinh = scanner.nextInt();
        scanner.nextLine();

        System.out.print("dia_chi: ");
        dia_chi = scanner.nextLine();

        System.out.print("tien_luong: ");
        tien_luong = scanner.nextDouble();

        System.out.print("tong_gio_lam_viec: ");
        tong_gio_lam_viec = scanner.nextInt();
    }

    public void printInfo() {

        System.out.println(hoten + " sinh nam " + nam_sinh + " dia_chi " + dia_chi + " luong " + tien_luong + " tong_gio_lam_viec " + tong_gio_lam_viec);
    }
    
    public double tinhThuong() {
        if (tong_gio_lam_viec >= 200) {
            return tien_luong*0.2;
        } else if (tong_gio_lam_viec >= 100) {
            return tien_luong*0.1;
        } else {
            return 0;
        }
    }

    public static void main(String[] a) {
        NhanVien nv = new NhanVien();

        nv.inputInfo();
        nv.printInfo();
        System.out.println("Thuong: " + nv.tinhThuong());
    }
}
