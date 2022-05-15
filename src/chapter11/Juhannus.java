package chapter11;

import java.util.Scanner; 
import java.time.LocalDate;
public class Juhannus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int vuosi;
		int kuukausi = 6;
		int pvm;
		LocalDate juhannus;
		
		
		System.out.println("Syötä vuosi: ");
		vuosi = input.nextInt();
		while (pvm > 20 && pvm < 26) {
			
		}
		
		juhannus = LocalDate.of(vuosi, kuukausi, pvm);
		System.out.println(juhannus);
	}

}
