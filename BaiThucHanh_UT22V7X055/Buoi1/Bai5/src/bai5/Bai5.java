/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // Nhập hệ số của phương trình
        System.out.print("a= ");
        double a = sc.nextDouble();
        System.out.print("b= ");
        double b = sc.nextDouble();
        System.out.print("c= ");
        double c = sc.nextDouble();
        solve2(a, b, c);

    }
    public static void solve1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Phương trình có nghiệm x = %f\n", x);
        }
    }
    public static void solve2(double a, double b, double c) {
        if (a == 0) {
            solve1(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép x = %f\n.", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %f, x2 = %f\n.", x1, x2);
            }
        }
    }

}
