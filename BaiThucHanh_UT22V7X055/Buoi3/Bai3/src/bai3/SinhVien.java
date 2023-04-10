/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nguyenhieu
 */
public class SinhVien {

    private String maSV;
    String hoTen;
    private Date ngaySinh;
    private int soLuongHP;
    private String[] tenHP;
    private String[] diemHP;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, Date ngaySinh, int soLuongHP, String[] tenHP, String[] diemHP) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soLuongHP = soLuongHP;
        this.tenHP = tenHP;
        this.diemHP = diemHP;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        this.maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        String strNgaySinh = sc.nextLine();
        // Chuyen chuoi ngay sinh sang kieu Date
        // Bo qua phan xu ly ngoai le
        this.ngaySinh = new Date(strNgaySinh);
        System.out.print("Nhap so luong hoc phan dang ky: ");
        this.soLuongHP = sc.nextInt();
        // Tao mang tenHP va diemHP theo soLuongHP
        this.tenHP = new String[this.soLuongHP];
        this.diemHP = new String[this.soLuongHP];
        // Nhap ten hoc phan va diem cho tung hoc phan
        for (int i = 0; i < this.soLuongHP; i++) {
            sc.nextLine(); // Bo qua ky tu xuong dong
            System.out.print("Nhap ten hoc phan thu " + (i + 1) + ": ");
            this.tenHP[i] = sc.nextLine();
            System.out.print("Nhap diem hoc phan thu " + (i + 1) + ": ");
            this.diemHP[i] = sc.nextLine();
        }
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        // Nhap ten hoc phan can cap nhat diem
        System.out.print("Nhap ten hoc phan can nhap diem: ");
        String tenHocPhan = sc.nextLine();
        // Tim vi tri cua ten hoc phan trong mang tenHP
        int viTri = -1;
        for (int i = 0; i < this.soLuongHP; i++) {
            if (this.tenHP[i].equals(tenHocPhan)) {
                viTri = i;
                break;
            }
        }
        // Neu tim thay hoc phan, nhap diem cho hoc phan
        if (viTri != -1) {
            System.out.print("Nhap diem hoc phan: ");
            this.diemHP[viTri] = sc.nextLine();
            System.out.println("Cap nhat diem hoc phan thanh cong!");
        } else {
            System.out.println("Khong tim thay hoc phan " + tenHocPhan);
        }
    }

    @Override
    public String toString() {
        String info = "MSSV: " + this.maSV + "\n"
                + "Họ tên: " + this.hoTen + "\n"
                + "Ngày sinh: " + this.ngaySinh + "\n"
                + "Số lượng học phần đăng ký: " + this.soLuongHP + "\n"
                + "Tên các học phần đã đăng ký: \n";
        for (int i = 0; i < soLuongHP; i++) {
            info += tenHP[i] + " ";
        }
        info += "\nĐiểm của các học phần: ";
        for (int i = 0; i < soLuongHP; i++) {
            info += diemHP[i] + " ";
        }

        return info;
    }

    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        for (int i = 0; i < soLuongHP; i++) {
            switch (diemHP[i]) {
                case "A+":
                    tongDiem += 4.0;
                    break;
                case "A":
                    tongDiem += 3.5;
                    break;
                case "B+":
                    tongDiem += 3.0;
                    break;
                case "B":
                    tongDiem += 2.5;
                    break;
                case "C+":
                    tongDiem += 2.0;
                    break;
                case "C":
                    tongDiem += 1.5;
                    break;
                case "D+":
                    tongDiem += 1.0;
                    break;
                case "D":
                    tongDiem += 0.5;
                    break;
                default:
                    tongDiem += 0.0;
                    break;
            }
        }
        return tongDiem / soLuongHP;
    }

    public void dangKyHP(String HP) {
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(tenHP));
        arrayList1.add(HP);
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(diemHP));
        arrayList2.add("Chưa có điểm");
        soLuongHP++;
        this.tenHP = new String[soLuongHP];
        arrayList1.toArray(tenHP);
        this.diemHP = new String[soLuongHP];
        arrayList2.toArray(diemHP);
    }

    public void xoaHP(String HP) {
        int index = -1;
        for (int i = 0; i < soLuongHP; i++) {
            if (tenHP[i].equals(HP)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Học phần " + HP + " không tồn tại trong danh sách đăng ký của sinh viên.");
        } else {
            for (int i = index; i < soLuongHP - 1; i++) {
                tenHP[i] = tenHP[i + 1];
                diemHP[i] = diemHP[i + 1];
            }
            soLuongHP--;
            tenHP[soLuongHP] = null;
            diemHP[soLuongHP] = null;
            System.out.println("Đã xóa học phần " + HP + " khỏi danh sách đăng ký của sinh viên.");
        }
    }

}
