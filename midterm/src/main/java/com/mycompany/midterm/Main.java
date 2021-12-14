/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midterm;

import java.util.Scanner;

/**
 *
 * @author dungph
 */
public class Main {
    public static void main(String[] a) {
        char choose;
        var scanner = new Scanner(System.in);

        var store = new Store();

        do {
            System.out.println("------------------------------------------------------------------------------- ");
            System.out.println("Chọn một chức năng: (1-5)\nPhím bất kỳ để thoát.");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa sách");
            System.out.println("3. Xóa sách.");
            System.out.println("4. Tìm sách.");
            System.out.println("5. Xem danh sách.");
            System.out.print("Lựa chọn: ");
            choose = scanner.nextLine().charAt(0);

            if (choose == '1') {
                store.add(scanner);
            } else if (choose == '2') {
                store.edit(scanner);
            } else if (choose == '3') {
                store.delete(scanner);
            } else if (choose == '4') {
                store.find(scanner);
            } else if (choose == '5') {
                store.list();
            }
        } while (choose <= '5' && choose >= '1');
        scanner.close();
    }

}

class Book {
    private String ID;
    private String name;
    private double price;

    protected String getID() {
        return ID;
    }

    protected void setID(String iD) {
        ID = iD;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void printInfo() {
        System.out.println("```````````` \nThông tin sách: ");
        System.out.println("Mã sách: " + this.getID());
        System.out.println("Tên sách: " + this.getName());
        System.out.println("Giá sách: " + this.getPrice());

    }

}

class Store {
    private int MAX_ITEMS = 100;
    private int totalItems;
    private Book[] listItems;

    Store() {
        listItems = new Book[MAX_ITEMS];
    }

    public boolean add(Scanner scanner) {
        if (totalItems == MAX_ITEMS) {
            return false;
        }
        var book = new Book();

        System.out.print("Nhập mã sách: ");
        book.setID(scanner.nextLine());
        System.out.print("Nhập tên sách: ");
        book.setName(scanner.nextLine());
        System.out.print("Nhập giá: ");
        book.setPrice(scanner.nextDouble());
        scanner.nextLine();

        listItems[totalItems++] = book;
        return true;
    }

    public boolean edit(Scanner scanner) {
        System.out.print("Nhập mã sách cần sửa: ");
        String maSach;
        maSach = scanner.nextLine();
        for (int i = 0; i < totalItems; i++) {
            if (listItems[i].getID().toLowerCase().equals(maSach.toLowerCase())) {
                
                System.out.print("Nhập mã mới: ");
                listItems[i].setID(scanner.nextLine());
                System.out.print("Nhập tên mới: ");
                listItems[i].setName(scanner.nextLine());
                System.out.print("Nhập giá mới: ");
                listItems[i].setPrice(scanner.nextDouble());
                scanner.nextLine();
                
                return true;
            }
        }
        return false;
    }

    public boolean delete(Scanner scanner) {
        System.out.print("Nhập mã sách cần xóa: ");
        String maSach;
        maSach = scanner.nextLine();
        for (int i = 0; i < totalItems; i++) {
            if (listItems[i].getID().toLowerCase().equals(maSach.toLowerCase())) {
                totalItems--;
                listItems[i] = listItems[totalItems];
                return true;
            }
        }
        return false;

    }

    public boolean find(Scanner scanner) {
        System.out.print("Nhập mã hoặc tên sách cần tìm: ");
        String maTenSach;
        maTenSach = scanner.nextLine();

        var result = false;

        System.out.println("Tìm theo mã: ");
        for (int i = 0; i < totalItems; i++) {
            if (listItems[i].getID().toLowerCase().equals(maTenSach.toLowerCase())) {
                result = true;
                listItems[i].printInfo();
            }
        }
        System.out.println("Tìm theo tên: ");
        for (int i = 0; i < totalItems; i++) {
            if (listItems[i].getName().toLowerCase().equals(maTenSach.toLowerCase())) {
                result = true;
                listItems[i].printInfo();
            }
        }
        return result;
    }

    public void list() {
        System.out.println("Danh sách tất cả đầu sách:");

        for (int i = 0; i < totalItems; i++) {
            listItems[i].printInfo();
        }
    }
}
