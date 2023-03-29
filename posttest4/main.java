
package posttest4;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //static ArrayList<dataObat> dataobat = new ArrayList<dataObat>();
    static ArrayList<syrup> syrup_obat = new ArrayList<>();
    static ArrayList<tablet> tablet_obat = new ArrayList<>();
                
    
    public static void main(String[] args) throws IOException {
        //dataObat obat = new dataObat();
        
        System.out.println("----------------------------");        
        System.out.println("    PROGRAM PENDATAAN OBAT ");
        System.out.println("       APOTEK MUACH    ");
        System.out.println("----------------------------");
        while (true) {
            System.out.println("\n#### MENU PILIHAN ####");
            System.out.println("(1). Create Data Obat");
            System.out.println("(2). Read Data Obat");
            System.out.println("(3). Update Data Obat");
            System.out.println("(4). Delete Data Obat");
            System.out.println("(5). Exit");
            System.out.println("#######################");
            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.println("\n");
            if (pilihan == 1) {
                create();
            } else if (pilihan == 2){
                read(pilihan);
            } else if (pilihan == 3){
                update();
            } else if (pilihan == 4){
                delete();
            } else if (pilihan == 5){
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
        }

    }
    
        public static void create() throws IOException{
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Menu Pilihan Jenis Obat");
        System.out.println("    [1]OBAT SYRUP      ");
        System.out.println("    [2]OBAT TABLET     ");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Masukkan pilihan anda : ");
        int pilihan=Integer.parseInt(br.readLine());
        
        if (pilihan==1){
            System.out.println("\nMasukkan id obat:  ");
            String add_id = br.readLine();
            System.out.print("Masukan Nama Obat: ");
            String add_nama = br.readLine();
            System.out.print("Masukan Harga Obat: ");
            int add_harga = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Takaran obat");
            String add_takar=br.readLine();
            syrup newSyrup = new syrup(add_nama, add_harga,add_id,add_takar);

            syrup_obat.add(newSyrup);
            
            //overloading 
            newSyrup.tertambah(add_nama);
        }
        else if(pilihan==2) {
            System.out.println("\nMasukkan id obat:  ");
            String add_id=br.readLine();
            System.out.print("Masukan Nama Obat: ");
            String add_nama = br.readLine();
            System.out.print("Masukan Harga Obat: ");
            int add_harga = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Takaran obat: ");
            String add_takar=br.readLine();
            tablet newTablet = new tablet(add_nama, add_harga,add_id,add_takar);

            tablet_obat.add(newTablet);
            
            //overloading 
            newTablet.tertambah(add_nama);
            
        }

    }
        
    public static void read(int pilih) throws IOException{
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Menu Pilihan Jenis Obat");
        System.out.println("    [1]OBAT SYRUP      ");
        System.out.println("    [2]OBAT TABLET     ");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Masukkan pilihan anda : ");
        
        int pilihan=Integer.parseInt(br.readLine());
        if (pilihan==1){
            System.out.println("\n +++ DATA OBAT +++");

            for (int i = 0; i < syrup_obat.size(); i++) {
                System.out.println("DATA OBAT ke-" + (i+1));
                System.out.println("ID Obat     :"+ syrup_obat.get(i).getId_obat_syrup());
                System.out.println("Nama Obat   :" + syrup_obat.get(i).getNama_Obat());
                System.out.println("Harga Obat  :" + syrup_obat.get(i).getHarga_Obat());
                System.out.println("Takaran Obat:"+ syrup_obat.get(i).getTakaran());
                System.out.print("\n");
            }
        }else if (pilihan==2){
           System.out.println("\n +++ DATA OBAT +++");

                for (int i = 0; i < tablet_obat.size(); i++) {
                System.out.println("DATA OBAT ke-" + (i+1));
                System.out.println("ID Obat     :"+ tablet_obat.get(i).getId_obat_tablet());
                System.out.println("Nama Obat   :" + tablet_obat.get(i).getNama_Obat());
                System.out.println("Harga Obat  :" + tablet_obat.get(i).getHarga_Obat());
                System.out.println("Takaran Obat:"+ tablet_obat.get(i).getTakaran_tablet());
                System.out.print("\n");
            }
        }
    }
    
     public static void update() throws IOException{
        System.out.println("\n ++++++++++++++++++++++++++");
        System.out.println("Menu Pilihan Jenis Obat");
        System.out.println("    [1]OBAT SYRUP      ");
        System.out.println("    [2]OBAT TABLET     ");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Masukkan pilihan anda : ");
        int pilihan=Integer.parseInt(br.readLine());
        
        if(pilihan==1){
            
            read(1);
            System.out.println(" +++ UPDATE DATA OBAT +++");
            System.out.print("Masukan Data Obat ke-");
            int idx = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Id obat: ");
            String setId= br.readLine();
            System.out.print("Masukan Nama Obat: ");
            String setNAMA = br.readLine();
            System.out.print("Masukan Harga Obat: ");
            int setHARGA = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Takaran Obat: ");
            String setTakar= br.readLine();
            System.out.print("\n");

            syrup_obat.get(idx-1).setId_obat_syrup(setId);
            syrup_obat.get(idx-1).setNama_Obat(setNAMA);
            syrup_obat.get(idx-1).setHarga_Obat(setHARGA);
            syrup_obat.get(idx-1).setTakaran(setTakar);

            syrup_obat.get(idx-1).terupdate();
        }
        else if(pilihan==2){
            read(2);
            System.out.println(" +++ UPDATE DATA OBAT +++");
            System.out.print("Masukan Data Obat ke ");
            int idx = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Id obat: ");
            String setId= br.readLine();
            System.out.print("Masukan Nama Obat: ");
            String setNAMA = br.readLine();
            System.out.print("Masukan Harga Obat: ");
            int setHARGA = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Takaran Obat: ");
            String setTakar= br.readLine();
            System.out.print("\n");

            tablet_obat.get(idx-1).setId_obat_tablet(setId);
            tablet_obat.get(idx-1).setNama_Obat(setNAMA);
            tablet_obat.get(idx-1).setHarga_Obat(setHARGA);
            tablet_obat.get(idx-1).setTakaran_tablet(setTakar);

            tablet_obat.get(idx-1).terupdate(); 
        }
    }


    public static void delete() throws IOException{
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Menu Pilihan Jenis Obat");
        System.out.println("    [1]OBAT SYRUP      ");
        System.out.println("    [2]OBAT TABLET     ");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Masukkan pilihan anda : ");
        
        int pilihan=Integer.parseInt(br.readLine());
        
        if (pilihan==1){
            System.out.println("\n +++ DELETE DATA OBAT +++");
            System.out.print("Masukan Data OBAT ke-");
            int index = Integer.parseInt(br.readLine());

            syrup_obat.remove(index-1).terhapus(index);
        }
        else if (pilihan==2){
            System.out.print("Masukan Data OBAT ke-");
            int index = Integer.parseInt(br.readLine());

            tablet_obat.remove(index-1).terhapus(index);
        }
        
        
    }
}

