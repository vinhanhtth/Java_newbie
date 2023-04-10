/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author nguyenhieu
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tu, int mau) {
        tuSo = tu;
        mauSo = mau;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Tử số: ");
            tuSo = sc.nextInt();
            System.out.print("Mẫu số: ");
            mauSo = sc.nextInt();
            if (mauSo == 0) {
                System.out.println("Mẫu số không hợp lệ, vui lòng thử lại.");
            }
        } while (mauSo == 0);
    }

    public void hienThi() {
        if (tuSo == 0) {
            System.out.println("0");
        } else if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }
    public PhanSo giaTriNghichDao() {
        PhanSo p = new PhanSo(mauSo, tuSo);
        return p;
    }

    public double giaTriThuc() {
        return (double) tuSo / mauSo;
    }

    public boolean lonHon(PhanSo a) {
        int temp = tuSo * a.mauSo - mauSo * a.tuSo;
        return temp > 0;
    }

    public PhanSo cong(PhanSo a) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo * a.mauSo + mauSo * a.tuSo;
        p.mauSo = mauSo * a.mauSo;
        return p;
    }

    public PhanSo tru(PhanSo a) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo * a.mauSo - mauSo * a.tuSo;
        p.mauSo = mauSo * a.mauSo;
        return p;
    }

    public PhanSo nhan(PhanSo a) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo * a.tuSo;
        p.mauSo = mauSo * a.mauSo;
        return p;
    }

    public PhanSo chia(PhanSo a) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo * a.mauSo;
        p.mauSo = mauSo * a.tuSo;
        return p;
    }

    public PhanSo cong(int n) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo + n * mauSo;
        p.mauSo = mauSo;
        return p;
    }

    public PhanSo tru(int n) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo - n * mauSo;
        p.mauSo = mauSo;
        return p;
    }
    public PhanSo nhan(int n) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo*n;
        p.mauSo = mauSo;
        return p;
    }

    public PhanSo chia(int n) {
        PhanSo p = new PhanSo();
        p.tuSo = tuSo;
        p.mauSo = mauSo * n;
        return p;
    }
    
}