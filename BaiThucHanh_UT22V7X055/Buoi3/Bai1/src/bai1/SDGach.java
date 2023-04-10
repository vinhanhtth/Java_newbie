/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author nguyenhieu
 */
public class SDGach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn nhập bao nhiêu hộp gạch: ");
        int n = sc.nextInt();
        //Nhập vào danh sách các hộp gạch
        System.out.println("Nhập vào thông tin các hộp gạch ");
        Gach[] ds = new Gach[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Hộp gạch thứ " + (i + 1) + ":");
            ds[i] = new Gach();
            ds[i].nhapgach();
        }
        //Xuất danh sách các hộp gạch
        System.out.println("*********************************");
        System.out.println("Danh sách gạch đang có");
        System.out.println("STT   Mã số   Màu gạch  Số lượng viên/thùng   Dài   Rộng   Giá bán");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1);
            ds[i].xuatgach();
        }
        // Tìm loại gạch có chi phí lót thấp nhất
        int index = 0;
        float minChiPhi = ds[0].tinhGiaTienTrenDienTich();
        for (int i = 1; i < n; i++) {
            float chiPhi = ds[i].tinhGiaTienTrenDienTich();
            if (chiPhi < minChiPhi) {
                index = i;
                minChiPhi = chiPhi;
            }
        }
        System.out.println("\nLoại gạch có chi phí lót thấp nhất là gạch thứ " + (index + 1));

        // Tính chi phí mua gạch để lót nền có diện tích là 20m x 5m
        int chieuDai = 20;
        int chieuNgang = 5;
        float tongChiPhi = 0;
        for (int i = 0; i < n; i++) {
            int soLuongHop = ds[i].soLuongHop(chieuDai, chieuNgang);
            long giaBanLe = (long) ds[i].giaBanLe();
            float chiPhi = soLuongHop * giaBanLe;
            tongChiPhi += chiPhi;
        }
        System.out.printf("\nTổng chi phí để lót nền 20m x 5m là: %.2f đồng", tongChiPhi);
    }
}
