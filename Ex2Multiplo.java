package lpa6;

import java.util.Scanner;

public class Ex2Multiplo {

	public static void main(String[] args) {
		//Instanciar classe scanner
		Scanner ler = new Scanner(System.in);
		
		//Variáveis
		double valor;
		
		//Entrada de dados
		System.out.println("Informe um valor: ");
		valor = ler.nextDouble();
		
		//Processamento
		if (valor % 5 == 0) {
			System.out.println("O número " + valor + " é multiplo de 5");
			System.exit(0);
		} 
		//Saída
		System.out.println("O número " + valor + " não é multiplo de 5");
		ler.close();
	}

}
