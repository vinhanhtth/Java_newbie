/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;
/**
 *
 * @author nguyenhieu
 */

public class SDDate {
    public static void main(String[] args) {
        // Kiểm tra hàm xây dựng
        Date date1 = new Date();
        System.out.print("Kiểm tra hiển thị ngày mặc định: ");
        date1.displayDate();          
        // Kiểm tra nhập và in ra ngày
        Date date2 = new Date();
        System.out.println("Nhập vào ngày muốn kiểm tra: ");
        date2.inputDate();
        System.out.print("Ngày vừa nhập: ");
        date2.displayDate();
        // Kiểm tra ngày kế tiếp
        Date nextDay = date2.nextDay();
        System.out.print("Ngày kế tiếp là: ");
        nextDay.displayDate();
        // Kiểm tra cộng thêm ngày
        Date addedDate = date2.addDays(20);
        System.out.print("20 ngày kế tiếp là ngày: ");
        addedDate.displayDate();
    }
}
