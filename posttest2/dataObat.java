/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author Asus
 */
public class dataObat {
    private String Nama_Obat;
    private String Jenis_Obat;
    private int Harga_Obat;
    
        public dataObat (String nama_obat, String jenis_obat, int harga_obat){
        this.Nama_Obat = nama_obat;
        this.Jenis_Obat = jenis_obat;
        this.Harga_Obat = harga_obat;
    }

    public dataObat() {
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

    public String getNama_Obat() {
        return Nama_Obat;
    }

    public void setNama_Obat(String Nama_Obat) {
        this.Nama_Obat = Nama_Obat;
    }

    public String getJenis_Obat() {
        return Jenis_Obat;
    }

    public void setJenis_Obat(String Jenis_Obat) {
        this.Jenis_Obat = Jenis_Obat;
    }

    public int getHarga_Obat() {
        return Harga_Obat;
    }

    public void setHarga_Obat(int Harga_Obat) {
        this.Harga_Obat = Harga_Obat;
    }
    
    
    
}
