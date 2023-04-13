
package Posttest6;


public final class syrup extends dataObat{

    private String id_obat_syrup;
    private final String takaran = "takaran dalam ml";
    
    public syrup (String nama_obat, int harga_obat, String exp, String nama_pem,String nomor_ijin,String id_syrup){
        super(nama_obat,harga_obat,exp,nama_pem, nomor_ijin);
        this.id_obat_syrup = id_syrup;
       

    }
    

    public String getId_obat_syrup() {
        return id_obat_syrup;
    }

    public void setId_obat_syrup(String id_obat_syrup) {
        this.id_obat_syrup = id_obat_syrup;
    }

    public String getTakaran() {
        return takaran;
    }

    public void setTakaran(String ml) {
     
    }
    
    
    
    @Override
    void tertambah(String Nama_Obat){
        System.out.println("-----------------------------------");
        System.out.println(Nama_Obat+ " " + "TELAH DITAMBAHKAN");
        System.out.println("-----------------------------------");
    }
    
    
    @Override
    void terhapus(int indeks){
        System.out.println("-----------------------------------");
        System.out.println("DATA KE "+ indeks +" TELAH TERHAPUS");
        System.out.println("-----------------------------------");
    }

    @Override
    public final String tglExp() {
    return  exp;
    }

    @Override
    public String pemilik_ijinEdar() {
    return  nama_pem;    
    }

    @Override
    public  String nomor_ijinEdar(){
    return nomor_ijin;
} 

   
}
