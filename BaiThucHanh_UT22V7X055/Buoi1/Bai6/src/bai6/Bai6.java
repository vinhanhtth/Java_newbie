/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;

public class Bai6 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int n;
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Sai định dạng, vui lòng nhập lại!");
            return;
        }
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
        System.out.println("Số " + n + " trong hệ nhị phân là: " + Integer.toBinaryString (n));
    }

}
