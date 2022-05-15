package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Puoluetuki {
	
	public static void main(String[] args) {
		//Yhden kansanedustajan puoluetuki on 148 175 euroa.
		
		System.out.print("Anna kansanedustajien lukumäärä: ");
		Scanner input = new Scanner (System.in);
		double lukumaara = input.nextInt();
		double tuki = 148175;
		double yhteensa;
		yhteensa = tuki * lukumaara;
		DecimalFormat desimaalit = new DecimalFormat("0");
				System.out.println("Puoluetuen määrä on " + desimaalit.format(yhteensa) + " euroa");
				
		
	}

}
