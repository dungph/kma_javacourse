import java.util.Scanner;

public class VanDung {
    public static void main(String[] s) {
        var nguoi = new Nguoi();        
        nguoi.nhapTT();
        nguoi.inTT();
    }
}

class Nguoi {
    String hoTen;
    String diaChi;
    int namSinh;
    public void nhapTT() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Dia Chi: ");
        diaChi = scanner.nextLine();
        System.out.println("Nam Sinh: ");
        namSinh = scanner.nextInt();
    }
    public void inTT() {
        System.out.println(hoTen + " - " + namSinh + "\n" + diaChi);
    }
}


