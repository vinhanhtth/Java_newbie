/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai8;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;
public class Bai8 {
    public static void input(int[] a, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " là: ");
            a[i] = sc.nextInt();
        }
    }
    public static void sx(int[]a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tg = a[i];
                    a[i] = a[j];                    
                    a[j] = tg;
                }
            }
        }
    }
    public  static int check (int []a, int x) {
        int count = 0;
        for (int i : a) {
            if (i == x) {
                count++;
            }
        }
        return count;
    }
    public static void output(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của dãy số n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("--------------------------");
        input(a, n, sc);
        System.out.print("\nNhập số nguyên cần kiểm tra: ");
        int x = sc.nextInt();
        System.out.println("\nSố lần xuất hiện của số "+x+" trong dãy là: "+check (a,x));
        System.out.println("\nDãy số sau khi sắp xếp tăng dần: ");
        sx(a, n);
        output(a, n);
        sc.close();
    }
}

