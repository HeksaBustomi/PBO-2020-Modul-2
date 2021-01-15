package Main07186;
import Model_07186.Heksa07186_pesanan;
import Entity_07186.Heksa07186_Kendaraan;
import java.util.ArrayList;
import java.util.Scanner;
public class Heksa07186_CuciMobilDanMotor {
    static ArrayList <Heksa07186_Kendaraan> Kendaraan = new ArrayList();
    static Heksa07186_pesanan pesan = new Heksa07186_pesanan();
    static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {
        int pilih;
         do{ 
             System.out.println("1. Daftar ");
             System.out.println("2. Ambil ");
             System.out.println("3. Lihat Antrian");
             System.out.println("4. Update Data ");
             System.out.println("5. Keluar ");
             System.out.print("pilih : ");
             pilih = input.nextInt();
             switch(pilih)
             {
                 case 1 : Daftar();
                 break;
                 case 2 : Ambil();
                 break;
                 case 3 :view();
                 break;
                 case 4 :updateData();
                 break;
             }
          
        }while(pilih<5);
      }
      static void Daftar(){
          String Jenis_Kendaraan;
        System.out.println("1. roda 2");
        System.out.println("2. roda 4");
        System.out.print("pilih : ");
        int indexJenis_Kendaraan = input.nextInt();
        if(indexJenis_Kendaraan==1){
           Jenis_Kendaraan="Roda 2";
        }else{
            Jenis_Kendaraan = "Roda 4";
        }
        System.out.print("masukkan no.antrian : ");
        String no_antrian = input.next();
        System.out.print("masukkan nama : ");
        String nama = input.next();
        System.out.print("masukkan alamat : ");
        String alamat = input.next();
        System.out.print("masukkan nomor plat : ");
        String plat_nomor = input.next();
        System.out.print("masukkan merk kendaraan : ");
        String merk = input.next();
        System.out.print("masukkan warna : ");
        String warna = input.next();
        pesan.insert(new Heksa07186_Kendaraan (merk,plat_nomor,warna,nama,alamat,no_antrian,Jenis_Kendaraan));
    }   
    static  void Ambil(){
         
          System.out.print("masukkan no.anrian : ");
          String no_antrian =input.next();
          System.out.print("masukkan nama : ");
          String nama = input.next();
          pesan.ambil(no_antrian,nama);
      }
    static  void view(){
     
          pesan.view(); 
    }
     static void updateData(){
          System.out.println("======DATA=======");
            for(int i=0;i<Kendaraan.size();i++){
                System.out.println(" nama        : " + Kendaraan.get(i).getNama());
                System.out.println(" alamat      : " + Kendaraan.get(i).getAlamat());
                System.out.println(" nomor plat  : " + Kendaraan.get(i).getPlat_Nomor());
                                System.out.println(" merk        : " + Kendaraan.get(i).getMerk());
                System.out.println(" warna       : " + Kendaraan.get(i).getWarna());
                System.out.println("_____________________________");
            }
             System.out.print("masukkan data yang lama : ");
             String cari = input.next();
             pesan.update(cari);
           }
      }


