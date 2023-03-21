
package posttest3;


public class dataObat {
    private String Nama_Obat;
    private int Harga_Obat;
    
        public dataObat (String nama_obat,int harga_obat){
        this.Nama_Obat = nama_obat;
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

    public int getHarga_Obat() {
        return Harga_Obat;
    }

    public void setHarga_Obat(int Harga_Obat) {
        this.Harga_Obat = Harga_Obat;
    }
    
    
    
}
