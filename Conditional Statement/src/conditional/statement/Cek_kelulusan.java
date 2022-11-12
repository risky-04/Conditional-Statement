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
public class Cek_kelulusan {
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        String nama;
        // membuat scanner
        Scanner kelulusan = new Scanner(System.in);
        System.out.println("Silahkan Masukkan nama anda: ");
        nama = kelulusan.nextLine();
        
        System.out.println("Berapa nilai anda: ");
        nilai = kelulusan.nextInt();
        // membuat kondisi        
        if(nilai >= 0 && nilai<= 60){
            System.out.println("Selamat Nilai Anda E");
            System.out.println("Maaf " +nama +" Anda Tidak Lulus");
        } else  if(nilai >= 61 && nilai<= 70){
            System.out.println("Selamat Nilai Anda D");
            System.out.println("Maaf " +nama +" Anda Tidak Lulus");
        } else  if(nilai >= 71 && nilai<= 80){
            System.out.println("Selamat Nilai Anda C");
            System.out.println("Selamat " +nama +" Anda Lulus yaa");
        } else  if(nilai >= 81 && nilai<= 90){
            System.out.println("Selamat Nilai Anda B");
            System.out.println("Selamat " +nama +" Anda Lulus yaa");
        } else  if(nilai >= 91 && nilai<= 100){
            System.out.println("Selamat Nilai Anda A");
            System.out.println("Selamat " +nama +" Anda Lulus yaa");
        }
        
    }
    
}


