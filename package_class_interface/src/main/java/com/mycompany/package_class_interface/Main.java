/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.package_class_interface;

import java.util.Scanner;

/**
 *
 * @author dungph
 */
public class Main {
    public static void main(String[] s) {
        var scanner = new Scanner(System.in);

        System.out.println("Class Toan Hoc:");
        


        System.out.println("Class Diem:");
        var d1 = new Diem(3, 7);
        var d2 = new Diem(9, 3);
        d1.inTTDiem();
        System.out.print(" to ");
        d2.inTTDiem();
        System.out.print(" is " + d1.tinhKhoangCach(d2));
        
        
        System.out.println("\nClass So Phuc:");
        var sp1 = new SoPhuc();
        var sp2 = new SoPhuc();

        sp1.nhapSoPhuc(scanner);
        sp2.nhapSoPhuc(scanner);

        System.out.println("\nCong: ");
        sp1.congSoPhuc(sp2).inSoPhuc();
        
        System.out.println("\nNhan: ");
        sp1.nhanSoPhuc(sp2).inSoPhuc();
    }
}



class ToanHoc {
    int n;

    public static boolean kiemTraNguyenTo(int k) {
        if (k < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean kiemTraSoHoanHao(int k) {
        int sum = 1;
        for (int i = 2; i <= k / 2; i++) {
            if (k % i == 0) {
                sum += i;
            }
        }
        if (k == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean kiemTraSoChinhPhuong(int k) {
        var sq = (int) Math.sqrt(k);
        if (sq * sq == k) {
            return true;
        } else {
            return false;
        }
    }

    public static int tinhFibo(int k) {
        if (k < 2) {
            return 1;
        } else {
            return k*ToanHoc.tinhFibo(k-1);
        }
    }

    public static double tinhTong1(int k) {
        if (k == 1) {
            return 0.5;
        } else {
            return ((double)(k-1))/((double)k) + ToanHoc.tinhTong1(k-1);
        }
    }

    public static double tinhTong2(int n, Scanner scanner) {
        double up = 0;
        double xPower = 1;
        double kPower = 1;
        double iPower = -1;

        double ret = 0;
        var x = scanner.nextInt();
        var k = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            up +=1;
            xPower = xPower*x;
            kPower = kPower*k;
            iPower = iPower*(-1);
            ret += up/(xPower + iPower*kPower);
        }
        return ret;
        
    }

    public static int tinhTong3(int n) {
        int sum = 0;
        int iPower = -1;
        for (int i = 1; i <= n; i++) {
            sum += iPower*i;
            iPower *= -1;
        }
        return sum;
    }

    public static int tinhTong4(int n) {
        int fac = 1;
        for (int i = 2; i < n; i++) {
            fac += fac*i;
        }
        return fac;

    }
}

class Diem {
    double x;
    double y;
    public Diem() {}
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void inTTDiem() {
        System.out.print("(" + x + ", " + y + ")");
    }

    public double tinhKhoangCach(Diem d) {
        return Math.sqrt((x-d.x)*(x-d.x)+(y-d.y)*(y-d.y));
    }

}

class SoPhuc {
    double phanThuc;
    double phanAo;
    public SoPhuc() {}
    public SoPhuc(double pt, double pa) {
        phanAo = pa;
        phanThuc = pt;
    }
    public void nhapSoPhuc(Scanner scanner) {
        System.out.print("Nhap so phan thuc: ");
        phanThuc = scanner.nextDouble();
        System.out.print("Nhap so phan thuc: ");
        phanAo = scanner.nextDouble();
    }

    public void inSoPhuc() {
        System.out.print(phanThuc + "+" + phanAo + "i");
    }

    public SoPhuc congSoPhuc(SoPhuc sp) {
        return new SoPhuc(phanThuc + sp.phanThuc, phanAo + sp.phanAo);
    }
    public SoPhuc nhanSoPhuc(SoPhuc sp) {
        return new SoPhuc(
            phanThuc * sp.phanThuc - phanAo * sp.phanAo,
            phanThuc * sp.phanAo + phanAo * sp.phanThuc
        );
    }
}
