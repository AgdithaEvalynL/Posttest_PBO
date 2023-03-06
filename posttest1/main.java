/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package posttest1;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<dataObat> dataobat = new ArrayList<dataObat>();
    
    public static void main(String[] args) throws IOException {
        System.out.println("------------------------");        
        System.out.println("PROGRAM PENDATAAN OBAT ");
        System.out.println("    APOTEK MUACH    ");
        System.out.println("------------------------");
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
            
            if (pilihan == 1) {
                create();
            } else if (pilihan == 2){
                read();
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
        System.out.print("\nMasukan Nama Obat: ");
        String add_nama = br.readLine();
        System.out.print("Masukan Jenis Obat: ");
        String add_jenis  = br.readLine();
        System.out.print("Masukan Harga Obat: ");
        int add_harga = Integer.parseInt(br.readLine());
        dataObat obatBaru = new dataObat(add_nama, add_jenis, add_harga);
        dataobat.add(obatBaru);
        obatBaru.tertambah();
    }
        
    public static void read() throws IOException{
        System.out.println("\n +++ DATA OBAT +++");
        
        for (int i = 0; i < dataobat.size(); i++) {
            System.out.println("DATA OBAT ke-" + (i+1));
            System.out.println("Nama Obat: " + dataobat.get(i).Nama_Obat);
            System.out.println("Jenis Obat: " + dataobat.get(i).Jenis_Obat);
            System.out.println("Harga Obat: " + dataobat.get(i).Harga_Obat);
            System.out.print("\n");
        }
    }
    
     public static void update() throws IOException{
        read();System.out.print("\n");
        System.out.println(" +++ UPDATE DATA OBAT +++");
        System.out.print("Masukan Data Obat ke-");
        int idx = Integer.parseInt(br.readLine());
        System.out.print("Masukan Nama Obat: ");
        String setNAMA = br.readLine();
        System.out.print("Masukan Jenis Obat: ");
        String setJENIS = br.readLine();
        System.out.print("Masukan Harga Obat: ");
        int setHARGA = Integer.parseInt(br.readLine());
        System.out.print("\n");

        dataobat.get(idx-1).Nama_Obat = setNAMA;
        dataobat.get(idx-1).Jenis_Obat = setJENIS;
        dataobat.get(idx-1).Harga_Obat = setHARGA;
        
        dataobat.get(idx-1).terupdate();
    }

    public static void delete() throws IOException{
        read();
        System.out.println("\n +++ DELETE DATA OBAT +++");
        System.out.print("Masukan Data OBAT ke-");
        int index = Integer.parseInt(br.readLine());

        dataobat.remove(index-1).terhapus();
    }
    

}

