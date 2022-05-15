package chapter8;

import java.util.Scanner;
public class MerkkijononPalat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kirjoita lause: ");
		String lause = input.nextLine();
		String [] sanat = lause.split(" ");
		
		int i = 0;
		while(i < sanat.length) {
			String sana = sanat[i];
			System.out.println(sana);
			i++;
		}
		
		
	}

}
