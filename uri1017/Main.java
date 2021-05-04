package uri1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		
		int tempoGastoHora = input.nextInt();
		int velocidadeMedia = input.nextInt();
		
		double litrosGasto =  (double)(tempoGastoHora * velocidadeMedia) / 12;
		
		
		System.out.println(String.format("%.3f", litrosGasto));
		
		
		input.close();
		
	}

}
