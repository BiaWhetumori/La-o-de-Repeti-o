package repeticao;

import java.util.Scanner;

public class Exercicio02Repeticao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int par = 0, impar = 0, n= 0;
		
		for(int num = 0; num < 10; num++) {
			System.out.println("Digite um numero: ");
			n = ler.nextInt();
			
			if (n % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println(par+" pares -" + impar+ "impares");

	}

}
