package koe;

import java.util.Scanner;
public class Puhelinnumerot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("Anna puhelinnumero: ");
        String puhelinnumero = input.next();
        String alku = puhelinnumero.substring(0, 1);
        String loppu = puhelinnumero.substring(1, 10);
        
        
        if (puhelinnumero.matches("\\d{10}")) {
        	System.out.println("Numero korjattuna on: +358" + loppu);
        	
        }
        if (puhelinnumero.matches("[+]\\d{12}")) {
        	System.out.println("Numerossa ei löytynyt korjattavaa.");
        }
        

	}

}
