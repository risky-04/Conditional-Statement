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
public class Bioskop {
    public static void main(String[] args) {
        int umur;
    Scanner Bioskop = new Scanner(System.in);
    
    System.out.println("Silahkan masukkan umur anda: ");
    umur = Bioskop.nextInt();
        //membuat kondisi
      switch(umur){
        case 18:
      System.out.println("boleh");
        break;
         case 19:
       System.out.println("boleh");
        break;
          case 20:
        System.out.println("boleh");
         break;
           default:
        System.out.println("tidak boleh yaa");
        }
    }
}


