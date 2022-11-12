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
public class Lalulintas {
    public static void main(String[] args){
        String lampu;
        Scanner lalulintas = new Scanner(System.in);
        
        System.out.println("Masukkan warna lampu: ");
        lampu = lalulintas.nextLine();
        
        switch (lampu){
            case "merah":
            System.out.println("Berhenti");
            break;
            case "kuning":
            System.out.println("Hati-hati");
            break;
            case "hijau":
            System.out.println("Jalan");
            break;
            default:
            System.out.println("warna salah");
        }
    }
}


