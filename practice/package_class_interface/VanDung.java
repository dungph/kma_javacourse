import java.util.Scanner;

public class VanDung {
    public static void main(String[] s) {
        var nguoi = new Nguoi();        
        nguoi.nhapTT();
        nguoi.inTT();
    }
}

class Nguoi {
    private String hoTen;
    private String diaChi;
    private int namSinh;
    protected void nhapTT() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Dia Chi: ");
        diaChi = scanner.nextLine();
        System.out.println("Nam Sinh: ");
        namSinh = scanner.nextInt();
    }
    protected void inTT() {
        System.out.println(hoTen + " - " + namSinh + "\n" + diaChi);
    }
}


