/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author nguyenhieu
 */
class Heo extends ConVat {
    public Heo(String mauLong, double canNang) {
        super("Heo", mauLong, canNang);
    }
    
    @Override
    public void Keu() {
        System.out.println("Heo keu: Éc éc");
    }
}