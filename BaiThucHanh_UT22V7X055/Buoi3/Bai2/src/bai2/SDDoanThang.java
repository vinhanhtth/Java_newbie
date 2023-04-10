/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import bai1.Diem;

/**
 *
 * @author nguyenhieu
 */
public class SDDoanThang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diem A = new Diem(2, 5);
        Diem B = new Diem(20, 35);
        DoanThang AB = new DoanThang(A, B);
        System.out.println("AB ban dau:");
        AB.hienThi();
        AB.tinhTien(5, 3);
        System.out.println("AB sau khi tinh tien:");
        AB.hienThi();
        System.out.println("Nhap toa do cua diem dau tien cua doan thang CD: ");
        Diem C = new Diem();
        C.nhapDiem();
        System.out.println("Nhap toa do cua diem thu hai cua doan thang CD: ");
        Diem D = new Diem();
        D.nhapDiem();
        DoanThang CD = new DoanThang(C, D);
        System.out.println("Do dai cua CD la: " + CD.tinhDoDai());
        System.out.println("Goc cua CD voi truc hoanh la: " + CD.tinhGoc());
    }
    
}
