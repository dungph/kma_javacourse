import java.util.Scanner;

public class Main {
    public static void main(String[] s) {
        var myName = new VietnameseName("Pham Van", "Dung");
        myName.displayName();
        var myForeignName = new ForeignName("Dung", "Pham Van");
        myForeignName.displayName();

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("USB code = ");
        var code = scanner.nextLine();
        System.out.println("USB price = ");
        var price = scanner.nextDouble();
        System.out.println("USB quantity = ");
        var quantity = scanner.nextInt();
      
        scanner.nextLine();
        var usb = new USB(code, price, quantity);
        
        System.out.println("Mouse code = ");
        code = scanner.nextLine();
        System.out.println("Mouse price = ");
        price = scanner.nextDouble();
        System.out.println("Mouse quantity = ");
        quantity = scanner.nextInt();
       
        var mouse = new Mouse(code, price, quantity);

        usb.printOut();
        mouse.printOut();
    }
}

//Bài 13 
//
//- Lớp "tên người Việt" gồm 2 thuộc tính: "họ" và "tên" và phương thức hiển thị tên đầy đủ theo thứ tự họ + tên 
//- Lớp "tên người nước ngoài" kế thừa từ lớp "tên người Việt" , phương thức hiển thị tên đầy đủ lại theo thứ tự tên + họ 
//
//Vd: tên người Việt: Nguyễn Văn Hiếu ; tên nước ngoài: Văn Hiếu NGUYỄN 
//

class VietnameseName {
    String firstName;
    String lastName;
    VietnameseName(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void displayName() {
        System.out.println(lastName + " " + firstName);
    }
}

class ForeignName extends VietnameseName {

    ForeignName(String firstName, String lastName) {
        super(lastName, firstName);
    }

    public void displayName() {
        System.out.println(firstName + " " + lastName);
    }
}

//Bài 14 
//
//- Lớp HocSinh gồm các thuộc tính: hoTen, lop, toan, ly, hoa và phương thức điểm trung bình là trung bình cộng 3 môn 
//- Lớp HocSinhChuyenToan kế thừa từ phương thức HocSinh, nhưng khi tính điểm trung bình nhân đôi hệ số môn Toán rồi cộng tất cả, chia cho 4.  
//
class Student {
    String hoTen;
    String lop;
    float math;
    float physic;
    float chemistry;
    
    public float averageScore() {
        return (math + physic + chemistry) / 3;
    }

}
class MathStudent extends Student {
    public float averageScore() {
        return (math*2 + physic + chemistry) / 4;
    }
}


//
//Bài 15 
//
//- Class USB có các thuộc tính: mã hàng, giá, số lượng. Phương thức tổng tiền = giá * số lượng, phương thức show in ra toàn bộ thông tin đơn hàng mua USB 
//- Class Mouse kế thừa từ class USB, ghi đè 2 phương thức tổng tiền (do chuột được giảm giá 20%) và show in toàn bộ thông tin đơn hàng khi khách hàng mua chuột máy tính. 
//- Tạo mỗi lớp 1 đối tượng, nhập thông tin từ bàn phím, in thông tin đơn hàng ra màn hình! 
// 
class USB {
    String code;
    double price;
    int quantity;

    USB(String code, double price, int quantity) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public double total() {
        return price * quantity;
    }
    public void printOut() {
        System.out.println("Usb bill: " + price + "*" + quantity + "=" + price * quantity);
    }
}

class Mouse extends USB {
    Mouse(String code, double price, int quantity) {
        super(code, price, quantity);
    }
    public double total() {
        return price * quantity*0.8;
    }
    public void printOut() {
        System.out.println("Mouse bill: " + price + "*" + quantity + " (-20%) =" + this.total());
    }   
}
