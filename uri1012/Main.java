package uri1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double PI = 3.14159;
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double areaTrianguloRetangulo = (A*C) / 2.0;
		double areaCirculo = PI * Math.pow(C, 2);
		double areaTrapezio = ((A + B) * C) / 2.0;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.println("TRIANGULO: " + String.format("%.3f", areaTrianguloRetangulo ));
		System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo ));
		System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio ));
		System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado ));
		System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo ));
	
		input.close();

	}

}