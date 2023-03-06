/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author Asus
 */
public class dataObat {
    String Nama_Obat;
    String Jenis_Obat;
    int Harga_Obat;
    
        public dataObat (String nama_obat, String jenis_obat, int harga_obat){
        this.Nama_Obat = nama_obat;
        this.Jenis_Obat = jenis_obat;
        this.Harga_Obat = harga_obat;
    }
        

    void tertambah(){
        System.out.println("\nDATA TELAH DITAMBAHKAN");
    }
    
    void terupdate(){
        System.out.println("\nDATA TELAH UPDATE ");
    }
    
    void terhapus(){
        System.out.println("\nDATA TELAH TERHAPUS");
    }
}



