/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan35;
import java.util.Scanner;
/**
 *
 * @author Naufal Asha
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        karyawan.setGaji(scanner.nextDouble());
        
        System.out.print("Status Anda? : ");
        karyawan.setStatus(scanner.next());
        
        karyawan.tampilGaji();
    }
    
}
