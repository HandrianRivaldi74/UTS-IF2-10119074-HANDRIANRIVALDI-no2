/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119074.handrianrivaldi.no2;

import java.util.Scanner;

/**
 *
 * @author Acer
 * NAMA : HANDRIAN RIVALDI
 * KELAS : PBOIF2
 * NIM : 10119074
 */
public class UTSIF210119074HANDRIANRIVALDINo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("========Program Penarikan Uang=========");
        System.out.print ("Masukkan Saldo Awal  : ");
        int saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah uang yang diambil  : ");
        int jumlah = scanner.nextInt();
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
    
}
