/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117091.latihan3.input;

import java.util.Scanner;

/* @author
* NAMA  : DIDA HANDIAN
* KELAS : PBO3
* NIM   : 10117091
* Deskripsi Program : Memasukkan Nilai
*/

public class PBO310117091Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
