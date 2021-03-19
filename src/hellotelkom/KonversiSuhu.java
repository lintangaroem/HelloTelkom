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
public class KonversiSuhu {
    public static void main (String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("      Konversi Suhu Skuy !!!     ");
        System.out.println("=================================");
        System.out.print("Masukkan derajat suhu (dalam Celcius) : ");
        double suhu = masukan.nextDouble();
        double Reamur, Farenheit, Kelvin;
        Reamur = 0.8*suhu;
        Farenheit = 1.8*suhu + 32;
        Kelvin = suhu + 273;
        
        System.out.println("Reamur : "+Reamur);
        System.out.println("Farenheit : "+Farenheit);
        System.out.println("Kelvin : "+Kelvin);
    }
}
