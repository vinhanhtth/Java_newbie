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
public class Diem {
    public int x, y;

    // Ham khoi tao mac dinh
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    // Ham khoi tao co tham so
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Nhap toa do diem tu ban phim
    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        this.x = scanner.nextInt();
        System.out.print("Nhap toa do y: ");
        this.y = scanner.nextInt();
    }

    // Hien thi toa do diem
    public void hienThi() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    // Doi diem di dx don vi theo hoanh do va dy don vi theo tung do
    public void doiDiem(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Tra ve gia tri hoanh do cua diem
    public int giaTriX() {
        return this.x;
    }

    // Tra ve gia tri tung do cua diem
    public int giaTriY() {
        return this.y;
    }

    // Tinh khoang cach tu diem den goc toa do
    public float khoangCach() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    // Tinh khoang cach tu diem den diem khac d
    public float khoangCach(Diem d) {
        return (float) Math.sqrt((this.x - d.x) * (this.x - d.x) + (this.y - d.y) * (this.y - d.y));
    }
}
