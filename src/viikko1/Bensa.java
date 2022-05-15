package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Bensa {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Anna tankattu määrä: ");
		double maara = input.nextDouble();
		System.out.print("Anna ajetut kilometrit: ");
		double kilometrit = input.nextDouble();
		System.out.print("Anna litrahinta: ");
		double litrahinta = input.nextDouble();
		double kilometriHinta = maara / kilometrit * litrahinta;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Ajo per kilometri maksaa " + desimaalit.format(kilometriHinta) );
				
		
	}
	
	
}