package pekan6_2511533029;
import java.util.Scanner;
public class SentinelLoop_2511533029 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		int sum=0;
		int number = 12; //dummy value, anything but 0
		
		while (number != 0) {
			System.out.print("masukkan angka (0 untuk berhenti):");
			number= console.nextInt();
			sum= sum+ number;
			console.close();
		}
		System.out.println("totalnya adalah " + sum);
	}

}
