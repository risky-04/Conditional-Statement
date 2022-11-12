/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.statement;
 import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Kendaraan {
    public static void main(String[] args){
        int penumpang;
        Scanner kendaraan = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah penumpang: ");
        penumpang = kendaraan.nextInt();
        
        switch(penumpang){
            case 1:
            System.out.println("sepeda ontel");
            break;
            case 2:
            System.out.println("sepeda motor");
            break;
            case 4:
            System.out.println("mobil");
            break;
            case 50:
            System.out.println("Bis");
            break;
            default:
            System.out.println("Kereta/pesawat");
        }
    }
}


