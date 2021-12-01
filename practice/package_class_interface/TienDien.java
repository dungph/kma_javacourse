import java.util.Scanner;
import java.util.Vector;

// Để quản lý các biên lai thu tiền điện, người ta cần  các thông tin như sau: 
// Với mỗi biên lai, có các thông tin sau: thông tin về hộ sử dụng điện, chỉ số cũ,  chỉ 
// số mới, số tiền phải trả của mỗi hộ sử dụng điện 
// Các thông tin riêng của mỗi hộ sử dụng điện gồm: Họ tên chủ hộ, số nhà, mã số 
// công tơ của hộ dân sử dụng điện. 
// 1. Hãy xây dựng các lớp: KhachHang  để lưu trữ các thông tin riêng của mỗi hộ 
// sử dụng điện, lớp BienLai  để quản lý việc sử dụng và thanh toán tiền điện của các hộ 
// dân. Xây dựng các phương thức nhập, và hiển thị thông tin của mỗi hộ sử dụng điện. 
// 2. Cài đặt chương trình thực hiện các công việc sau: 
// + Nhập vào các thông tin cho n hộ sử dụng điện 
// + Tính tiền điện phải trả cho mỗi hộ dân, biết rằng tiền phải trả được tính theo 
// công thức sau:       Số tiền phải trả=(Số mới - số cũ) * 850000.

public class TienDien {
    public static void main(String[] s) {
        var scanner = new Scanner(System.in);
        System.out.println("So ho: ");
        var n = scanner.nextInt();
        scanner.nextLine();

        var bills = new Vector<BienLai>();
        for (int i = 0; i < n; i++) {
            var bill = new BienLai();
            bill.insertInformation(scanner);
            bills.add(bill);
        }

        for (BienLai bill: bills) {
            System.out.println(bill.toString());
        }
    }
}

class BienLai {
    Consumer consumer;
    int oldNumber;
    int newNumber;
    
    BienLai() {
        consumer = new Consumer();
    }
    public void insertInformation(Scanner scanner) {
        this.consumer.insertInformation(scanner);
        System.out.println("Input old numeber: ");
        this.oldNumber = scanner.nextInt();
        this.newNumber = scanner.nextInt();
    }
    public int total() {
        return (newNumber - oldNumber)*850000;
    }
    @Override
    public String toString() {
        return consumer.toString()
            + " Old Number: " + oldNumber
            + " New Number: " + newNumber
            + " total: " + this.total();
    }
}

class Consumer {
    String name;
    String houseNumber;
    String meterId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getMeterId() {
		return meterId;
	}
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

    @Override
    public String toString() {
        return "Consumer: " + name 
            + ", houseNumber: " + houseNumber 
            + ", meterId: " + meterId;
    }
    
    public void insertInformation(Scanner scanner) {
        System.out.println("Input name: ");
        this.name = scanner.nextLine();
        System.out.println("Input houseNumber: ");
        this.houseNumber = scanner.nextLine();
        System.out.println("Input meter id: ");
        this.meterId = scanner.nextLine();

    }
}
