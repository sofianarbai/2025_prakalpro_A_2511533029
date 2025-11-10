package pekan7_2511533029;
import java.util.Scanner;
public class BilanganPrima_2511533029 {
	public static Boolean isPrime(int n) {
		int factors =0;
		for (int i=1; i<=n; i++) {
			if (n % i ==0) {
				factors++;
			}
		}
		return (factors == 2);
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input nilai n = ");
		int a= input.nextInt();
		input.close();
		if (isPrime(a)) {
			System.out.println(a+ " merupakan bilangan prima");
		} else {
			System.out.println(a+ " bukan merupakan bilangan prima");
		}

	}

}
