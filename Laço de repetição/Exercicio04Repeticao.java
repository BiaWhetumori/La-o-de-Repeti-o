package repeticao;

public class Exercicio04Repeticao {

	public static void main(String[] args) {
int x = 5, idade, sexo, calm, pcalm=0, homnerv =0, managre=0,outroscalm=0, nervidade=0,calmidade=0;
		
		while(x>=0) {
			
			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println("\"Você é\n Opção 1: Feminino\n Opção 2: Masculino\n Opção 3: Outros ");
			sexo = leia.nextInt();
			System.out.println("Você é\n Opção 1: Calmo(a)\n Opção 2: Nervoso\n Opção 3: Agressivo ");
			calm = leia.nextInt();
			
			x--;
			
			if(calm == 1) {
				pcalm++;
			}else if(calm == 2 && sexo==1) {
				homnerv++;
			}else if(calm == 3 && sexo==2) {
				managre++;
			}else if(calm == 1 && sexo==3) {
				outroscalm++;
			}
		if(idade>40 && calm == 2) {
			nervidade++;
		}else if(idade<18 && calm == 1) {
			calmidade++;
		}
			
			
		}System.out.println("o número de pessoas calmas é: "+pcalm);
		System.out.println("o número de mulheres nervosas é: "+homnerv);
		System.out.println("o número de homens agressivos é: " +managre);
		System.out.println("o número de outros calmos é: " +outroscalm);
		System.out.println("o número de pessoas nervosas com mais de 40 anos é: "+nervidade);
		System.out.println("o número de pessoas calmas com menos de 18 anos é: " +calmidade);
	}
	

}
