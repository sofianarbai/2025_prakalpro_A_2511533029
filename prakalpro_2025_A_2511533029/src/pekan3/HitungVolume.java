package pekan3;
import java.util.Scanner;
public class HitungVolume {

	public static void main(String[] args) {
		double r;
		double t;
	    double VolumeTabung;
	    double phi = 3.14;
	    Scanner keyboard = new Scanner (System.in);
	    System.out.print("input r atau jari-jari Tabung: ");
	    r = keyboard.nextDouble();
	    System.out.print("input t atau tinggi Tabung   : ");
	    t = keyboard.nextDouble();
	    keyboard.close();
	    System.out.println("Rumus Volume Tabung : phi * r * r * t ");
        VolumeTabung = phi * r * r * t;
        System.out.println("Volume Tabung Adalah = " + VolumeTabung);
	}

}
