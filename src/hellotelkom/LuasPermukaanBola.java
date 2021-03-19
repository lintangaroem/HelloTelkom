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
public class LuasPermukaanBola {
    public static void main (String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("  Hitung Luas Permukaan Bola  ");
        System.out.println("===============================");
        System.out.print("Masukkan jari-jari bola : ");
        double radius = masukan.nextDouble();
        double phi = 3.14;
        double hasil = 4*phi*radius*radius;
        System.out.print("Luas Permkaan Bola : "+hasil);
    }
}
