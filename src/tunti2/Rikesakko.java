package tunti2;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Rikesakko {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.println("Anna nopeusrajoitus: ");
		double nopeusrajoitus = input.nextDouble();
		System.out.println("Anna nopeutesi: ");
		double nopeus = input.nextDouble();
		
		if(nopeusrajoitus >= 10 && nopeusrajoitus <= 60) {
			if(nopeus > nopeusrajoitus && nopeus <= nopeusrajoitus + 15) {
				System.out.println("Rikesakko on 170");
			}
			if(nopeus > nopeusrajoitus + 15 && nopeus < nopeusrajoitus + 20) {
				System.out.println("Rikesakko on 200");
				}
			}
		if(nopeusrajoitus >= 70 && nopeusrajoitus <= 120) {
			if(nopeus <= nopeusrajoitus + 15) {
				System.out.println("Rikesakko on 140");
			}
			if(nopeus > nopeusrajoitus + 15 && nopeus < nopeusrajoitus + 20) {
				System.out.println("Rikesakko on 200");
			}
			}
		if(nopeus > nopeusrajoitus + 20) {
				System.out.println("Menee päiväsakoille");
		}
		
			
		}
					
		}

	


