/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai9;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;

public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai: ");
        String s2 = sc.nextLine();
        if (s1.compareTo(s2)==0) {
            System.out.println("Chuỗi " + s1 + " bằng chuỗi " + s2);
        } else {
            System.out.println("Chuỗi " + s1 + " không bằng chuỗi " + s2);
        }
    }
}
