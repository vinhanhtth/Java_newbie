/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author nguyenhieu
 */
public class Gach {

    protected String maso;
    protected String mau;
    protected int slvien;
    protected int dai;
    protected int rong;
    protected long gia;

    public Gach() {
        //Hàm xây dựng mặc nhiên
    }

    public Gach(String maso, String mau, int slvien, int dai, int rong, long gia) {
        try {
            this.maso = maso;
            this.mau = mau;
            this.slvien = slvien;
            this.dai = dai;
            this.rong = rong;
            this.gia = gia;
        } catch (NumberFormatException e) {
            System.out.print("Thông tin nhập vào không hợp lệ" + e);
        }
    }

    public void nhapgach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã số hộp gạch: ");
        this.maso = sc.nextLine();
        System.out.print("Màu gạch: ");
        this.mau = sc.nextLine();
        System.out.print("Số lượng viên gạch mỗi thùng: ");
        this.slvien = sc.nextInt();
        System.out.print("Chiều dài viên gạch (cm): ");
        this.dai = sc.nextInt();
        System.out.print("Chiều rộng viên gạch (cm): ");
        this.rong = sc.nextInt();
        System.out.print("Giá bán: ");
        this.gia = sc.nextLong();
    }

    public void xuatgach() {
        System.out.print("      " + this.maso);
        System.out.print("      " + this.mau);
        System.out.print("              " + this.slvien);
        System.out.print("          " + this.dai);
        System.out.print("      " + this.rong);
        System.out.print("     " + this.gia);
        System.out.println();
    }

    public float giaBanLe() {
        return (float) (this.gia / this.slvien * 1.2);
    }

    public float dienTichNenToiDa() {
        return (float) (10000 / (this.dai * this.rong));
    }

    public int soLuongHop(int D, int N) {
        int dienTichNen = D * N;
        int soLuongHop = (int) Math.ceil((double) dienTichNen / dienTichNenToiDa());
        return soLuongHop;
    }

    public float tinhGiaTienTrenDienTich() {
        float giaTien = giaBanLe();
        float dienTich = this.dai * this.rong;
        return giaTien / dienTich;
    }
}
