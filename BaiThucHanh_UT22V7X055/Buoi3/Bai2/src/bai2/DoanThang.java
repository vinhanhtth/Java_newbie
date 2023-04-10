/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import bai1.Diem;

import java.util.Scanner;
/**
 *
 * @author nguyenhieu
 */
public class DoanThang {

    Diem d1, d2;

    DoanThang() {
    }

    DoanThang(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    DoanThang(int ax, int ay, int bx, int by) {
        this.d1 = new Diem(ax, ay);
        this.d2 = new Diem(bx, by);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do cua diem dau tien: ");
        d1 = new Diem();
        d1.nhapDiem();
        System.out.println("Nhap toa do cua diem thu hai: ");
        d2 = new Diem();
        d2.nhapDiem();
    }

    public void hienThi() {
        System.out.print("Doan thang co 2 diem dau mut la: ");
        d1.hienThi();
        System.out.print("va ");
        d2.hienThi();
    }

    public void tinhTien(int dx, int dy) {
        d1.x += dx;
        d1.y += dy;
        d2.x += dx;
        d2.y += dy;
    }

    public double tinhDoDai() {
        return Math.sqrt(Math.pow(d2.x - d1.x, 2) + Math.pow(d2.y - d1.y, 2));
    }

    public double tinhGoc() {
        return Math.atan2(d2.y - d1.y, d2.x - d1.x) * 180 / Math.PI;
    }
}
