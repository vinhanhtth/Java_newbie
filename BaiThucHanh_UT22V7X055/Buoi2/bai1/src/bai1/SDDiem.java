/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author nguyenhieu
 */
public class SDDiem {
    public static void main(String[] args) {
        // Tao diem A voi toa do (3,4) va hien thi toa do diem A
        Diem A = new Diem(3, 4);
        System.out.print("Toa do diem A: ");
        A.hienThi();

        // Tao diem B voi gia tri nhap tu ban phim va hien thi toa do diem B
        Diem B = new Diem();
        System.out.println("Nhap toa do diem B: ");
        B.nhapDiem();
        System.out.print("Toa do diem B: ");
        B.hienThi();

        // Tao diem C la diem doi xung cua diem B qua goc toa do va hien thi toa do diem C
        Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
        System.out.print("Toa do diem C: ");
        C.hienThi();

        // Hien thi khoang cach tu diem B den tam O
        System.out.println("Khoang cach tu diem B den tam O: " + B.khoangCach());

        // Hien thi khoang cach tu diem A den diem B
        System.out.println("Khoang cach tu diem A den diem B: " + A.khoangCach(B));
    }
}