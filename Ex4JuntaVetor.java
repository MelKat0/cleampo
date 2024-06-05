package lpa6;

import java.util.Scanner;

public class Ex4JuntaVetor {

	public static void main(String[] args) {
		//Instanciar a classe Scanner
		Scanner ler = new Scanner(System.in);

		//Variáveis
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];

		//Entrada de dados
		System.out.println("Vetor 1 e 2");
		for (int i=0; i<2; i++) {
			System.out.print("Informe o " + i + "° valor A.. ");
			a[i] = ler.nextInt();

			System.out.print("Informe o " + i + "° valor B.. ");
			b[i] = ler.nextInt();
		//Processamento
			c[i] = a[i];
			c[i+2] = b[i];
		}
		//Saída
		System.out.println("Vetor 3");
		for (int i=0; i<4; i++) {
			System.out.println("O " + i + "° valor é: " + c[i]);
		}
		ler.close();

	}

}
