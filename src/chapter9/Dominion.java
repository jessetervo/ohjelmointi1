package chapter9;

import java.util.Scanner;
public class Dominion {

		
		public static int laskePisteet(int kirous, int tila, int pitaja, int laani) {
			int pisteet = (kirous + tila + pitaja + laani);
			int kaick = ((kirous * -1) + (tila * 2) + (pitaja * 5) + (laani * 8));
			return kaick;
		}
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int kirous, tila, pitaja, laani;
			
			System.out.println("Anna kirouskorttien määrä: ");
			kirous = input.nextInt();
			System.out.println("Anna tilakorttien määrä: ");
			tila = input.nextInt();
			System.out.println("Anna pitäjäkorttien määrä: ");
			pitaja = input.nextInt();
			System.out.println("Anna läänikorttien määrä: ");
			laani = input.nextInt();
			int yhteensa;
			yhteensa = laskePisteet(kirous, tila, pitaja, laani);
			System.out.println("Pisteiden yhteismäärä on " + yhteensa);
			
		}
		
		
	}

