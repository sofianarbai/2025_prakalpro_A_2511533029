package pekan2; 
public class tugasAlproPekan2 {
    public static void main(String[] args) {
    	// Deklarasi variabel
        int umur = 19;                  
        float tinggi = 172.5f;              
        char jenisKelamin = 'L';               
        boolean sudahLulus = tinggi >= 170 ; 
        
        System.out.println("=== Data Peserta Sekdin ===");
        System.out.println("Umur          : " + umur);
        System.out.println("Tinggi        : " + tinggi);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Sudah Lulus   : " + sudahLulus);

        if (sudahLulus) {
        	System.out.println("Selamat! Kamu sudah lulus"); 
        	} else {
            System.out.println("Tetap Semangat!!!!!");
        	}
    }
}