package chapter9;

import java.util.Scanner;
public class Kellonaika {
	
	static  Scanner input = new Scanner(System.in);
	
		static String kysyKellonaika() {
			System.out.println("Anna kellonaika muodossa tt:mm: ");
			String kellonaika = input.nextLine();
			return kellonaika;
		}
	
		static boolean tarkastaKellonaika(String kellonaika) {
			boolean joo;
			if (kellonaika.matches("^(?:[01]?\\d|2[0-3])(?::[0-5]\\d){1,2}$") == true) {
				joo = true;
			} else {
				joo = false;
			}
			return joo;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kellonaika = kysyKellonaika();
		boolean joo = tarkastaKellonaika(kellonaika);
		if (joo == true) {
			System.out.println("Kellonaika on oikein");
		} else {
			System.out.println("Kellonaika on väärin");
		}

			
		

	}

}
