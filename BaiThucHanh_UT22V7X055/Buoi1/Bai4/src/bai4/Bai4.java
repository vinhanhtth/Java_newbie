/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;

public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;
        boolean check = true;
        do {
            try {
                System.out.println("Nhập vào số nguyên dương a: ");
                a = Integer.parseInt(sc.next());
                System.out.println("Nhập vào số nguyên dương b: ");
                b = Integer.parseInt(sc.next());
                check = false;
                } catch (NumberFormatException e)  {
                System.out.println("Nhập sai định dạng số, vui lòng nhập lại!");
            }
        } while (check==true);
        System.out.println("Tổng của " + a + " và " + b + " là: " + (a+b));

    }

}