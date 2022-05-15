package koe;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Lampotilamuunnin {

	static public double muunnaFahrenheitiksi(double celsius) {
		double fahrenheit = (celsius * 1.8 + 32);
		
		return fahrenheit;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        DecimalFormat desimaalit = new DecimalFormat("0.0");
        double fahrenheit;
        
        System.out.println("Anna lämpötila celsiuksena: ");
        double celsius = input.nextDouble();
        
		fahrenheit = muunnaFahrenheitiksi(celsius);
		System.out.println("Lämpötila Fahrenheitteina on: " + desimaalit.format(fahrenheit));
	}

}
