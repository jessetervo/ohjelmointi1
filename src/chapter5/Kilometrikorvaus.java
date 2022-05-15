package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Kilometrikorvaus {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			DecimalFormat desimaalit = new DecimalFormat("0.00");
		
			
		int yhteensä = 0;
		int kilometrit = 0;
		System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
		kilometrit = input.nextInt();
		
		while(kilometrit != 0) {
			yhteensä = yhteensä + kilometrit;
			System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
			kilometrit = input.nextInt();
		}
		System.out.println("Yhteensä " + yhteensä + " kilometriä");
		System.out.println("Korvaus on " + desimaalit.format(yhteensä * 0.44) + " euroa");
		
	}

}
