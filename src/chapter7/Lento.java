package chapter7;

import java.util.Scanner;
public class Lento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Anna lennon numero: ");
		String lento = input.nextLine();
		
		String kirjaimet = lento.substring(0, 2);
		String numero = lento.substring(2, 3);
		int tyyppi = Integer.parseInt(numero);
		
		if (kirjaimet.matches("AY") == false) {
			System.out.println("Ei ole Finnairin lento");
		} else {
			if (tyyppi == 1) {
				System.out.println("Kaukolento");
			}
			if (numero.matches("[23456]") == true) {
				System.out.println("Kotimaan lento");
			}
			if (tyyppi == 7) {
				System.out.println("Venäjän lento");
			}
			
		}
		
	}

}
