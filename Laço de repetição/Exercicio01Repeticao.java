package repeticao;

public class Exercicio01Repeticao {

	public static void main(String[] args) throws InterruptedException {
		 for (int num = 1000; num <= 1999; num++) {
		        Thread.sleep(100);

		        if(num % 11 == 5) {
		            System.out.println("O número é: " + num);
		        }
		        }
		    }
		}

 

		

	
