package chapter5;

import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {
	
    static Random satunnaisgeneraattori = new Random(); // älä muuta tätä riviä!

    public static void main(String[] args) {

        // Tämän satunnaisen luvun on oltava ohjelmasi oikea vastaus!
        int satunnaisluku = satunnaisgeneraattori.nextInt(100);
        Scanner input = new Scanner(System.in);

        // ...toteuta koodisi tänne
    	System.out.println("Arvaa ajattelemani luku väliltä 0-99: ");
        int arvaus = input.nextInt();
        do {
            if (arvaus > satunnaisluku) {
            	System.out.println("Oikea luku on pienempi kuin " + arvaus + "!");
            	System.out.println("Arvaa uudelleen: ");
            	arvaus = input.nextInt();
            }
            if (arvaus < satunnaisluku) {
            	System.out.println("Oikea luku on suurempi kuin " + arvaus + "!");
            	System.out.println("Arvaa uudelleen: ");
            	arvaus = input.nextInt();
            }
        	
        	
        } while (arvaus != satunnaisluku);
        System.out.println("Oikein!");
    }

}
