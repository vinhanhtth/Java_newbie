/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nguyenhieu
 */
public class SDSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tạo sinh viên a
        SinhVien a = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên a:");
        a.nhapThongTin();
        a.dangKyHP("LTHDT");
        System.out.println("Thông tin sinh viên a:");
        System.out.println(a.toString());
        // Tạo danh sách sinh viên
        System.out.println("Nhập số lượng sinh viên trong danh sách:");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<SinhVien> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + ":");
            sv.nhapThongTin();
            danhSach.add(sv);
        }
        // Tìm sinh viên có điểm trung bình cao nhất lớp
        SinhVien svMaxDiemTB = danhSach.get(0);
        for (SinhVien sv : danhSach) {
            if (sv.tinhDiemTrungBinh() > svMaxDiemTB.tinhDiemTrungBinh()) {
                svMaxDiemTB = sv;
            }
        }
        System.out.println("Sinh viên có điểm trung bình cao nhất lớp là:");
        System.out.println(svMaxDiemTB.toString());

        // Hiển thị danh sách sinh viên theo thứ tự Alphabet của Tên
        Collections.sort(danhSach, (SinhVien sv1, SinhVien sv2) -> {
            return sv1.hoTen.compareTo(sv2.hoTen);
        });
        System.out.println("Danh sách sinh viên theo thứ tự Alphabet của Tên:");
        for (SinhVien sv : danhSach) {
            System.out.println(sv.toString());
        }
    }
    
}
