// 1. Hãy xây dựng lớp DaGiac gồm có: 
//  Các thuộc tính: 
// + Số cạnh của đa giác 
// + Mảng các số thực chứa kích thước các cạnh của đa giác 
//  Các phương thức:  
// + Nhập vào giá trị cho các cạnh của đa giác 
// + Tính chu vi của đa giác 
//  
// + Hiển thị giá trị các cạnh của đa giác. 
// 2. Xây dựng lớp TamGiac kế thừa từ lớp DaGiac, thực hiện ghi đè các phương thức cảu 
// lớp TamGiac lên các phương thúc của lớp DaGiac. 
// 3. Xây dựng hàm main() nhập kích thước của một tam giác và hiển thị chu vi, diện tích 
// của tam giác đo

import java.util.Scanner;
import java.util.Vector;

public class DaGiac {
    public static void main(String[] s) {
        var tamGiac = new TamGiac();

        tamGiac.input();
        System.out.println(tamGiac.parimeter());
        System.out.println(tamGiac.area());

    }

    int numberOfEdge;
    Vector<Float> edges;
    public void input() {
        var scanner = new Scanner(System.in);

        System.out.println("numberOfEdge: ");
       
        this.numberOfEdge = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfEdge; i++) {
            var edge = scanner.nextFloat();
            this. edges.add(edge);
        }
    }

    public float parimeter() {
        float ret = 0;
        for (Float edge: edges) {
            ret += edge;
        }
        return ret;
    }


}

class TamGiac extends DaGiac {
    TamGiac() {
        edges = new Vector<Float>();
        numberOfEdge = 3;
    }
    public void input() {
        var scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfEdge; i++) {
            var edge = scanner.nextFloat();
            this.edges.add(edge);

        }
    }

    public float parimeter() {
        float ret = 0;
        for (Float edge: edges) {
            ret += edge;
        }
        return ret;
    }

    public double area() {
        var semi_parimeter = this.parimeter()/2.0;

        var squareArea = semi_parimeter;

        for (Float edge: edges) {
            squareArea*= semi_parimeter - edge;
        }

        return Math.sqrt(squareArea);
    }
}

