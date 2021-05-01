package uri1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double pi =  3.14159;
		double raio = input.nextDouble();
		double esfera;
		
		esfera = (4.0/3) * pi * (Math.pow(raio, 3));
		
		System.out.println("VOLUME = " + String.format("%.3f", esfera));
	
		input.close();

	}

}