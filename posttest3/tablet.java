
package posttest3;

 
public class tablet extends dataObat {
    private String id_obat_tablet;
    private String takaran_tablet;
    
    public tablet (String nama_obat, int harga_obat,String id_tablet,String takaran_tablet){
        super(nama_obat,harga_obat);
        this.id_obat_tablet = id_tablet;
        this.takaran_tablet=takaran_tablet;
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
        this.takaran_tablet = takaran_tablet;
    }


    
    
    
}
