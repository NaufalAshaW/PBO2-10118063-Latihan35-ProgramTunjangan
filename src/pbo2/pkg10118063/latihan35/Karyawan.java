/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan35;

/**
 *
 * @author Naufal Asha
 */
public class Karyawan {
    private String status;
    private double gaji;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    private double hitungTunjangan(){
        return status.equals("Menikah") ? gaji * 0.35 :0;
    }
    
    private double hitungTotalGaji(){
        return gaji+hitungTunjangan();
    }
    
    public void tampilGaji(){
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok\t\t: Rp." + gaji);
        System.out.println("Tunjangan\t\t: Rp." + hitungTunjangan());
        System.out.println("Total Gaji\t\t: Rp." +hitungTotalGaji());
        System.out.println("(Developed by Naufal Asha)");
    }
}
