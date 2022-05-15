package chapter11;

import java.util.Scanner; 
import java.time.LocalDate;
public class Erapaiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String paiva;
		LocalDate laskunpaiva;
		LocalDate erapaiva;
		
		System.out.println("Anna laskun päivämäärä (vvvv-kk-pp): ");
		paiva = input.nextLine();
		laskunpaiva = LocalDate.parse(paiva);
		erapaiva = laskunpaiva.plusDays(14);
		System.out.println("Eräpäivä on " + erapaiva);
		

	}

}
