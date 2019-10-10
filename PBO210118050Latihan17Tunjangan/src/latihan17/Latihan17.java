/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17;

import java.util.Scanner;
/**
 *
 * NAMA :Muhamad Rizky Permana
 * KELAS : IF-2
 * NIM : 10118050
 * Deskripsi Program : Program Tunjangan
 */
public class Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
      Scanner input = new Scanner(System.in);
      String status;
      int gaji = 0   ;
       double tunjangan = 0.35 ;
       double totalgaji,totaltunjangan;
        
        
        System.out.println("============Program Tunjangan==============" + "\n");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp."+"\n");
        gaji = input.nextInt();
        System.out.print("Status anda? (Menikah/Belum) :");
        status = input.next();
       
        
      
        
        
       
       
        
        System.out.println("============Hasil perhitungan gaji anda==============" );
        
        System.out.println("Gaji Pokok : Rp. " + gaji );
        
        if (status.equals("Menikah")){
                totaltunjangan = gaji * tunjangan;
              System.out.println("Tunjangan : Rp. " + totaltunjangan   );
               totalgaji = gaji + totaltunjangan;
              System.out.println("Total Gaji : Rp. " + totalgaji);
            
        }
       
         
         
        
         
        
        
                 
    }
    
}

