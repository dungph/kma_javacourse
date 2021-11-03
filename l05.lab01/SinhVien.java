import java.util.Scanner;
public class SinhVien {

    String hoten;
    String lop;
    float diemTB;


    public void nhap_thong_tin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        hoten = scanner.nextLine();

        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();

        System.out.print("Nhap diemTB");
        diemTB = scanner.nextFloat();
    }

    public void hien_thi_thong_tin() {
        System.out.println("Sinh vien " + hoten + " lop " + lop + " diem trung binh: " + diemTB);
    }

    public void hoc_luc() {
        if (diemTB >= 8) {
            System.out.println("hoc luc gioi");
        } else if (diemTB >= 6.5) {
             System.out.println("hoc luc kha");
        } else if (diemTB >= 5){
             System.out.println("hoc luc TB");
        } else {
             System.out.println("hoc luc kem");
        }
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap_thong_tin();
        sv.hien_thi_thong_tin();
        sv.hoc_luc();
    }
}
