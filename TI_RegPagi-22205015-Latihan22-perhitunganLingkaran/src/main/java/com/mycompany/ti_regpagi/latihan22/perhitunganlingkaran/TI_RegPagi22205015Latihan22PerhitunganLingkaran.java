/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang perhitungan lingkaran
 * @author 62895
 */
public class TI_RegPagi22205015Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 22===");
            Scanner scanner = new Scanner(System.in);
            
//            inisialisasi vaariable
            double jariJari, luas,keliling, phi;
            phi = 3.14;
            
            System.out.print("Masukan nilai diameter lingkaran: ");
            double diameter = scanner.nextInt();
            
//            looping untuk menghitung jari-jari, luas dan keliling
            while (diameter <= 0) {
                System.out.println("nilai diameter harus angka");
                System.out.println("Masukan kembali Nilai diameter lingkaran: ");
                diameter = scanner.nextDouble();
            }
//                hitung jari-jari, luas dan keliling
            jariJari = diameter/2;
            luas = phi*jariJari*jariJari;
            keliling = 2*phi*jariJari;
                
            System.out.println("\nHASIL PERHITUNGAN");
//                cetak hasil
            System.out.println("Jari-jari lingkaran: "+jariJari);
            System.out.println("Luas lingkaran: "+luas);
            System.out.println("Keliling lingkaran: "+keliling);
    }
}
