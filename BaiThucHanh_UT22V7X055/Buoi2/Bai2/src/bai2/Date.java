/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    // Hàm xây dựng mặc nhiên
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    // Hàm xây dựng có tham số
    public Date(int day, int month, int year) {
        if (isValid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Ngày không hợp lệ!");
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    // Hiển thị ngày
    public void displayDate() {
        System.out.printf("%02d/%02d/%4d\n", this.day, this.month, this.year);
    }

    // Nhập ngày
    public void inputDate() {
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        boolean isValid = false;
        do {
            System.out.print("Ngày: ");
            day = sc.nextInt();
            System.out.print("Tháng: ");
            month = sc.nextInt();
            System.out.print("Năm: ");
            year = sc.nextInt();
            isValid = isValid(day, month, year);
            if (!isValid) {
                System.out.println("Ngày không hợp lệ!");
            }
        } while (!isValid);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Kiểm tra hợp lệ
    public boolean isValid(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    // Xác định số ngày trong tháng
    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Kiểm tra năm nhuận
    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    // Tính ngày kế tiếp
    public Date nextDay() {
        int nextDay = this.day + 1;
        int nextMonth = this.month;
        int nextYear = this.year;
        if (nextDay > getDaysInMonth(nextMonth, nextYear)) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }
        return new Date(nextDay, nextMonth, nextYear);
    }

    // Thêm n ngày
    public Date addDays(int n) {
        Date result = new Date(this.day, this.month, this.year);
        for (int i = 1; i <= n; i++) {
            result = result.nextDay();
        }
        return result;
    }
}

   