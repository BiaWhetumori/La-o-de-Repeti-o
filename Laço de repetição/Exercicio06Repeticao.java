package repeticao;

import java.util.Scanner;

public class Exercicio06Repeticao {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		int i = 0, numero, soma = 0;
		double media = 0.0;
		
		do {
			System.out.println("DIGITE UM NÚMERO: ");
			numero = (int) entrada.nextDouble();
			
			if(numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				i++;				
			}
		}while(numero != 0);
		media = soma / i;
		System.out.println("Impressão da Média: " + media);
		
		
	}
}
