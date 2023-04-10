/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author nguyenhieu
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nông trại của bạn có bao nhiêu con vật: ");
        int n = scanner.nextInt();
        scanner.nextLine();//Tránh lỗi bỏ qua dòng nhập String kế tiếp
        ConVat[] conVatArr = new ConVat[n];
        // Nhập thông tin cho các con vật
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin con vat thu " + (i + 1) + ":");
            System.out.print("Loai: ");
            String loai = scanner.nextLine();
            System.out.print("Mau long: ");
            String mauLong = scanner.nextLine();
            System.out.print("Can nang: ");
            double canNang = scanner.nextDouble();
            scanner.nextLine();
            if (loai.equalsIgnoreCase("bo")) {
                conVatArr[i] = new Bo(mauLong, canNang);
            } else if (loai.equalsIgnoreCase("heo")) {
                conVatArr[i] = new Heo(mauLong, canNang);
            } else if (loai.equalsIgnoreCase("de")) {
                conVatArr[i] = new De(mauLong, canNang);
            } else if (loai.equalsIgnoreCase("ga")) {
                conVatArr[i] = new Ga(mauLong, canNang);
            } else {
                System.out.println("Trang trại không có nuôi con này. Nhập lại");
                i--;
            }
        }
        // Cho các con vật kêu
        for (int i = 0; i < n; i++) {
            System.out.print("Con vat thu " + (i + 1) + " keu: ");
            conVatArr[i].Keu();
        }
    }
}
