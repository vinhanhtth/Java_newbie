/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        System.out.println("Độ dài của danh sách là: ");
        int N=scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Nhập số thực thứ " + i + ": ");
            if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                sum += num;
                if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại.");
                i--;
                scanner.next();
            }
        }
        System.out.println("Tổng của danh sách là: " + sum);
        System.out.println("Số lớn nhất trong danh sách là: " + max);
    }
}
