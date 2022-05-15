package tunti2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.println("Anna pizzojen hinnat (3): ");
		double pizza1 = input.nextDouble();
		double pizza2 = input.nextDouble();
		double pizza3 = input.nextDouble();
		double halvin = 0;
		
		if(pizza1 < pizza2 && pizza1 < pizza3) {
			halvin = pizza1;
		} 
		if(pizza3 < pizza1 && pizza3 < pizza2) {
			halvin = pizza3;
		} 
		if(pizza2 < pizza3 && pizza2 < pizza1){
			halvin = pizza2;
		}
		
		System.out.println("Maksettavaa: " + desimaalit.format(pizza1 + pizza2 + pizza3 - halvin));
		System.out.println("Yksittäisen hinta: " + desimaalit.format((pizza1 + pizza2 + pizza3 - halvin) / 3));
	}
}
