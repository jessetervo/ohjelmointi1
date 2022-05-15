package koe;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Nimilista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        List<String> kaverit = new ArrayList<String>();
        System.out.println("Ohjelmassa pidetään listaa kavereista. ");
        
        int toiminto = 0;
        do {
            System.out.println("(1) Lisää kaveri");
            System.out.println("(2) Poista kaveri");
            System.out.println("(3) Listaa kaverit");
            System.out.println("(4) Lopeta ohjelma");
            System.out.println("Anna toiminto (1, 2, 3 tai 4): ");
            toiminto = input.nextInt();
            
        	if (toiminto == 1) {
        		System.out.println("Anna kaverin nimi: ");
        		String nimi = input.next();
        		kaverit.add(nimi);
        	}
        	if (toiminto == 2) {
        		System.out.println("Anna poistettavan kaverin indeksi: ");
        		int poistettava = input.nextInt();
        		kaverit.remove(poistettava);
        	}
        	if (toiminto == 3) {
        		for (int i = 0; i < kaverit.size(); i++) {
        			System.out.println(i + " " + kaverit.get(i));
        		}
        	}
        	
        } while (toiminto != 4);
        

	}

}
