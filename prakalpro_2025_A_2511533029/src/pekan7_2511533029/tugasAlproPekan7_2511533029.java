package pekan7_2511533029;
import java.util.Scanner;
public class tugasAlproPekan7_2511533029 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("=== Registrasi Akun Baru ===");
        System.out.print("Masukkan Username: ");
        String Username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();
        System.out.print("Masukkan Email: ");
        String email = input.nextLine();
        System.out.print("Masukkan PIN (Angka 6 Digit): ");
        int pin = input.nextInt();

        Akun_2511533029 akun= new Akun_2511533029();
        akun.setUsername(Username);
        akun.setPassword(password);
        akun.setEmail(email);
        akun.setPinAngka(pin);

        if (!akun.isEmailValid()) {
            System.out.println("--- REGISTRASI GAGAL ---");
            System.out.println("Email Untuk Akun \""+ Username +"\" Salah. email harus terdapat '@' dan '.'");
            return;
        }
        if (!akun.isPasswordValid()) {
        	System.out.println("--- REGISTRASI GAGAL ---");
        	System.out.println("PASSWORD MINIMAL TERDAPAT 8 KARAKTER");
            return;
        }
        System.out.println();
        System.out.println("--- Registrasi Berhasil ---");
        System.out.println("Akun untuk \""+ Username +"\" Telah Berhasil dibuat.");
        System.out.println();
        System.out.println("--- Detail Akun ---");
        System.out.println("Username (Lowercase) : " + Username.toLowerCase());
        System.out.println("Email (Uppercase) : " + email.toUpperCase());
        System.out.println("ID Pengguna (Gabungan) : " + Username + pin);
        System.out.println();
        System.out.println("--- Uji Tipe Data (Pin Anda: " + pin + ") ---");
        System.out.println("PIN (int) + 10 = " + (pin + 10));
        System.out.println("PIN (String) + 10 = " + (String.valueOf(pin) + 10));
     }
}