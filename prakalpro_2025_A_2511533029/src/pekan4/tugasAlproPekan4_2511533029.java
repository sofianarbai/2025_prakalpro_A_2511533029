package pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511533029 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nama Pembeli = ");
		String nama= input.nextLine();
		
		System.out.print("Jumlah tiket yang dibeli = ");
		int jumlahtiket = input.nextInt();
		
		System.out.println("Pilih Hari Nonton");
		System.out.println("1. Senin-kamis ");
		System.out.println("2. Jum'at");
		System.out.println("3. Sabtu-Minggu ");
		System.out.println("=========================");
		System.out.print("Pilih Hari = ");
		int pilihhari = input.nextInt();
		
		System.out.println("Pilih Waktu Tayang Film");
		System.out.println("1. Pagi  = 10:00-12:00");
		System.out.println("2. Siang = 12:00-17:00");
		System.out.println("3. Malam = 17:00-22:00");
		System.out.println("=========================");
		System.out.print("Pilih Waktu Tayang = ");
		
		int waktutayang = input.nextInt();
		
		System.out.println("Pilih Jenis Studio");
		System.out.println("1. Regular");
		System.out.println("2. Deluxe");
		System.out.println("3. Premium");
		System.out.println("=========================");
		System.out.print("Pilih Jenis Studio = ");
		int jenisstudio = input.nextInt(); 
		
		int Hargadasar = 100000;
		int biayahari = 0;
		int biayawaktu = 0;
		int biayastudio = 0;
		int hargapertiket = 0;
		int totalharga = 0;
		int diskon = 0;
		int diskonhari = 0;
		int totalbayar =0;
		
		String hari = "";
		switch (pilihhari) {
		case 1 : hari = "Senin-kamis";  biayahari = 0; diskonhari = 20;
		         break;
		case 2 : hari = "Jum'at";  biayahari = 10000; diskonhari = 10;
		         break;
		case 3 : hari = "Sabtu-Minggu";  biayahari = 20000; diskonhari = 0;
		         break;
		default: hari = "Hanya 1,2 dan 3";
		}
		
		String waktu = "";
		switch (waktutayang) {
		case 1 : waktu = "10:00-12:00"; biayawaktu = 0;
                 break;
        case 2 : waktu = "12:00-17:00"; biayawaktu = 10000;
                 break;
        case 3 : waktu = "17:00-22:00"; biayawaktu = 20000;
                 break;
        default: waktu = "Hanya 1,2 dan 3";
		}
	
		String studio = "";
		switch (jenisstudio) {
		case 1 : studio = "Regular"; biayastudio = 0;
                 break;
        case 2 : studio = "Deluxe"; biayastudio = 10000;
                 break;
        case 3 : studio = "Premium"; biayastudio = 20000;
                 break;
        default: studio = "Hanya 1,2 dan 3";
		}
		
		System.out.println("========PEMBELIAN TIKET BIOSKOP=======");
		System.out.println("Nama Pembeli/Pemesan             : " + nama);
		System.out.println("Jumlah tiket yang dibeli/dipesan : " + jumlahtiket);
		System.out.println("Hari Nonton                      : " + hari);
		System.out.println("Waktu Tayang Film                : " + waktu);
		System.out.println("Jenis Studio                     : " + studio);
		
		System.out.println("--------------------------------------");
		System.out.println("harga dasar     = " + Hargadasar);
		System.out.println("biaya hari      = " + biayahari);
		System.out.println("Biaya Waktu     = " + biayawaktu);
		System.out.println("Biaya studio    = " + biayastudio);
		
		hargapertiket = (Hargadasar + biayahari + biayawaktu + biayastudio);
		System.out.println("Harga Per Tiket = " + hargapertiket);
		totalharga = hargapertiket * jumlahtiket;
		System.out.println("Total Harga     = " + totalharga);
		diskon = totalharga * diskonhari / 100;
		System.out.println("Diskon hari ini = " + diskon);
		System.out.println("--------------------------------------");
		totalbayar= totalharga - diskon;
		System.out.println("Total Bayar = " + totalbayar);
	
	}

}
