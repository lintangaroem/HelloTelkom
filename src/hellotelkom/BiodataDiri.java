/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellotelkom;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class BiodataDiri {
    public static void main (String[]args){
        Scanner masukan = new Scanner(System.in);
        String nama, tempatLahir, tanggalLahir, jenisKelamin, alamat, motto;
        
        nama = "Lintang Arum Sari";
        tempatLahir = "Malang";
        tanggalLahir = "16 Juli 2004";
        jenisKelamin = "Perempuan";
        alamat = "Griya Shanta G-301";
        motto = "Lakukan yang terbaik untuk mendapat ridha Allah swt";
        
        System.out.println("Nama : "+nama);
        System.out.print("NIS : ");
        double nis = masukan.nextDouble();
        System.out.println("Tempat Lahir : "+tempatLahir);
        System.out.println("Tanggal Lahir : "+tanggalLahir);     
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Alamat di Malang : "+alamat);
        System.out.println("Motto Hidup : "+motto);
    }
}
