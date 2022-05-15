
package practice03;

import javax.swing.JOptionPane;

public class Practice03 {

    public static void main(String[] args) {
String nama;
String umurString;
String beratbadanString;
String tinggibadanString;
String statusPernikahan;
String alamat;
String pekerjaan;
String gajiString;
String kendaraan;
String warna;

nama = JOptionPane.showInputDialog("Siapa namamu: ");
umurString = JOptionPane.showInputDialog(" Berapa umurmu? ");
int umur = Integer.parseInt(umurString);
beratbadanString = JOptionPane.showInputDialog(" Dengan berat: ");
double beratbadan = Double.parseDouble(beratbadanString);
tinggibadanString = JOptionPane.showInputDialog(" Dengan tinggi ");
int tinggibadan = Integer.parseInt(tinggibadanString);
statusPernikahan = JOptionPane.showInputDialog("Dengan status: ");
alamat = JOptionPane.showInputDialog(" Tinggal di: ");
pekerjaan = JOptionPane.showInputDialog(" Bekerja sebagai: ");
gajiString = JOptionPane.showInputDialog(" gajimu: ");
double gaji = Double.parseDouble(gajiString);
kendaraan = JOptionPane.showInputDialog(" Kendaraan: ");
warna = JOptionPane.showInputDialog(" Warna kesukaan: ");
umur = umur + 1;
beratbadan = beratbadan - 5;
System.out.println(" Perkenalkan Nama Saya " + nama );
System.out.println(" Pada tahun lalu yang Berusia 19 dan sekarang berumur " + umur  );
System.out.println(" Saya memiliki berat 72.0 kg pada bulan lalu dan sekarang turun menjadi  " + beratbadan + 
                          " kg dan memiliki tinggi " + tinggibadan);
System.out.println(" cm. Saya juga mempunyai status yang " + statusPernikahan +" dan saya tinggal di " + alamat +
                          " dan bekerja di Pt. Blabla dan mengambil dibidang " + pekerjaan);
System.out.println( " dengan memperoleh gaji perbulan sebesar " + gaji + " Juta, saya berangkat kerja dengan menggunakan kendaraan " + kendaraan );
System.out.println(" saya yang berwarna " + warna);
}
    
}
