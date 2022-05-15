/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputan;

import javax.swing.JOptionPane;

public class Inputan {

//    public static void main(String[] args) {
//     int bill_1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan 1: "));
//    int bill_2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan 2: "));
//    int c = bill_1 + bill_2;
//        System.out.println("Hasil penjumlahan:  "+ c );
//    }
 public static void main(String[] args){
    String [] namaHewan = {"Kucing","Kelinci","Kancil","Kelelawar" };
    String hewanKesukaan = (String) JOptionPane.showInputDialog(null, "Pilih hewan kesukaan anda","Pilihan",
                                                                                4,null,namaHewan,namaHewan[4]);
/*JOptionPane.showMessageDialog(null , " Hewan Kesukaan kamu: " + hewanKesukaan , " judul " , 0;*/
}
}
