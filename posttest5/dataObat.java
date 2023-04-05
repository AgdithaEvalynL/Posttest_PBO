/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


public abstract class  dataObat {
    private String Nama_Obat;
    private int Harga_Obat;
     protected  String exp;
    
    
        public dataObat (String nama_obat,int harga_obat, String exp){
        this.Nama_Obat = nama_obat;
        this.Harga_Obat = harga_obat;
        this.exp = exp;
   
    }

    
    void tertambah(String Nama_Obat){
        System.out.println("\n"+ Nama_Obat + "TELAH DITAMBAHKAN");
    }
    
    //overide
    void terupdate(){
        System.out.println("\nDATA  TELAH UPDATE ");
    }
    
    void terhapus(int indeks){
        System.out.println("\nDATA dengan"+indeks+"TELAH TERHAPUS");
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
       public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
    

 public  abstract String tglExp();
}
