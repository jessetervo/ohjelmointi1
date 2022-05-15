package chapter9;

import java.util.Scanner;
public class Tunnus {
	
	Scanner input = new Scanner(System.in);
	
	static String teeTunnus(String etu, String suku) {
		suku = suku.substring(0, 3);
		etu = etu.substring(0, 3);
		String kayttajatunnus = suku + etu;
		return kayttajatunnus;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String suku, etu;
		System.out.println("Anna sukunimi: ");
		suku = input.nextLine();
		System.out.println("Anna etunimi: ");
		etu = input.nextLine();
		String tunnus = teeTunnus(etu, suku);
		
		System.out.println("Tunnus on " + tunnus);
	}

}
