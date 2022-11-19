/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rifki Maulana
 */
class SepedaMotor {
    private String merk, tipe;
    private int tangki;
    private long harga;
    
    // Input Merk, Tipe, Tangki, Harga
    public void inputMerk (String merk) {
        this.merk = merk;
    }
    public void inputTipe (String tipe) {
        this.merk = tipe;
    }
    public void inputTangki (int tangki) {
        this.tangki = tangki;
    }
    public void inputHarga (long harga) {
        this.harga = harga;
    }
    
    // Tampil Merk, Tipe, Tangki, Harga
    public String tampilMerk() {
        return merk;
    }
    public String tampilTipe() {
        return tipe;
    }
    public int tampilTangki() {
        return tangki;
    }
    public long tampilHarga() {
        return harga;
    }
    
    public static void main(String args[]) {
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("Yamaha");
        motor.inputTipe("MX - 125 cc");
        motor.inputTangki(4);
        motor.inputHarga(23000000);
        
        System.out.println("======================");
        System.out.println("Rincian Motor : ");
        System.out.println("======================");
        System.out.println("Merk   : " + motor.tampilMerk());
        System.out.println("Tipe   : " + motor.tampilTipe());
        System.out.println("Tangki : " + motor.tampilTangki());
        System.out.println("Harga  : " + motor.tampilHarga());
        System.out.println("======================");
        
    }
    }

