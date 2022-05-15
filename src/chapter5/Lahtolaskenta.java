package chapter5;


import java.util.Scanner;

public class Lahtolaskenta {
	
	public static void main(String[] args) {
		
		int luku = 100;
		
		while(luku >= 0) {
			if(luku % 3 != 0) {
				System.out.println(luku);
			}
			luku = luku - 1;
		}
			
	}

}
