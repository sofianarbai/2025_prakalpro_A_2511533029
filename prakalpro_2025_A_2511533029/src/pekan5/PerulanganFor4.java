package pekan5;
import java.util.Scanner;
public class PerulanganFor4 {

	public static void main(String[] args) {
		int jumlah=0;
		int batas;
		Scanner input= new Scanner(System.in);
		System.out.print("Masukkan nilai batas = ");
		batas = input.nextInt();
		for (int i=1 ; i<=10; i++) {
			System.out.print(i);
			jumlah = jumlah+i;
			if (i<batas) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
				
			}
		}
		System.out.println(jumlah);
	}

}
