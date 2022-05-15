package koe;

import java.util.Scanner;
public class Mopokortti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kuinka monta vuotta vanha henkilö on: ");
        int ika = input.nextInt();
        
        if (ika < 15) {
        	System.out.println("Ikä ei vielä riitä mopokorttiin.");
        } else {
        	System.out.println("Henkilö voi saada mopokortin.");
        }
	}

}