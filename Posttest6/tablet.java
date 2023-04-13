
package Posttest6;


public final class tablet extends dataObat {
    private String id_obat_tablet;
    private  final String takaran_tablet = "takaran dalam mg";
    
    public tablet (String nama_obat, int harga_obat,String exp, String nama_pem,String nomor_ijin, String id_tablet){
        super(nama_obat,harga_obat,exp,nama_pem,nomor_ijin);
        this.id_obat_tablet = id_tablet;
    }

    public String getId_obat_tablet() {
        return id_obat_tablet;
    }

    public void setId_obat_tablet(String id_obat_tablet) {
        this.id_obat_tablet = id_obat_tablet;
    }

    public String getTakaran_tablet() {
        return takaran_tablet;
    }

    public void setTakaran_tablet(String takaran_tablet) {
      
    }
    
    @Override
       void tertambah(String Nama_Obat){
        System.out.println("-----------------------------------");
        System.out.println(" "+ Nama_Obat +" "+ "TELAH DITAMBAHKAN");
        System.out.println("-----------------------------------");
    }
    
    
    
    @Override 
    void terhapus(int indeks){
        System.out.println("-----------------------------------");
        System.out.println("DATA dengan"+ indeks +"TELAH TERHAPUS");
        System.out.println("-----------------------------------");
    }

    @Override
    public final String tglExp() {
    return exp;
    }

    @Override
    public String pemilik_ijinEdar() {
    return nama_pem;
    }
    @Override
    public  String nomor_ijinEdar(){
    return nomor_ijin;
} 
   

   


}
