package chapter8;

import java.util.Arrays;
import java.util.Scanner;
public class SanojenVaihtaminen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kirjoita lause: ");
		String lause = input.nextLine();
		String [] sanat = lause.split(" ");
		
		System.out.println("Mitkä sanat vaihdetaan keskenään? ");
		int eka = input.nextInt();
		int toka = input.nextInt();
		String ekaSana = sanat[eka];
		String tokaSana = sanat[toka];
		
		sanat[eka] = tokaSana;
		sanat[toka] = ekaSana;
		
		String tulos = String.join(" ", sanat);
		System.out.println(tulos);

	}

}
