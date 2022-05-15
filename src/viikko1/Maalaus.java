package viikko1;
//Kuinka paljon maalia ostettava.
//Kysyy huoneen leveyden, pituuden ja korkeuden ja paljonko saa maalattua litralla
//Kahden desimaalin tarkkuus

//Anna huoneen leveys, pituus ja korkeus: 3,40 3,00 2,50
//Paljonko litralla saadaan maalattua neliöitä: 5
//Maalin tarve on 6,40 litraa

import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {
	public static void main(String[] args) {
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		Scanner input = new Scanner (System.in);
		double leveys = input.nextDouble();
		double pituus = input.nextDouble();
		double korkeus = input.nextDouble();
		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		double litralla = input.nextDouble();
		double tulos = (leveys + leveys + pituus + pituus) * korkeus / litralla;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
			System.out.println("Maalin tarve on " + desimaalit.format(tulos) + " litraa");
	}

}
