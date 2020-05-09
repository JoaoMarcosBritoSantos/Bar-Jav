package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		char sexo;
		int cerveja, refrigerante, espetinhos; 
	
		
		System.out.print("Sexo:");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de Refrigerantes:");
		refrigerante = sc.nextInt();
		System.out.print("Quantidade de Espetinhos:");
		espetinhos = sc.nextInt();
		
		sc.close();
	}

}