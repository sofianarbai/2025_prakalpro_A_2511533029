package pekan6_2511533029;

import java.util.*;
public class TugasPekan6_2511533029 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner (System.in);
	
		int count = 0;
		boolean status = false;
		String pilihan = "ya";
		
		while(pilihan.equalsIgnoreCase("ya")) {
			int Dadu1 = rand.nextInt(6)+1;
			int Dadu2 = rand.nextInt(6)+1;
			count++;
			int hasil = Dadu1+Dadu2;
			System.out.println(Dadu1+"+"+ Dadu2 + "="+ hasil );
			if (hasil ==7) {
				status = true;
				break;
			}else {
				System.out.println("Tebakan Anda Salah ");
				System.out.println("Apakah Mau Lempar Dadu (ya/tidak)?");
				pilihan=input.next();
			}
		}
		if (status) {
            System.out.println("Tebakan Anda Benar");
            System.out.println("Anda menang setelah " + count + " percobaan");
        } else {
            System.out.println("Anda gagal menang");
        }
	}

}
