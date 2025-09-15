package pekan2;

public class ContohChar {

	public static void main(String[] args) {
		// Deklarasi variabel char
		char huruf1 ='A';
		char huruf2 ='b';
		char angka ='7';
		char simbol ='#';
		// Menampilkan variabel char
		System.out.println("Contoh variabel char:");
		System.out.println("Huruf pertama:" + huruf1);
		System.out.println("huruf kedua:" + huruf2);
		System.out.println("angka"+angka);
		System.out.println("simbol "+simbol);
		
		// operasi dengan char (berdasarkan code Unicode/ASCII)
		char huruf3 = (char) (huruf1 +1); //A (65) + 1 = B (66);
		System.out.println("huruf1 + 1 = " + huruf3);
		//char juga disimpan dalam integer (ASCII/Unicode value)
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s",  Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("kode ASCII dari " + huruf1 + " = " + kodeHuruf);
		System.out.println("kode BINER dari " + huruf1 + " = " + biner1);
		
		//Menggabungkan char menjadi string
		String kata ="" + huruf1 + huruf2 + angka + simbol;
		System.out.println("gabungan char menjadi string: " + kata);
		
		
		
		// TODO Auto-generated method stub

	}

}
