/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author nguyenhieu
 */
// Lớp cha ConVat
class ConVat {
    String loai;
    String mauLong;
    double canNang;
    public ConVat (){
    }
    public ConVat(String loai, String mauLong, double canNang) {
        this.loai = loai;
        this.mauLong = mauLong;
        this.canNang = canNang;
    }
    
    public void Keu() {
        System.out.println("Con vat keu");
    }
}
