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
public class Diskon {
     public static void main (String []args){
        //untuk mengimput data dari user
        Scanner input=new Scanner(System.in);
       
        // mendeklarasika variabel
        int harga ; // harga
        int jumlah; //jumlah
        int diskon; // diskon
        int total ; //jumlah*harga
        
        System.out.println("Mohon masukan harga barang anda : ");
        harga =input.nextInt();
        System.out.println("Mohaon masykan Jumlah barang anda: ");
        jumlah=input.nextInt();
        total=jumlah*harga;
       
        // Selanjutnya kita buat program diskonnya menggunakan IF else
        if(total>=100000){
            diskon=total*10000/100;
            total=total-diskon;
            System.out.println("anda mendapatkan diskon 10%" );
            System.out.println ("jadi totalnya : "+total);
        }else if(total>= 150000){
            diskon=total*20000/100;
            total=total-diskon;
            System.out.println("anda mendapatkan diskon 20%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if(total>=300000){
            diskon=total*50000/100;
            total=total-diskon;
            System.out.println("anda mendapatkan diskon 10%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if (total<500000){
            diskon=total*75000/100;
            total=total-diskon;
            System.out.println("Maaf anda tidak mendapatkan diskon" );
            System.out.println ("jadi totalnya : "+total);
        }
        }
}
     


