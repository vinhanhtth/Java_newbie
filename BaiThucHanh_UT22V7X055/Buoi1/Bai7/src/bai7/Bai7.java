/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;

/**
 *
 * @author nguyenhieu
 */
import java.util.Scanner;

public class Bai7 {

    public static String Name(String fullName) {
        int index = fullName.lastIndexOf(" ");
        if (index == -1) {
            return fullName;
        } else {
            return fullName.substring(index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        String lastName = Name(fullName);
        System.out.println("Tên của bạn là: " + lastName);
    }
}
