package chapter11;

import java.util.Arrays;
import java.util.Scanner;

public class Veriryhma {
	
	int i = 20;
	String[] veriryhmat = new String[i];
	
	public int kysyVeriryhmat(String[] veriryhmat) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		String asdf = "";
		int yhteensa = 0;
		
		while (!asdf.equals("-")) {
		System.out.println("Anna veriryhmä (- lopettaa): ");
		asdf = input.nextLine();
		veriryhmat[i] = asdf;
		i++;
		yhteensa++;
		}
		return yhteensa;
	}
	
	public void montakoMaara(String[] veriryhmat, int yhteensa) {
		Scanner input = new Scanner(System.in);
		System.out.println("Minkä veriryhmän luovutusten määrän haluat tietää: ");
		String haluttu = input.next();
		int maara = 0;
		for (int i = 0; i<yhteensa; i++) {
			if(veriryhmat[0].equals(haluttu)) {
				maara++;
			}
		}
		System.out.println(maara);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Veriryhma olio = new Veriryhma();
		int i = 20;
		String[] veriryhmat = new String[i];
		int yhteensa = olio.kysyVeriryhmat(veriryhmat);
		System.out.println("Luovutuksia oli yhteensä " + (yhteensa - 1));
		
		olio.montakoMaara(veriryhmat, yhteensa);
	}
	

}



