package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		char sexo;
		int cerveja, refrigerante, espetinhos; 
		double consumos, couvert, ingresso, total;
	
		
		System.out.print("Sexo:");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.print("Quantidade de Refrigerantes:");
		refrigerante = sc.nextInt();
		System.out.print("Quantidade de Espetinhos:");
		espetinhos = sc.nextInt();
		
		if (sexo == 'F') {
			ingresso = 8.0;
		}
		else {
			ingresso = 10.0;
		}
		
		consumos = cerveja * 5.0 + refrigerante * 3.0 + espetinhos * 7.0;
		
		if (consumos > 30) {
			couvert = 0.0;
		}
		else {
			couvert = 4.0;
		}
		total = ingresso + consumos + couvert;
		
	    System.out.println();
	    System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumos);
	    if (couvert == 0.0) {
	    	System.out.println("Insento de Couvert");
	    }
	    else {
	    	System.out.printf("Couvert = R$ %.2f%n", couvert);
	    }
	    System.out.printf("Ingresso = R$ %.2f%n", ingresso);
	    System.out.println();
	    System.out.printf("Valor a pagar = R$ %.2f%n", total);
	    
		sc.close();
	}

}