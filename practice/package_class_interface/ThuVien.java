import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//  Thư  viện của  trường đại học KHTN có nhu cầu cần quản lý việc mượn sách. Sinh 
//  viên đăng ký và tham gia mượn sách thông qua các thẻ mượn mà thư viện đã thiết kế.
//  
//  - Với mỗi thẻ mượn, có các thông tin sau: số  phiếu  mượn , ngày mượn, hạn  
//  trả, số hiệu sách, và các thông tin riêng về mỗi sinh  viên đó. 
//  - Các thông tin riêng về mỗi sinh viên đó bao gồm: Họ tên, năm sinh, tuổi, lớp. 
//  1. Hãy xây dựng các lớp: SinhVien để quản lý các thông tin riêng về mỗi sinh viên, lớp 
//  TheMuon để quản lý việc mượn sách của mỗi đọc giả. 
//  2. Viết chương trình nhập và hiển thị thông tin của một thẻ mượn.

public class ThuVien {
    public static void main(String[] s) {
        var scanner = new Scanner(System.in);
        var theMuon = new TheMuon();

        System.out.println("Insert Student infomations");
        System.out.println("Insert Student name:");
        theMuon.sinhVien.hoTen = scanner.nextLine();
        
        System.out.println("Insert Student birth year:");
        theMuon.sinhVien.namSinh = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert Student class");
        theMuon.sinhVien.lop = scanner.nextLine();

        System.out.println("Insert Call card number:");
        theMuon.soPhieuMuon = scanner.nextInt();

        System.out.println("Insert Call card loan day:");
        var day = scanner.nextInt();
        System.out.println("Insert Call card loan month:");
        var month = scanner.nextInt();
        System.out.println("Insert Call card loan year:");
        var year = scanner.nextInt();
        var cal = Calendar.getInstance();
        cal.set(year, month, day);

        theMuon.ngayMuon = cal.getTime();

        System.out.println("Insert Call card return day:");
        day = scanner.nextInt();
        System.out.println("Insert Call card return month:");
        month = scanner.nextInt();
        System.out.println("Insert Call card return year:");
        year = scanner.nextInt();
        cal.set(year, month, day);

        theMuon.ngayHenTra = cal.getTime();

       
        System.out.println("Insert Book id:");
        scanner.nextLine();
        theMuon.soHieuSach = scanner.nextLine();

        System.out.println("Call card infomation");

        System.out.println("Student infomation");
        System.out.println("Student name" + theMuon.sinhVien.hoTen);
        System.out.println("Student birth year" + theMuon.sinhVien.namSinh);
        System.out.println("Student class" + theMuon.sinhVien.lop);

        System.out.println("Call card information");
        System.out.println("Call card number" + theMuon.soPhieuMuon);
        System.out.println("Call card loan day" + theMuon.ngayMuon);
        System.out.println("Call card return day" + theMuon.ngayHenTra);
        System.out.println("Call card book id" + theMuon.soHieuSach);

    }
}

class TheMuon {
    protected int soPhieuMuon;
    protected Date ngayMuon;
    protected Date ngayHenTra;
    protected String soHieuSach;
    protected SinhVien sinhVien;
    TheMuon() {
        sinhVien = new SinhVien();
    }
}

class SinhVien {
    protected String hoTen;
    protected int namSinh;
    protected int tuoi; // ?? we don't need this field
    protected String lop;
    
    protected String getHoTen() {
        return hoTen;
    }
    protected void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    protected int getNamSinh() {
        return namSinh;
    }
    protected void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    protected int getTuoi() {
        return tuoi;
    }
    protected void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    protected String getLop() {
        return lop;
    }
    protected void setLop(String lop) {
        this.lop = lop;
    }
    
}
