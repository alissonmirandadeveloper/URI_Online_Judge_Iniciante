package uri1019;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int segundos, horas, minutos;
		
		segundos = input.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = ((segundos % 3600) % 60);
		
		
		System.out.println(horas + ":" + minutos + ":" + segundos );
		input.close();
		
	}

}
