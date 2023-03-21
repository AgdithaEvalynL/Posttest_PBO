
package posttest3;


public class syrup extends dataObat{

    private String id_obat_syrup;
    private String takaran;
    
    public syrup (String nama_obat, int harga_obat,String id_syrup,String Takaran){
        super(nama_obat,harga_obat);
        this.id_obat_syrup = id_syrup;
        this.takaran=Takaran;

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

    public void setTakaran(String takaran) {
        this.takaran = takaran;
    }

    
}
