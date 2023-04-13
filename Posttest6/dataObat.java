/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest6;

import java.util.Scanner;


public abstract class  dataObat implements obat{
    private String Nama_Obat;
    private int Harga_Obat;
    protected  String exp;
    protected  String nama_pem;
    protected  String nomor_ijin;
    String komoditi;
    
        public dataObat (String nama_obat,int harga_obat, String exp, String nama_pem,String nomor_ijin){
        this.Nama_Obat = nama_obat;
        this.Harga_Obat = harga_obat;
        this.exp = exp;
        this.nama_pem = nama_pem;
        this.nomor_ijin = nomor_ijin;
   
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
    public String getNama_pemilik() {
        return nama_pem;
    }

    public void setNama_pemilik(String nama_pem) {
        this.nama_pem = nama_pem;
    }
    
    public String getNomor_ijin() {
        return nomor_ijin;
    }

    public void setNomor_ijin(String nomor_ijin) {
        this.nomor_ijin = nomor_ijin;
    }

    public static String createKomoditi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama komoditi: ");
        String komoditi = input.nextLine();
        return  komoditi;
    }



    @Override
 public  abstract String tglExp();
    @Override
 public  String pemilik_ijinEdar(){
    return getNama_pemilik();
}
    @Override
 public  String nomor_ijinEdar(){
    return getNomor_ijin();
}
}

