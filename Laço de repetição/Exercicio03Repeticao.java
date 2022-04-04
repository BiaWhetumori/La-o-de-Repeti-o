package repeticao;

import java.util.Scanner;

public class Exercicio03Repeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, anos21 = 0, anos50= 0;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			 if(idade <= 21 && idade >=0 ) {
				 anos21++;
			 }
			 else if(idade >=50) {
				 anos50++;
			 }
			 System.out.println("Digite a idade: ");
			 idade = leia.nextInt();
		}
		System.out.println("Jovem"+anos21);
		System.out.println("Idoso"+anos50);
	}
}
