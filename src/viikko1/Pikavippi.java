package viikko1;
//Anna pikavipin määrä euroissa: 500
//Moneksiko vuodeksi raha halutaan (1 tai 2): 1
//Lainakorko kahdesta yleisestä (41% tai 37%): 41
//Lainatut rahat maksavat eli korko 205.0

import java.util.Scanner;

public class Pikavippi {
	public static void main(String[] args) {
		System.out.print("Anna pikavipin määrä euroissa: ");
		Scanner input = new Scanner (System.in);
		double pikavippi = input.nextInt();
		System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		double vuosi = input.nextInt();
		System.out.print("Lainakorko kahdesta yleisestä (41% tai 37%): ");
		double korko = input.nextInt();
		double hinta = korko / 100 * pikavippi * vuosi;
		System.out.print("Lainatut rahat maksavat eli korko " + hinta);
	}

}
