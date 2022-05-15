package viikko1;

//Laske Bitcoinin tuotto vuodessa. Rahan arvo 15,06 kertaistaa itsensä. 
//Double arvo sellaisenaan eli ei pyöristyksiä. Vähennä loppuarvosta sijoitettu pääoma
//Example output:
//Anna Bitcoineihin investoidun rahan määrä: 
//150
//Bitcoin tuotti vuodessa 2109.0 euroa

import java.util.Scanner;


public class Bitcoin {
	public static void main(String[] args) {
		System.out.print("Anna Bitcoineihin investoidun rahan määrä:");
		Scanner input = new Scanner (System.in);
		double investointi = input.nextInt();
		double kerroin = 15.06;
		double tuotto;
		tuotto = investointi * kerroin - investointi;
			System.out.println("Bitcoin tuotti vuodessa " + tuotto + " euroa");	
	}

}
