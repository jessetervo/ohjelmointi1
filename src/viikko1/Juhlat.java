package viikko1;

import java.util.Scanner;
public class Juhlat {
	public static void main(String[] args) {
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		Scanner input = new Scanner (System.in);
		int juojia = input.nextInt();
		double pullot = juojia / 7;
		double juomaPullot = Math.ceil(pullot);
		int juomaPullotInt = (int)pullot;
		System.out.println("Pulloja tarvitaan " + juomaPullotInt + " kappaletta");
		double viimeisestaPullostaJaa = (pullot * 7) - juojia;
		int viimeisestaPullostaJaaInt = (int)viimeisestaPullostaJaa;
		System.out.println("Viimeisestä pullosta jää " + viimeisestaPullostaJaaInt +  " lasia");
		
	}

}
