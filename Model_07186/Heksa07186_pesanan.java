package Model_07186;
import Entity_07186.Heksa07186_Kendaraan;
import java.util.ArrayList;
import java.util.Scanner;
public class Heksa07186_pesanan implements Heksa07186_layanan{
    private String jenis_Kendaraan;
    Scanner input = new Scanner(System.in);
    private ArrayList<Heksa07186_Kendaraan> Kendaraan; 
    public Heksa07186_pesanan(){
         Kendaraan = new ArrayList<Heksa07186_Kendaraan>();
     }
    public void insert(Heksa07186_Kendaraan pesan){
        Kendaraan.add(pesan);
    }
    @Override
    public void ambil(String no_antrian, String nama){   
                   for(int i=0;i<Kendaraan.size();i++)
                   {
                       if(Kendaraan.get(i).getNo_Antrian().equals(no_antrian) && Kendaraan.get(i).getNama().equals(nama))
                        {
                            System.out.println(" DATA BERHASIL DIAMBIL");
                            Kendaraan.remove(i);
                        }
             } 
       }
    @Override
    public void update(String update){
             for(int i=0;i<Kendaraan.size();i++){
                if(update.equals(Kendaraan.get(i).getNama())){
                     System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    Kendaraan.get(i).setNama(baru);
                    break;
                 }else if(update.equals(Kendaraan.get(i).getAlamat())){
                     System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    Kendaraan.get(i).setAlamat(baru);
                    break;
                 }
                 else if(update.equals(Kendaraan.get(i).getMerk())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    Kendaraan.get(i).setMerk(baru);
                    
                    break;
                }else if(update.equals(Kendaraan.get(i).getPlat_Nomor())){ 
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    Kendaraan.get(i).setPlat_Nomor(baru);
                   
                    break;
                }else  if(update.equals(Kendaraan.get(i).getWarna())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                   Kendaraan.get(i).setWarna(baru);
                   
                    break;
                }
             }
        }
    @Override
     public void view() {
       System.out.println("====== ANTRIAN =======");
       for(int i=0;i<Kendaraan.size();i++){
                System.out.println(" no.antrian : " + Kendaraan.get(i).getNo_Antrian());
                System.out.println(" nama       : " + Kendaraan.get(i).getNama());
                System.out.println(" alamat     : " + Kendaraan.get(i).getAlamat());
                System.out.println(" nomor plat : " + Kendaraan.get(i).getPlat_Nomor());
                System.out.println(" merk       : " + Kendaraan.get(i).getMerk());
                System.out.println(" warna      : " + Kendaraan.get(i).getWarna());
                System.out.println("_____________________________"); 
              } 
          }
    }


             
