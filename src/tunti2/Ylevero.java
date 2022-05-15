package tunti2;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ylevero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.print("Anna vuositulosi ja ikäsi: ");
		double palkka = input.nextDouble();
		int ika = input.nextInt();
		
		double ylevero = 0;
		if(ika < 18) {
			ylevero = 0;
		} else {
			ylevero = 0.0068 * palkka;
			if(ylevero > 140) {
				ylevero = 140;
			}
			if(ylevero < 70) {
				ylevero = 0;
			}
			
		}
		
		System.out.println("Ylevero on " + desimaalit.format(ylevero));
		
	}

}
