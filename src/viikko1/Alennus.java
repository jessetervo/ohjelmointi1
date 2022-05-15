package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Alennus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna alentamaton hinta: ");
		double alentamatonHinta = input.nextDouble();
		System.out.print("Anna alennusprosentti: ");
		int alennusProsentti = input.nextInt();
		double hinta = alentamatonHinta * (100.0 - alennusProsentti) / 100.0;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Alennettu hinta on " + desimaalit.format(hinta) );
	}

}
