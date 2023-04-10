/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;
import java.util.Arrays;
public class SDPhanSo {

    public static void main(String[] args) {
        // Tạo phân số a và b và hiển thị giá trị của chúng
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.println("Phân số a: ");
        a.hienThi();
        System.out.println("Phân số b: ");
        b.hienThi();
        
        // Tạo 2 phân số x và y và nhập giá trị từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số của phân số x: ");
        int tuX = sc.nextInt();
        System.out.print("Nhập mẫu số của phân số x: ");
        int mauX = sc.nextInt();
        PhanSo x = new PhanSo(tuX, mauX);
        System.out.print("Nhập tử số của phân số y: ");
        int tuY = sc.nextInt();
        System.out.print("Nhập mẫu số của phân số y: ");
        int mauY = sc.nextInt();
        PhanSo y = new PhanSo(tuY, mauY);

        // Hiển thị giá trị nghịch đảo của phân số x
        System.out.println("Giá trị nghịch đảo của phân số x: ");
        x.giaTriNghichDao();
        x.hienThi();
        
        // Tính tổng của x + y và in kết quả ra màn hình
        PhanSo tong = x.cong(y);
        System.out.println("Tổng của x và y là: ");
        tong.hienThi();
        
        // Nhập vào 1 danh sách gồm n phân số và tính tổng
        System.out.print("Nhập số lượng phân số trong danh sách: ");
        int n = sc.nextInt();
        PhanSo[] dsPhanSo = new PhanSo[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tử số của phân số thứ " + (i + 1) + ": ");
            int tu = sc.nextInt();
            System.out.print("Nhập mẫu số của phân số thứ " + (i + 1) + ": ");
            int mau = sc.nextInt();
            dsPhanSo[i] = new PhanSo(tu, mau);
        }
        // Tìm phân số lớn nhất trong danh sách phân số trên
        PhanSo max = dsPhanSo[0];
        for (int i = 1; i < n; i++) {
            if (dsPhanSo[i].lonHon(max)) {
                max = dsPhanSo[i];
            }
        }
        System.out.println("Phân số lớn nhất trong danh sách là: ");
        max.hienThi();
        // Tổng của danh sách phân số
        PhanSo sum = dsPhanSo[0];
        for (int i = 1; i < n; i++) {
            sum=sum.cong(dsPhanSo[i]);
        }
        System.out.println("Tổng các phân số trong danh sách là: ");
        sum.hienThi();
        // Sắp xếp danh sách phân số theo thứ tự tăng dần. Em tham khảo được từ Internet
        Arrays.sort(dsPhanSo, (PhanSo ps1, PhanSo ps2) -> {
            double giaTri1 = ps1.giaTriThuc();
            double giaTri2 = ps2.giaTriThuc();

            if (giaTri1 > giaTri2) {
                return 1;
            } else if (giaTri1 < giaTri2) {
                return -1;
            } else {
                return 0;
            }
        });

        // Hiển thị danh sách phân số đã sắp xếp
        System.out.println("Danh sách phân số sau khi sắp xếp:");
        for (PhanSo ps : dsPhanSo) {
            ps.hienThi();
        }
    }
}
