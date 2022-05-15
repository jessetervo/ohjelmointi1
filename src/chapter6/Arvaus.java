package chapter6;

import java.util.Scanner;

public class Arvaus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arvaus = 78;
		int arvauksia = 1;
		System.out.println("Arvaa lukua väliltä 1-100:");
		arvaus = input.nextInt();
		if(arvaus < 78) {
		System.out.println("Arvaa suurempaa:");
		
		}
		if(arvaus > 78) {
		System.out.println("Arvaa pienempää:");
		}
		
		while(arvaus != 78) {
		arvauksia = arvauksia + 1;
		arvaus = input.nextInt();
			if(arvaus < 78) {
			System.out.println("Arvaa suurempaa:");
			
			}
			if(arvaus > 78) {
			System.out.println("Arvaa pienempää:");
			}
		
		}
		System.out.println("Arvasit oikein. Arvauksia oli " + arvauksia);

	}

}
